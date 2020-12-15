# 1. Musime provest build aplikace
# mvn clean package
# NEBO:
# Na Linuxu:
# docker run -it --rm -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3-openjdk-11-slim mvn clean package -DskipTests
# Na Windows:
# docker run -it --rm -v %CD%:/usr/src/mymaven -w /usr/src/mymaven maven:3-openjdk-11-slim mvn clean package -DskipTests
# 2. Jak vytvorit Docker image:
# docker build --tag myapp .
# 3. Muzeme zkontrolovat vytvorenou image pomoci:
# docker images
# 4. Spusteni kontejneru:
# docker run --rm -it -p 8080:8080 myapp
FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app
COPY target/demo-web-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch app.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
