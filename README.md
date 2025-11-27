# ☕ Coffee Delivery API

<p align="center">
  <em>API REST desenvolvida em Spring Boot para gerenciar cafés e pedidos no Coffee Delivery.</em>
</p>

## Sobre o projeto

O **Coffee Delivery API** é o backend do projeto **Coffee Delivery**, responsável por fornecer os dados dos cafés disponíveis e processar os pedidos feitos pelos usuários.

A API foi desenvolvida com **Spring Boot**, **Spring Web** e **Spring Data JPA**, com foco em simplicidade e integração direta com o frontend em React.

## Funcionalidades

`GET /coffees`: retorna a lista de cafés disponíveis.  
`POST /orders`: recebe os dados do pedido (itens, endereço, pagamento) e retorna um status **200 OK**.  

Esses endpoints permitem a comunicação direta com o frontend, simulando o fluxo completo de uma compra online.

## Tecnologias utilizadas

| Categoria | Tecnologias |
|------------|-------------|
| **Linguagem** | Java 21 |
| **Framework** | [Spring Boot 3.5.5](https://spring.io/projects/spring-boot) |
| **Build Tool** | [Maven](https://maven.apache.org/) |
| **Banco de Dados** | [JSONBin]([https://spring.io/projects/spring-data-jpa](https://jsonbin.io/)) |
| **Servidor Web** | Tomcat embutido |
| **Documentação** | OpenAPI |
