# iCET - Demo Spring Boot Application - (02)

This is a Java Spring Boot application designed for academic purposes, focusing on managing products in a food system.

## Features

- CRUD operations for products via RESTful APIs
- MySQL database integration using Spring Data JPA
- Endpoint examples:
  - POST `/product`: Create a new product
  - GET `/products`: Retrieve all products
  - GET `/products-by-category/{category}`: Retrieve products by category
  - DELETE `/product?id={productId}`: Remove a product by ID

## Technologies Used

- Java 17
- Spring Boot 3.2.5
- MySQL 8.3.0
- Lombok 1.18.32
- Maven

## Getting Started

1. Clone the repository: `git clone <repo_url>`
2. Configure your MySQL database in `src/main/resources/application.yml`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Configuration

- Modify `application.yml` to adjust database settings.
- Uncomment and configure additional dependencies in `Config.java` as needed.
