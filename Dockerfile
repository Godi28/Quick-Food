FROM openjdk:11
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp
RUN javac *.java
CMD ["java" ,"Main"]
