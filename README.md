# API de Usuários

API REST para gerenciamento de usuários, desenvolvida com Spring Boot e MongoDB.

## 🚀 Tecnologias

- Java 17
- Spring Boot 3
- Spring Data MongoDB
- Maven

## 📋 Funcionalidades

- Cadastro de usuários
- Atualização de usuários
- Consulta por ID

## ▶️ Como executar

### Pré-requisitos

- Java 17+
- Maven
- MongoDB rodando localmente na porta `27017`

### Rodando o projeto

```bash
# Clone o repositório
git clone https://github.com/laeciojn/api-usuarios.git

# Acesse a pasta
cd api-usuarios

# Execute
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`

## 🔗 Endpoints

### Criar usuário
```
POST /usuario
Content-Type: application/json

{
  "nome": "Laecio",
  "email": "laecio@email.com"
}
```

### Atualizar usuário
```
PUT /usuario
Content-Type: application/json

{
  "id": "6a08b5a000a23869369b5943",
  "nome": "Laecio Atualizado",
  "email": "laecio@email.com"
}
```

## ⚙️ Configuração

O arquivo `application.yaml` deve conter a configuração do MongoDB:

```yaml
spring:
  data:
    mongodb:
      uri: mongodb://localhost:27017/api-usuarios
```

## 👨‍💻 Autor

Laécio — [github.com/laeciojn](https://github.com/laeciojn)
