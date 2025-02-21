# IN2033-Team-One-Box-Office

## Project Overview
This is our Team1 Box Office code. It's JavaFX-based application developed using Java 21 and Apache Maven, using Scene Builder to help create the UI.

## Project Structure
```
IN2033-Team-One-Box-office/
├── .github/                # GitHub Actions workflows (CI/CD)
│   └── workflows/
│       └── maven-build.yaml
├── .mvn/                   # Maven wrapper
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── src/                    # Source code
│   ├── main/               # Main application code
│   │   ├── java/           # Java source files
│   │   │   └── com.teamoneboxoffice/
│   │   │       ├── controllers/       # Controller classes
│   │   │       ├── interfaces/        # Interfaces
│   │   │       ├── services/          # Implementations of interfaces
│   │   │       └── Main.java          # Application entry point
│   │   └── resources/     # Resource files
│   │       ├── images/    # Image assets
│   │       ├── scenes/    # FXML UI files
│   │       └── styles/    # CSS stylesheets
│   └── test/              # Test cases
│       └── java/
│           └── com.teamoneboxoffice/
│               └── TempFileTest.java  # Example test class
├── .gitignore              # Git ignore file
├── pom.xml                 # Maven build configuration
├── README.md               # Project documentation (this file)
```

## Prerequisites
Before running the project, ensure you have the following installed:
- **Java Development Kit (JDK):** Version 21 or later.
- **Apache Maven:** For building and managing dependencies.
- **JavaFX:** Ensure JavaFX is properly configured in your environment.

## Setting Up the Project
### Clone the Repository
```sh
git clone https://github.com/ptch05/IN2033-Team-One-Box-office.git
cd IN2033-Team-One-Box-office
```

### Install Dependencies
Run the following command to download and install all dependencies:
```sh
mvn clean install
```

## Running the Application
### Using Maven
To run the application using Maven, execute the following command:
```sh
mvn clean javafx:run
```

### Using IntelliJ IDEA
1. Open the project in **IntelliJ IDEA**.
2. Navigate to `src/main/java/com.teamoneboxoffice/Main.java`.
3. Right-click on `Main.java` and select **Run 'Main.main()'**.

## CI/CD Pipeline
This project includes a **GitHub Actions** workflow (`.github/workflows/maven-build.yaml`) for Continuous Integration.
### Workflow Steps:
- Checkout repository
- Set up JDK 21
- Cache Maven dependencies
- Build and test using Maven
- Run JavaFX application (headless mode recommended for CI)

## Navigating the Code
- **Controllers:** Manage UI interactions (e.g., `LoginController` handles login logic).
- **Interfaces:** Define service contracts.
- **Services:** Contain business logic implementations.
- **Resources:** Includes FXML layouts, CSS stylesheets, and images.
- **Test:** Contains unit tests.
