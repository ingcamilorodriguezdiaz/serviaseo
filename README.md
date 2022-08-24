# App ServiAseo

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Aplicación Back-End con [Spring Boot](http://projects.spring.io/spring-boot/) api rest y Fron-End Angular 9.1.3.

## Requerimientos

Para construir y ejecutar la aplicación necesita:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Motor de base de datos ORACLE 
## Tener en cuenta las siguientes consideraciones:

- Modificar el archivo application.properties con las configuraciones del ambiente desarrollo.
![Captura de pantalla_área-de-selección_20220823202115](https://user-images.githubusercontent.com/103206100/186296766-300b3c4a-0e74-4f1f-a888-a8d10ace6c8c.png)
- Ejecutar el archivo sql con nombre EJECUTAR SCRIPT.txt en su motor de base de datos.
[EJECUTAR SCRIPT.txt](https://github.com/ingcamilorodriguezdiaz/serviaseo/files/9411569/EJECUTAR.SCRIPT.txt)


## Ejecutando aplicación localmente

Hay varias formas de ejecutar una aplicación Spring Boot en su máquina local. Una forma es ejecutar el método `main` que se encuentra en la ruta `com.api.serviaseo ServiaseoApplication` desde su IDE.

Alternativamente, puede usar el [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) asi:

```shell
./mvnw.cmd spring-boot:run
```

## URL LOCAL http://localhost:8201/

## Diagrama Entidad Relación MER
![Captura de pantalla_área-de-selección_20220823202528](https://user-images.githubusercontent.com/103206100/186297218-a8288290-64a0-493b-8dc5-adaff2712671.png)

[MER.pdf](https://github.com/ingcamilorodriguezdiaz/serviaseo/files/9411559/MER.pdf)

## EJECUTAR JAR CAMBIANDO LOS PARAMETROS DE SU CONEXIÓN A LA BASE DE DATOS

java -jar app-facturador.jar --spring.datasource.url=CAMBIAR --spring.datasource.username=CAMBIAR --spring.datasource.password=CAMBIAR


## Copyright

<div>Juan Camilo Rodriguez Diaz</div>
<div>Ingeniero de sistemas y computación</div>
<div>Especialista en base de datos</div>
