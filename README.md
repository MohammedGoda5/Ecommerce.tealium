

# Demo Ecommerce Test Automation Framework

## Overview**

This is a UI Test Automation Framework for testing an e-commerce application. It uses the following technologies:
- Selenium WebDriver for browser automation.
- SHAFT Engine for powerful, simplified test execution.
- Cucumber for Behavior-Driven Development (BDD).
- TestNG for test execution and reporting.

The framework is modular, following the Page Object Model (POM) and BDD design principles for maintainability and scalability.

---

## Tech Stack

- Programming Language: Java
- Frameworks/Tools:
    - Selenium WebDriver
    - SHAFT Engine
    - Cucumber (BDD)
    - TestNG
    - Maven (build tool)
- Test Data Management: JSON Files
- Reports: Allure Reports, TestNG Reports

---

## Project Structure

```
Demo_Ecommerce/
│
├── src/
│   ├── main/
│   │   ├── resources/
│   │   │   ├── dynamicObjectRepository/   # Dynamic objects configuration
│   │   │   ├── features/                  # Cucumber feature files
│   │   │   │   ├── F01_Registration.feature
│   │   │   │   ├── F02_Login.feature
│   │   │   │   └── F03_AddToCart.feature
│   │   │   └── properties/                # Configuration properties
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── pages/                     # Page Object Model classes
│   │   │   │   ├── P01_Register.java
│   │   │   │   ├── P02_Login.java
│   │   │   │   └── P03_AddToCart.java
│   │   │   │
│   │   │   ├── StepDefinition/            # Step Definitions
│   │   │   │   ├── D01_RegisterStepDef.java
│   │   │   │   ├── D02_LoginStepDef.java
│   │   │   │   ├── D03_AddToCart.java
│   │   │   │   └── Hooks.java             # Cucumber Hooks (setup/teardown)
│   │   │   │
│   │   │   ├── TestRunner/                # Test Runner class
│   │   │   │   └── TestRunner.java
│   │   │
│   │   ├── resources/
│   │   │   ├── META-INF.services          # Service configurations
│   │   │   └── testDataFiles/             # External test data
│   │   │       └── TestData.json
│
├── target/                                # Compiled output and reports
├── .gitignore                             # Ignored files
├── generate_allure_report.bat             # Batch script to generate Allure reports
├── pom.xml                                # Maven dependencies and build configuration
└── README.md                              # Project documentation
```

---

## Prerequisites

Ensure the following tools are installed:

- Java JDK 22
- Maven
- IntelliJ IDEA** (or your preferred IDE)
- WebDriver Executables (e.g., ChromeDriver, GeckoDriver)
- Allure (for reporting)

---

## Installation and Setup

1. Clone the Repository:
   ```bash
   git clone https://github.com/MohammedGoda5/Ecommerce.tealium.git
   cd Demo_Ecommerce
   ```

2. Install Dependencies:
   Use Maven to install all required dependencies.
   ```bash
   mvn clean install
   ```

3. Update Configuration:
    - Update `testDataFiles/TestData.json` with required input data.
    - Configure browser drivers in the system path.

---

## Running Tests

### Test Execution

1. Run All Tests:
   Use Maven to run the complete test suite:
   ```bash
   mvn test
   ```

2. Run Specific Feature:
   Use tags in the `TestRunner.java` or directly run specific feature files:
   ```bash
   mvn test -Dcucumber.filter.tags="@Registration"
   ```

3. Run Tests from IDE:
    - Right-click on the `TestRunner.java` class.
    - Select Run.

---

## Generating Reports

### Allure Reports:
1. Execute the test suite and generate Allure results:
   ```bash
   ./generate_allure_report.bat
   ```

2. Serve the Allure report in a browser:
   ```bash
   allure serve target/allure-results
   ```

### TestNG Reports:
- Default TestNG reports are generated under `target/surefire-reports`.

---

## Key Features

1. Behavior-Driven Development (BDD):
    - Gherkin syntax for scenarios (`*.feature` files).
    - Step Definitions bridge feature files and test logic.

2. Page Object Model (POM):
    - Reusable and modular page classes to handle UI actions.

3. Test Data Management:
    - Externalized data in JSON format for better scalability.

4. Hooks:
    - `Hooks.java` manages setup and teardown steps before/after scenarios.

5. Cross-Browser Execution:
    - Easily configurable for Chrome, Firefox, and other browsers.

---

## Contribution Guidelines

Contributions are welcome!
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit and push changes:
   ```bash
   git commit -m "Add feature XYZ"
   git push origin feature/your-feature-name
   ```
4. Open a pull request.

---

## License

This project is licensed under the **MIT License**. See [LICENSE](LICENSE) for more details.

---

## Contact

For any questions or suggestions:
- Email: Mohammed.nabil4004@gmail.com  
- LinkedIn: www.linkedin.com/in/mohamed-nabil-204558252
