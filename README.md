# JanusGraph TinkerPop Java Example

Simple Java example using JanusGraph 0.1.0 and Apache TinkerPop 3.2.3.

## Prerequisites

* Java 8.0 Update 40 or higher
* Apache Maven 3.3.9

## Building and Running

```
mvn clean package
rm -rf ./db/
mvn exec:java -Dexec.mainClass="pluradj.janusgraph.example.JavaExample"
```

## References

* [JanusGraph 0.1.0 Release](https://github.com/JanusGraph/janusgraph/releases/tag/v0.1.0)
* [JanusGraph Getting Started](http://docs.janusgraph.org/0.1.0/getting-started.html)
* [GraphOfTheGodsFactory.java](https://github.com/JanusGraph/janusgraph/blob/v0.1.0/janusgraph-core/src/main/java/org/janusgraph/example/GraphOfTheGodsFactory.java)
* [Apache TinkerPop 3.2.3 Javadocs](http://tinkerpop.apache.org/javadocs/3.2.3/full/)
