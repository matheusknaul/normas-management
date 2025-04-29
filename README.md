# Normas management

Projeto para verificação de normas técnicas

## Índice

- [API] (#-api)


---

## API

### 1.0 Endpoints:

- 1.1 (POST) /api/normas: 

```json
{
    "id":3,
    "tag":"ABNT",
    "number":"5537",
    "description":"Gestão de qualidade para laboratórios",
    "verificationDate": "10/01/2021",
    "versionDate":"28/02/2002",
    "grupo": {
        "id":2,
        "title":"rapid",
        "description":"aaaaaaaaaaaaaaaaa"
    }
}
```

Criação de norma.

- 1.2 (GET) /api/normas:

Retorna todas as normas cadastradas