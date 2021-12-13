FROM openjdk:11

WORKDIR /java   
COPY . /java            
RUN javac Main.java
CMD ["java", "Main"]