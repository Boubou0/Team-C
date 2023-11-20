# Semestrial Work (team C)

This is a middleware architecture project realized during our month-long course in Prague at the Czech Technical University.

### BOUBOU Jean-Philippe & Co

- BO layer (`package entity`)
  - UML class diagram `/doc`
- Repository (`package repository`)
- Service layer (`package service`)
  - Sequence diagram `/doc/sequence-diagrams`
- Controller layer (`package controller`)

  - REST controller

- testy unit kazda trida na service layer a controller layer (`test.java.cvut.fel`) - Prototype: `package dto`
- Springfox (`config.SpringFoxConfig`)
  - Springfox Swagger: http://localhost:8090/swagger-ui/
- Javadoc cele aplikace (složka `/javadoc`)
- mapstruct, convertory, DTO vrstva (`package dto`)
- Actuator: http://localhost:8090/actuator/
- Prometheus : docker run -d --name=prometheus -p 9090:9090 -v ABSOLUTE/PATH/TO/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
  - docker run -d --name=grafana -p 3000:3000 grafana/grafana
  - http://localhost:9090
- Grafana http://localhost:3000/d/GQwFS4k4z/jvm-micrometer?orgId=1&refresh=30s
- BDD http://localhost:8090/h2-console/

## Track List

- [x] Analyze the task and create a class diagram.
- [x] Implement the ORM in Java
- [x] Implement DAO layer and CRUD.
- [x] Describe the following three services using a sequence diagram:
  - getAllUsers
  - addAuthorToArticle
  - getAllAuthorsOfArticleById (id must be unique)
- [x] Implement the services layer, according to sequence diagrams.
- [ ] Test service layer of application:
  - unit tests
- [ ] Create an import.sql file in the resources folder. Create test data here.
- [x] Add actuator
- [x] Add Springfox for generating swagger specification:
- [x] Add javadoc
- [x] Add Micrometer for metrics
- [ ] For DTO layer use mapstruct mapping between BO and DTO:

