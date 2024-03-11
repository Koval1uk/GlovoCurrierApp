# Glovo Courier Service

This project simulates a basic courier service for the Glovo app, incorporating functionality to manage couriers and orders. It matches orders to couriers based on criteria such as distance, special handling requirements (e.g., the need for a box), and priority (VIP and food orders).

## Getting Started

These instructions will guide you to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What you need to install the software:

- Java 11 or newer
- Maven

### Installing

Follow these steps to get a development environment running:

1. Clone the repository:
```
   git clone https://github.com/yourusername/glovo-courier-service.git
```

css
Copy code

2. Navigate to the project directory:
```
   cd glovo-courier-service 
   ```


csharp
Copy code

3. Build the project with Maven:
```
   mvn clean install
```

markdown
Copy code

4. Run the application:
```
   java -jar target/glovo-courier-service-0.0.1-SNAPSHOT.jar
```

arduino
Copy code

## Running the Tests

To run the automated tests for this system:
```
mvn test
```

markdown
Copy code

## API Reference

Available endpoints:

- `GET /couriers` - Retrieve a list of all couriers.
- `GET /orders` - Retrieve a list of all orders.
- `GET /orders/{courierId}` - Retrieve orders available for a specific courier by their ID.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency Management
- [Google Gson](https://github.com/google/gson) - Used to load JSON resources


## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/yourusername/glovo-courier-service/tags).


## License

This project is not under any license, so do whatever you want. GL HF :)

## Acknowledgments

- Hat tip to anyone whose code was used
- Inspiration
- etc