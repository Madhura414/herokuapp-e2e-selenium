
# Selenium E2E Automation Framework

## Overview
This project contains end-to-end browser automation tests using Java, Selenium WebDriver, TestNG, and Maven.

The tests use [The Internet](https://the-internet.herokuapp.com/) application to verify basic browser automation functionality.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Google Chrome
- Git and GitHub

## Project Structure

```text
selenium-e2e/
├── src/
│   ├── main/java/com/selenium/
│   │   └── App.java
│   └── test/java/com/selenium/
│       ├── AppTest.java
│       └── FirstSeleniumTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Prerequisites
- Java JDK
- Apache Maven
- Google Chrome
- Git

## How to Run

Clone the repository:

```bash
git clone https://github.com/Madhura414/herokuapp-e2e-selenium.git
```

Navigate into the cloned folder:

```bash
cd herokuapp-e2e-selenium
```

Run all tests:

```bash
mvn clean test
```

Run only the Selenium test:

```bash
mvn -Dtest=FirstSeleniumTest test
```

## Current Test Coverage
- Launch Chrome browser
- Navigate to The Internet application
- Verify the page title
- Close the browser after execution

## Future Improvements
- Implement the Page Object Model (POM)
- Add more end-to-end test scenarios
- Improve reusable test utilities
- Generate test reports
- Integrate tests with a CI/CD pipeline

## Author
Madhura K.S.

