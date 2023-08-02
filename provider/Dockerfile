FROM openjdk:8-jre
MAINTAINER melo
WORKDIR /
ADD target/provider.jar provider.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar"]
CMD ["provider.jar"]