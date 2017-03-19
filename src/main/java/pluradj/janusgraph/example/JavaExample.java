package pluradj.janusgraph.example;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;
import org.janusgraph.core.attribute.Geo;
import org.janusgraph.core.attribute.Geoshape;
import org.janusgraph.example.GraphOfTheGodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;

public class JavaExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaExample.class);

    public static void main(String[] args) {
        JanusGraph graph = JanusGraphFactory.open("conf/janusgraph-berkeleyje-lucene.properties");
        GraphOfTheGodsFactory.load(graph);
        GraphTraversalSource g = graph.traversal();
        Map saturnProps = g.V().has("name", "saturn").valueMap(true).next(); 
        LOGGER.info(saturnProps.toString());
        List places = g.E().has("place", Geo.geoWithin(Geoshape.circle(37.97, 23.72, 50))).toList();
        LOGGER.info(places.toString());
        System.exit(0);
    }
}
