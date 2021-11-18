FROM openjdk:11
WORKDIR /app
COPY . /app
RUN javac /src*.java
CMD java Main
