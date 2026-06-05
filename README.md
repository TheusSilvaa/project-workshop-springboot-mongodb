
# 🍃 API RESTful com Spring Boot e MongoDB

## 💻 Sobre o projeto
Este é um Web Service RESTful desenvolvido em Java com **Spring Boot** e banco de dados NoSQL **MongoDB**. O projeto simula o domínio de um "Blog", gerenciando Usuários, Posts e Comentários.

O foco principal deste projeto é entender a diferença do paradigma relacional para o NoSQL, além de aplicar boas práticas de desenvolvimento backend, como arquitetura em camadas e o padrão DTO.

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Spring Boot** (Web, Data MongoDB)
- **MongoDB** (Banco de dados NoSQL)
- **Maven** (Gerenciamento de dependências)
- **Postman** (Para testes da API)

## 🧠 Conceitos e Boas Práticas Aplicadas
- **Arquitetura em Camadas:** Controladores (Resource), Serviços (Service) e Repositórios (Repository).
- **Padrão DTO (Data Transfer Object):** Utilizado para retornar apenas os dados necessários nas requisições, evitando vazamento de informações sensíveis ou loop infinito nas associações.
- **Tratamento de Exceções:** Uso de `@ControllerAdvice` para capturar erros e retornar respostas HTTP adequadas (ex: `404 Not Found`).
- **Associações NoSQL:** Entendimento prático de quando usar documentos aninhados (Embedded Documents) versus referências.

## 🚀 Como executar o projeto

Certifique-se de ter o **Java**, **Maven** e o **MongoDB** (rodando localmente ou via MongoDB Atlas) instalados.

```bash
# Clone este repositório
$ git clone [https://github.com/TheusSilvaa/project-workshop-springboot-mongodb.git](https://github.com/TheusSilvaa/project-workshop-springboot-mongodb.git)

# Acesse a pasta do projeto
$ cd project-workshop-springboot-mongodb

# Instale as dependências
$ mvn clean install

# Execute a aplicação
$ mvn spring-boot:run
