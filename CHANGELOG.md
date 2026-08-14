# Changelog

Todos los cambios notables de este proyecto se documentan en este archivo.

El formato sigue [Keep a Changelog](https://keepachangelog.com/es-ES/1.0.0/),
y este proyecto respeta [Semantic Versioning](https://semver.org/lang/es/).

## [1.2.0] - 2026-08-14

### Added

- Dockerfile multi-etapa para construir y ejecutar el microservicio en contenedor (usuario no-root, optimización de memoria JVM).
- `.dockerignore` para excluir archivos innecesarios del contexto de build.

## [1.1.1] - 2026-08-13

### Fixed

- Error ortográfico en la respuesta de `POST /api/v1/despedida`: faltaba la mayúscula inicial (`"despedida v1.1.0"` → `"Despedida v1.1.1"`).

## [1.1.0] - 2026-08-13

### Added

- Endpoint `POST /api/v1/despedida` que devuelve un mensaje de despedida (`despedida v1.1.0`).

## [1.0.0] - 2026-08-13

### Added

- Estructura base del microservicio con Spring Boot.
- Endpoint `GET /api/v1` que devuelve un saludo (`Hola mundo v1.0.0`).
