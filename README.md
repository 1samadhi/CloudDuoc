# CloudDuoc

Microservicio de práctica — Actividad "Versionando mi Código" (Cloud, Duoc UC).

## Requisitos

- Java 21
- Maven (o usar el wrapper `./mvnw` incluido)

## Cómo ejecutar

```bash
./mvnw spring-boot:run
```

La aplicación queda disponible en `http://localhost:8080`.

## Endpoints disponibles

### `GET /api/v1`

Saludo básico del microservicio.

**Respuesta ejemplo:**

```
Hola mundo v1.0.0
```

### `POST /api/v1/despedida`

Devuelve un mensaje de despedida.

**Respuesta ejemplo:**

```
Despedida v1.1.1
```

Ver [CHANGELOG.md](CHANGELOG.md) para el detalle de versiones.
