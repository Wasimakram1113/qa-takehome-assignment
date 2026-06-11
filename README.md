# qa-takehome-assignment
QA Take-Home Assignment demonstrating manual testing, UI automation, and API testing using Java, Selenium, TestNG, and Rest Assured.

# QA Take-Home Assignment

## Application Chosen

**Application:** OrangeHRM Demo

**URL:** https://opensource-demo.orangehrmlive.com/

I chose OrangeHRM and focused on the **Login module** because authentication is one of the most critical functionalities in any business application. The Login module provides opportunities to test positive, negative, and validation scenarios while demonstrating both manual and automated testing approaches.

## Framework and Language Used

### UI Automation

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)

### API Automation

* Java
* REST Assured
* TestNG
* Maven

For API automation, Reqres.in public APIs were used to demonstrate API testing concepts such as response validation, status code verification, and negative test scenarios.

## Manual Test Cases

Manual test cases were created for the OrangeHRM Login module covering:

* Positive login scenarios
* Invalid credential scenarios
* Empty field validations
* Boundary and validation checks

Location:

```text
test-cases/manual-test-cases.md
```

## UI Automation Coverage

The following Login module scenarios were automated:

1. Valid Login
2. Invalid Login
3. Empty Username and Password Validation

The framework follows the Page Object Model (POM) design pattern with explicit waits and meaningful assertions.

## API Automation Coverage

The following API scenarios were automated using Reqres.in:

1. Create User – Positive Scenario
2. Get User Details – Positive Scenario
3. Invalid Request Handling – Negative Scenario

Validations include:

* Status code verification
* Response body validation
* Response field verification

## How to Run the Tests

### Prerequisites

* Java 17 or above
* Maven
* Eclipse IDE

### Clone Repository

```bash
git clone <repository-url>
```

### Install Dependencies

```bash
mvn clean install
```

### Run All Tests

```bash
mvn test
```

### Run UI Tests

Right-click and select:

```
Run As → Java application
```

### Run API Tests

Run the API test classes directly from Eclipse or execute:

```bash
mvn test
```

## Assumptions and Limitations

* The tests are executed against publicly available demo environments.
* Application behavior may change if the demo environment is updated.
* Only selected scenarios were automated as part of the assignment scope.
* Chrome browser was used for UI test execution.

## Author

Wasim Akram
