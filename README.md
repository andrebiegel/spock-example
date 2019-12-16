[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/spockframework/spock/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/spockframework/spock-example/master.svg?label=Build)](https://travis-ci.org/spockframework/spock-example)
[![Gitter](https://badges.gitter.im/spockframework/spock.svg)](https://gitter.im/spockframework/spock?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Spock Framework Example Project
===============================

The purpose of this project is to help you get started with Spock. The project includes several example specifications and build scripts for Ant, Gradle, and Maven. It also makes it easy to create an Eclipse or IDEA project, allowing you to run the example specs from within your IDE.

All three builds (Ant, Gradle, Maven) will automatically download all required dependencies, compile the project, and finally run the example specs. The Gradle build goes one step further by bootstrapping itself, alleviating the need to have a build tool preinstalled.

Prerequisites
-------------
- JDK 7 or higher
- Maven use `mvn` 

Building with Maven
-------------------
Type:

    mvn clean test

Downloaded files will be stored in the local Maven repository (typically *user_home*`/.m2/repository`).


Further Resources
-----------------

* [Spock homepage](http://spockframework.org)
* [Spock web console](https://meetspock.appspot.com)
* [Main documentation](http://docs.spockframework.org/)
* [User discussion group](http://forum.spockframework.org)
* [Dev discussion group](http://dev.forum.spockframework.org)
* [Issue tracker](http://issues.spockframework.org)
* [Build server](http://builds.spockframework.org)
* [Spock blog](http://blog.spockframework.org)
* [Spock on Twitter](https://twitter.com/spockframework)
* [Ant homepage](http://ant.apache.org)
* [Gradle homepage](http://www.gradle.org)
* [Groovy homepage](http://groovy-lang.org/)
* [Maven homepage](http://maven.apache.org)

If you have any comments or questions, please direct them to the Spock discussion group. All feedback is appreciated!

Happy spec'ing!
Peter Niederwieser
Creator, Spock Framework

