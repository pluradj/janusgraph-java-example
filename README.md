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
