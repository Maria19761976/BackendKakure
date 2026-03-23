# BackendKakure

A Java console application for managing an anime movie database. Built with a layered MVC architecture and MySQL persistence.

## Requirements

- Java 17+
- Maven
- MySQL running on `localhost:3306`

## Database setup

Create the database and table before running the application:

```sql
CREATE DATABASE kakureanime;

USE kakureanime;

CREATE TABLE movies (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    title    VARCHAR(255)   NOT NULL,
    year     INT            NOT NULL,
    duration INT            NOT NULL,
    genre    VARCHAR(100),
    studio   VARCHAR(100),
    rating   DOUBLE,
    poster   VARCHAR(500),
    synopsis TEXT
);
```

<img width="1029" height="611" alt="image" src="https://github.com/user-attachments/assets/70001422-bbac-430a-8bda-a0c3048daf73" />


The application connects with user `root` and password `root`. Change these in `DatabaseConnection.java` if needed.

## Run

```bash
mvn compile exec:java -Dexec.mainClass="org.factoria.Main"
```

Or run `Main.java` directly from your IDE.

## Features

| Option | Description          |
|--------|----------------------|
| 1      | Add a movie          |
| 2      | List all movies      |
| 3      | Search movie by ID   |
| 0      | Exit                 |

## Project structure

```
src/org/factoria/
├── Main.java                          # Entry point, menu loop
├── config/
│   └── DatabaseConnection.java        # Singleton MySQL connection
├── model/
│   └── Movie.java                     # Movie entity
├── controller/
│   └── MovieController.java           # Business logic
├── repository/
│   ├── MovieRepository.java           # CRUD interface
│   └── MovieRepositoryImpl.java       # JDBC implementation
└── view/
    └── MovieView.java                 # Console UI
```

## Dependencies

| Dependency          | Version |
|---------------------|---------|
| mysql-connector-j   | 8.3.0   |
