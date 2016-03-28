#springboot-demo

## Create a war

    ./gradlew build

war file will be at build/libs/sbdemo-0.0.1-SNAPSHOT.war

You can copy the .war to an app server.

War can be run standalone as well:

    java -jar build/libs/sbdemo-0.0.1-SNAPSHOT.war

## Run Standalone (without creating war - uses embedded tomcat)

    ./gradlew bootRun

App will be on http://localhost:8080 by default

