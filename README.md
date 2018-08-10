# JanusGraph TinkerPop Java Example

Simple Java example using JanusGraph 0.3.0 and Apache TinkerPop 3.3.3.

## Build Environment

* Java 8.0 Update 181
* Apache Maven 3.5.4

## Building and Running

```
mvn clean package
rm -rf ./db/
mvn exec:java -Dexec.mainClass="pluradj.janusgraph.example.JavaExample"
```

## References

* [JanusGraph 0.3.0 Release](https://github.com/JanusGraph/janusgraph/releases/tag/v0.3.0)
* [JanusGraph Getting Started](https://docs.janusgraph.org/0.3.0/getting-started.html)
* [GraphOfTheGodsFactory.java](https://github.com/JanusGraph/janusgraph/blob/v0.3.0/janusgraph-core/src/main/java/org/janusgraph/example/GraphOfTheGodsFactory.java)
* [Apache TinkerPop 3.3.3 Javadocs](https://tinkerpop.apache.org/javadocs/3.3.3/full/)
