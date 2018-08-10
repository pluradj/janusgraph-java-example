package pluradj.janusgraph.example;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.janusgraph.core.Cardinality;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;
import org.janusgraph.core.PropertyKey;
import org.janusgraph.core.VertexLabel;
import org.janusgraph.core.schema.JanusGraphManagement;
import org.janusgraph.core.schema.PropertyKeyMaker;
import org.janusgraph.core.schema.VertexLabelMaker;
import org.janusgraph.graphdb.database.management.ManagementSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaExample.class);

    public static void main(String[] args) {
        JanusGraph janusGraph = JanusGraphFactory.open("conf/janusgraph-cassandra.properties");

        JanusGraphManagement graphManagement = janusGraph.openManagement();
        VertexLabelMaker vertexLabelMaker = graphManagement.makeVertexLabel("user");
        vertexLabelMaker.make();
        PropertyKeyMaker propertyKeyMaker = graphManagement.makePropertyKey("user_id");
        propertyKeyMaker.dataType(Long.class).cardinality(Cardinality.SINGLE).make();
        graphManagement.commit();

        graphManagement = janusGraph.openManagement();
        PropertyKey userId = graphManagement.getPropertyKey("user_id");
        VertexLabel vertexLabel = graphManagement.getVertexLabel("user");
        graphManagement.buildIndex("my_id_index", Vertex.class).addKey(userId).indexOnly(vertexLabel).buildCompositeIndex();
        graphManagement.commit();

        try {
            ManagementSystem.awaitGraphIndexStatus(janusGraph, "my_id_index").call();
        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage(), e);
        }

        janusGraph.close();
        System.exit(0);
    }
}
