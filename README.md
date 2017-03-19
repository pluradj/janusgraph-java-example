# JanusGraph TinkerPop Java Example

Simple Java example using JanusGraph 0.1.0-SNAPSHOT and Apache TinkerPop 3.2.x.

## Prerequisites

* Java 8.0 Update 40 or higher
* Apache Maven 3.3.x

## Building and Running

```
mvn clean package
rm -rf ./db/
mvn exec:java -Dexec.mainClass="pluradj.janusgraph.example.JavaExample"
```

## References

* [JanusGraph Getting Started](http://docs.janusgraph.org/0.1.0-SNAPSHOT/getting-started.html)
* [JanusGraph Snapshot Distribution](https://oss.sonatype.org/content/repositories/snapshots/org/janusgraph/janusgraph-dist/0.1.0-SNAPSHOT/)
* [Apache TinkerPop 3.2.3 Javadocs](http://tinkerpop.apache.org/javadocs/3.2.3/full/)
