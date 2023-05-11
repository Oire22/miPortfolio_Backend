FROM amazoncorretto:17

MAINTAINER oliverioMaranesi

COPY target/miPortfolio-0.0.1-SNAPSHOT.jar miPortfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/miPortfolio-0.0.1-SNAPSHOT.jar"]