# 🗺️ API de Estados e Cidades do Brasil

Uma API desenvolvida para listar estados e suas respectivas cidades do Brasil. Ideal para projetos de frontend, estudos de consumo de API, ou qualquer sistema que exija dados geográficos brasileiros.

---

## 🔥 Funcionalidades

- 📋 Listagem de estados
- 🏙️ Listagem de cidades por estado

---

## 🛠️ Tecnologias Utilizadas

- **Java** + **Spring Boot**
- **Spring Web**, **Spring Data JPA**
- **H2 Database**
- **Hibernate**
- **Lombok**

---

## 📦 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/vitorh07/estados-cidades-api.git
```
2. Acesse o diretório do projeto:
```bash
cd estados-cidades-api
```
3. Execute o projeto:
```bash
./mvnw spring-boot:run
```

## 🧪 Endpoints

- **Estados**
  - `GET /api/estados` – Lista todos os estados com suas respectivas cidades.
  - `GET /api/estados/{id}` – Retorna os detalhes de um estado específico pelo ID.

- **Cidades**
  - `GET /api/cidades` – Lista todas as cidades.
  - `GET /api/cidades/{id}` – Retorna os detalhes de uma cidade específica pelo ID.

## 🧙‍♂️ Exemplo de JSON
- Exemplo 1:
```url
http://localhost:8080/api/estados
```

```json
[
  {
    "id": 1,
    "sigla": "AC",
    "nome": "Acre",
    "cidades": [
      {
        "id": 1,
        "nome": "Rio Branco"
      },
      {
        "id": 2,
        "nome": "Cruzeiro do Sul"
      }
    ]
  }
]
```
- Exemplo 2:
```url
http://localhost:8080/api/cidades/5395
```
```json
{
  "id": 5395,
  "nome": "Sorocaba"
}
```



