# microservicios-futfem-matchdayplayerslocal

`microservicios-futfem-matchdayplayerslocal` manages the players associated with the home side in a matchday context. In the Tikitakas backend, this service exists to represent the local team lineup and related records independently from the rest of the player catalog, which keeps matchday-specific workflows separated from generic player management.

The repository is implemented with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. Like the rest of the domain services, it depends on `microservicios-common` for shared CRUD infrastructure and integrates with Eureka for service discovery. External traffic is intended to enter through the gateway, not directly against the container.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/matchdayplayerslocal/**`

The service is packaged as a Docker image in CI and can be deployed with the rest of the stack through Docker Compose. In `v0.1.0`, its Swagger configuration is aligned with the gateway, so the generated API documentation and the "Try it out" actions use the public route instead of an internal host or ephemeral port.

This repository is especially useful when matchday data has to evolve independently from the core player entity model.
