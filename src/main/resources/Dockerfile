FROM openjdk:8-oraclelinux7
VOLUME /tmp
ENV TIME_ZONE=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo $TIME_ZONE > /etc/timezone
COPY demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar.jar"]
EXPOSE 8088