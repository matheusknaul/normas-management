# Normas management

Projeto para verificação de normas técnicas

## Índice

- [API] (#api)

---

## API

### 1.0 Endpoints:

- (POST) /api/normas: 

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