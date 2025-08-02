# Spring Boot REST API – Max Submitted Time (In-Memory)

✅ Simple Spring Boot project to get the record with max submitted time per `ENCOUNTER_ID`.

## 🚀 Run locally

```bash
cd springboot-max-submitted-time
./mvnw spring-boot:run
```

## 📦 REST API

| Method | Endpoint                                  | Description                              |
| ----- | ------------------------------------------ | ---------------------------------------- |
| GET   | `/api/encounters/max-submitted`            | Get max submitted time per ENCOUNTER_ID |

## 🐳 Docker

```bash
docker build -t springboot-max-time-app .
docker run -p 8080:8080 springboot-max-time-app
```