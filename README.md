# iCET - Demo Spring Boot Application - (02)

This project is a Java Spring Boot application designed for academic purposes as a backend for a food system. It includes functionalities for managing products with a RESTful API. The application connects to a MySQL database to store product information.

## Features

- Add new products
- Retrieve all products
- Retrieve products by category
- Delete products

## Technologies Used

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 17
- Maven
- MySQL

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/food-system-backend.git
    cd food-system-backend
    ```

2. Configure the database:

    Update the `application.yml` file in the `src/main/resources` directory with your MySQL database credentials.

    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/food_crm
        username: root
        password: yourpassword
      jpa:
        hibernate:
          ddl-auto: update
    ```

3. Build the project:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### Add a new product

- **URL:** `/product`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
      "productId": 1,
      "name": "Product Name",
      "description": "Product Description",
      "price": "Product Price",
      "category": "Product Category"
    }
    ```

- **Response:**

    ```json
    {
      "productId": 1,
      "name": "Product Name",
      "description": "Product Description",
      "price": "Product Price",
      "category": "Product Category"
    }
    ```

### Retrieve all products

- **URL:** `/products`
- **Method:** `GET`
- **Response:**

    ```json
    [
      {
        "productId": 1,
        "name": "Product Name",
        "description": "Product Description",
        "price": "Product Price",
        "category": "Product Category"
      }
    ]
    ```

### Retrieve products by category

- **URL:** `/products-by-category/{category}`
- **Method:** `GET`
- **Response:**

    ```json
    [
      {
        "productId": 1,
        "name": "Product Name",
        "description": "Product Description",
        "price": "Product Price",
        "category": "Product Category"
      }
    ]
    ```

### Delete a product

- **URL:** `/product`
- **Method:** `DELETE`
- **Request Parameter:**

    ```json
    {
      "id": 1
    }
    ```

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── edu/icet/demo/
│   │       ├── Main.java
│   │       ├── config/
│   │       │   └── Config.java
│   │       ├── controller/
│   │       │   └── ProductController.java
│   │       ├── entity/
│   │       │   └── ProductEntity.java
│   │       ├── model/
│   │       │   └── Product.java
│   │       ├── repository/
│   │       │   └── ProductRepository.java
│   │       ├── service/
│   │       │   ├── ProductService.java
│   │       │   └── ProductServiceImpl.java
│   └── resources/
│       ├── application.yml
│       └── static/
│       └── templates/
├── test/
│   └── java/
│       └── edu/icet/demo/
│           └── MainTests.java
└── pom.xml
