# IN2033-Team-One-Box-Office

The project is organized as follows:

```
IN2033-Team-One-Box-office/
├── .idea/                  # IntelliJ IDEA project files
├── src/                    # Source code
│   ├── main/               # Main application code
│   │   ├── java/           # Java source files
│   │   │   └── com.teamoneboxoffice/
│   │   │       ├── controllers/       # Controller classes
│   │   │       ├── interfaces/        # Interfaces
│   │   │       ├── services/          # Interface implementations
│   │   │       └── Main.java          # Main application entry point
│   │   └── resources/     # Resource files
│   │       ├── images/    # Image assets
│   │       ├── scenes/    # FXML files for UI
│   │       └── styles/    # CSS stylesheets
│   └── test/              # Test code
│       └── java/
│           └── com.teamoneboxoffice/
│               └── TempFileTest.java  # Example Test class
├── target/                # Compiled output
├── .gitignore             # Git ignore file
├── pom.xml                # Maven build configuration
├── README.md              # Project documentation (this file)
└── Team-One-Box-Office.iml # IntelliJ module file
```

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 21 or later.
- **Apache Maven**: For building and managing dependencies.
- **JavaFX**: Ensure JavaFX is properly configured in your environment.

## Setting Up the Project

### Clone the Repository

```bash
git clone https://github.com/ptch05/IN2033-Team-One-Box-office.git
cd IN2033-Team-One-Box-office
```

### Install Dependencies

Run the following command to download and install all dependencies:

```bash
mvn clean install
```

## Running the Application

### Using Maven

To run the application using Maven, execute the following command:

```bash
mvn clean javafx:run
```

### Using an IDE (IntelliJ IDEA)

1. Open the project in **IntelliJ IDEA**.
2. Navigate to `src/main/java/com/teamoneboxoffice/Main.java`.
3. Right-click on `Main.java` and select **Run 'Main.main()'**.

## Navigating the Code

- **Controllers**: The `controllers` package contains the `LoginController`, which handles the logic for the login form.
- **Interfaces**: The `interfaces` package defines the `Insert` interfaces.
- **Services**: The `services` package contains the `InsertImpl` classes, which implements the `Insert` interfaces.
- **Resources**: The `resources` folder contains FXML files for the UI, CSS stylesheets, and image assets.
- **Tests**: The `test` folder contains unit tests, such as `TempFileTest.java`.

