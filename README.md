# Sample JSTL application (node.js)

This project is simple webb app which demonetrates how to use JSTL.

## Getting Started

### Prerequisites
* Git
* Java 8
* Maven 3+


### Clone
To get started you can simply clone this repository using git:
```
git clone https://github.com/KalpaD/JSTL.git 
cd JSTL
```

### Swagger definition
This is also located at root level as yml file `pfm_api_doc`.

### Configuration
In order to get the pfm services working you have set up following:

### Build an executable JAR
You can build the war from the command line using:
```
mvn clean package
```
Or 
```
mvn clean install
```
Then you can copy the JSTL.war file to TOMCAT_HOME/webapps
```
Do a GET to http://localhost:8080/JSTL/customers


