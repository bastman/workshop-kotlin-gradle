# workshop-kotlin-gradle
workshop gradle --dsl kotlin

## lesson 01 - basic gradle dsl=groovy

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
 $ gradle init
 
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
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */
 
```

## task: gradle wrapper

```
# download + install gradlew into project

$ gradle wrapper

# use the wrapper

$ ./gradlew --help
$ ./gradlew tasks

```