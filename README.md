# workshop-kotlin-gradle
workshop gradle --dsl kotlin

## lessons

- check the branches

## getting started

### gradle: install / update gradle on osx

- goal: gradle version should >= 4.9

```
 $ gradle --version
 
 # install gradle 
 $ brew install gradle
 
 # upgrade gradle
 $ brew upgrade gradle
 
```

### gradle: list tasks
```
 $ gradle tasks
 
```

```
    ------------------------------------------------------------
    All tasks runnable from root project
    ------------------------------------------------------------
    
    Build Setup tasks
    -----------------
    init - Initializes a new Gradle build.
    wrapper - Generates Gradle wrapper files.
    
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

```
## docs

### gradle plugin: init
- https://docs.gradle.org/4.9/userguide/build_init_plugin.html
- https://guides.gradle.org/creating-new-gradle-builds/

- https://guides.gradle.org/creating-multi-project-builds/
- https://docs.gradle.org/current/userguide/multi_project_builds.html
- https://guides.gradle.org/building-kotlin-jvm-libraries/