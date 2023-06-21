# Department Store API
The Department Store API is a sample application built with Spring Boot that provides a RESTful API for managing department store operations. This API allows users to perform various actions related to department management, such as creating departments, adding products, managing inventory, and processing orders.

## Features
The Department Store API offers the following key features:

- Department Management: Users can create new departments, retrieve department details, update department information, and delete departments.
- Product Management: Products can be added to departments, and their details (name, price, quantity) can be managed.
- Inventory Management: Users can track inventory levels for each product, including stock availability and quantity.
- Order Processing: Orders can be placed, and the API handles order validation, inventory updates, and order fulfillment.

## Technology Stack
The Department Store API is built using the following technologies:

- Spring Boot: A powerful Java framework that simplifies the development of Java applications, providing features such as auto-configuration, embedded servers, and production-ready defaults.
- Spring Data JPA: A part of the Spring Data project that simplifies database operations by providing easy-to-use abstractions for working with databases.
- Hibernate: An object-relational mapping (ORM) framework that integrates with Spring Data JPA to handle the mapping between Java objects and relational database tables.
- Spring Web: A module of the Spring framework that provides features for building web applications, including RESTful APIs.
- H2 Database: An in-memory database used for local development and testing purposes.
- JUnit: A unit testing framework for Java that provides annotations and assertions for writing and running tests.
- Swagger: A tool for designing, building, and documenting RESTful APIs.

## Running the Application
To run the Spring Boot application, use the following command in the project's root directory:

```shell
mvn spring-boot:run
```

The application will start and be accessible at http://localhost:8080.

## Endpoints
The application exposes various endpoints for interacting with the application's functionality. 
The available endpoints are available at the [Documentation](#todo:not-available-yet).

## Contributing
Contributions to the project are welcome. If you find any issues or want to suggest improvements, please open an issue or submit a pull request.

## License
The application is released under the MIT License, which allows you to use, modify, and distribute the code for both commercial and non-commercial purposes. See the LICENSE file for more details.