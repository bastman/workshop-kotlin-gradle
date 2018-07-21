# workshop-kotlin-gradle
workshop gradle --dsl kotlin

## lesson 03 - lesson-03-java-application-groovy

- see: https://docs.gradle.org/4.9/userguide/build_init_plugin.html

  
    
### generate project skeleton

```
 # generate project skeleton (built-init-type="basic" dsl="groovy)
 
 $ gradle init --type=<built-init-type> --dsl=<dsl>
 
```

```
built-init-type(s): 
    - basic (DEFAULT)
    - pom, 
    - java-library, java-application
    - scala-library, scala-application
    - groovy-library, groovy-application
    
dsl(s):
    - groovy (default)
    - kotlin    
```  


# generate project skeleton (built-init-type="basic" dsl="groovy)
``` 
 $ gradle init --type=java-application --dsl=groovy
 
```

```
 
 $ cat settings.gradle
 
```

```

/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user guide at https://docs.gradle.org/4.9/userguide/multi_project_builds.html
 */

rootProject.name = 'workshop-kotlin-gradle'
 
```

```
 
 $ cat build.gradle
 
```

```
/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * user guide available at https://docs.gradle.org/4.9/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    id 'java'

    // Apply the application plugin to add support for building an application
    id 'application'
}

// Define the main class for the application
mainClassName = 'App'

dependencies {
    // This dependency is found on compile classpath of this component and consumers.
    compile 'com.google.guava:guava:23.0'

    // Use JUnit test framework
    testCompile 'junit:junit:4.12'
}

// In this section you declare where to find the dependencies of your project
repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}
 
```

## Java App Skeleton
```
$ cat src/main/java/App.java
```

```

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

```

## task: gradle wrapper

```

# use the wrapper

$ ./gradlew --help

```

## task: list tasks

```
$ ./gradlew tasks
```

```

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Application tasks
-----------------
run - Runs this project as a JVM application

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Distribution tasks
------------------
assembleDist - Assembles the main distributions
distTar - Bundles the project as a distribution.
distZip - Bundles the project as a distribution.
installDist - Installs the project as a distribution as-is.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'workshop-kotlin-gradle'.
components - Displays the components produced by root project 'workshop-kotlin-gradle'. [incubating]
dependencies - Displays all dependencies declared in root project 'workshop-kotlin-gradle'.
dependencyInsight - Displays the insight into a specific dependency in root project 'workshop-kotlin-gradle'.
dependentComponents - Displays the dependent components of components in root project 'workshop-kotlin-gradle'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'workshop-kotlin-gradle'. [incubating]
projects - Displays the sub-projects of root project 'workshop-kotlin-gradle'.
properties - Displays the properties of root project 'workshop-kotlin-gradle'.
tasks - Displays the tasks runnable from root project 'workshop-kotlin-gradle'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

To see all tasks and more detail, run gradlew tasks --all

To see more detail about a task, run gradlew help --task <task>

BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed

```

## task: clean build test
```
# usage:
$ ./gradlew <task1> <task2> <task3> -x<ignore-task-foo>
```

```
examples:

$ ./gradlew clean
$ ./gradlew build
$ ./gradlew clean test
$ ./gradlew clean build -x test
```

```
# the full build ...
$ ./gradlew clean build

# the build result (artifacts)

$ ls -la build/libs
$ ls -la build/distributions
$ ls -la build/test-results/test/
$ ls -la build/reports/tests/test

```

```
# build and run 

$ ./gradlew run

> Task :run
Hello world.
```
