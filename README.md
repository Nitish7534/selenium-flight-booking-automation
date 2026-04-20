#Selenium Flight Booking Automation

## 📌 Project Overview

This project is a test automation framework developed using Selenium WebDriver and TestNG to automate the flight booking workflow of a web application. It simulates real user actions such as selecting cities, searching for flights, booking tickets, and validating confirmation messages.

The framework is designed using industry best practices like Page Object Model (POM), data-driven testing, and proper synchronization techniques.

---

## 🎯 Objectives

* Automate end-to-end flight booking process
* Validate application functionality across multiple test scenarios
* Improve test reliability using explicit waits
* Capture failure evidence using screenshots

---

## 🧰 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

---

## 📂 Project Structure

```
src/test/java/
   ├── base/          → WebDriver setup and initialization
   ├── pages/         → Page classes (POM design)
   ├── tests/         → Test scripts
   ├── utils/         → Utilities (DataProvider, Screenshot)
```

---

## 🔥 Key Features

* ✅ End-to-End automation (search → select → book → confirm)
* ✅ Data-driven testing using TestNG DataProvider
* ✅ Explicit waits (WebDriverWait) for stable execution
* ✅ Screenshot capture on test failure
* ✅ Reusable and scalable framework design
* ✅ Clean separation of test logic and page objects

---

## 🧪 Test Scenarios Covered

1. Select departure and destination cities
2. Search available flights
3. Choose a flight
4. Enter passenger details
5. Complete booking
6. Validate confirmation message

---

## 📊 Test Execution

* Tests are executed using TestNG
* DataProvider runs tests with multiple city combinations
* Results are generated in TestNG reports

---

## 📸 Screenshot on Failure

If a test fails, a screenshot is automatically captured and stored in:

```
screenshots/
```

This helps in debugging and failure analysis.

---

## 📁 Test Reports

TestNG automatically generates execution reports in:

```
test-output/index.html
```

The report includes:

* Passed/Failed test cases
* Execution summary
* Detailed logs

---

## ▶️ How to Run the Project

1. Clone the repository:

```
git clone https://github.com/Nitish7534/selenium-flight-booking-automation.git
```

2. Open in Eclipse or IntelliJ

3. Update Maven dependencies:

```
Right click project → Maven → Update Project
```

4. Run the test:

* Right click `testng.xml`
* Click **Run As → TestNG Suite**

---

## 💡 Key Highlights

* Implemented Page Object Model for better maintainability
* Used explicit waits instead of Thread.sleep for reliable execution
* Designed data-driven test cases using TestNG DataProvider
* Integrated screenshot capture for failure debugging

---

## 🚀 Future Enhancements

* Add Extent Reports for advanced reporting
* Integrate CI/CD (Jenkins or GitHub Actions)
* Add cross-browser testing
* Implement TestNG Listeners

---

## 👨‍💻 Author

**Nitish**
