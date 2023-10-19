FROM openjdk

MAINTAINER jeevan

WORKDIR /app

COPY target/phone-book.jar /app/phone-book.jar

ENTRYPOINT ["java", "-jar", "phone-book.jar"]