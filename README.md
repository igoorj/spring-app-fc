
### Comando para buildar o projeto e subir no SonarQube

#### Deve ser executado sempre que quisermos analisar a qualidade do que foi feito no código

- mvn clean verify sonar:sonar -Dsonar.projectKey=spring-project -Dsonar.projectName='spring-project' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_9fc24fdb8ba73f8b50abf7cf1969857f6d43c755