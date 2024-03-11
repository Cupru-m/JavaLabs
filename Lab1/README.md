# Book library Application

This repository contains a simple REST API application that converts currency.

## Introduction

This is a basic REST API application built using [Spring Boot](https://spring.io/projects/spring-boot) framework. The application allows users to get books infofmation from database.

## Features

 HEAD
- Get currency conversionHistory with updated rates.
- Store conversionHistory data in a database.
=======
-Get info about all books in database
-Finde info by title

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot): Web framework for building the REST API.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Data access framework for interacting with the database.

### Endpoints

- **Get book info:**

  Example:
  ```http
  GET /books
  GET /books?title=Lord of the rings
  ```

## Contributing

Contributions are welcome! If you find any issues or have improvements to suggest, feel free to open an issue or create a pull request.
