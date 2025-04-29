# Normas Management

Projeto para verificação de normas técnicas

## Índice

- [API](#api)
  - [Normas](#11-normas)
    - [Criação de normas](#111-criação-de-normas)
    - [Visualização de normas cadastradas](#112-visualização-de-normas-cadastradas)
    - [Visualização de uma norma específica](#113-visualização-de-uma-norma-específica)

---

## API

### 1.0 Endpoints:

---

#### 1.1 Normas

##### 1.1.1 Criação de normas

(POST) `/api/normas`:

```json
{
    "id": 3,
    "tag": "ABNT",
    "number": "5537",
    "description": "Gestão de qualidade para laboratórios",
    "verificationDate": "10/01/2021",
    "versionDate": "28/02/2002",
    "grupo": {
        "id": 2,
        "title": "rapid",
        "description": "aaaaaaaaaaaaaaaaa"
    }
}

```

- ##### 1.1.2 Visualização de normas cadastradas

 (GET) /api/normas: 

Retorna todas as normas cadastradas.

- ##### 1.1.3 Visualização de uma norma específica

 (GET) /api/normas/{id}: 

 Retorna a norma especificada pelo o "id".

 ---

#### 1.2 Grupos

##### 1.2.1 Criação de normas


 ---

#### 1.3 Scrape

##### 1.3.1 Verificando a versão da norma

(GET) /scrape/{id} 

Retorna true se caso a versão for a mesma, false se estiver desatualizada.