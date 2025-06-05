# 🧪 Selenium Test Automation Framework

This is a complete **Java Selenium Test Automation Framework** built with **TestNG**, **Page Object Model (POM)**, and **Data-Driven Testing** using **Excel**. The framework is designed for scalable, maintainable, and efficient test execution. It includes tests for login, dashboard, and other key pages of the application.

---

## 📁 Project Structure

MerudataRound2/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── pages/ # Page classes (LoginPage, DashboardPage, etc.)
│ ├── test/
│ │ └── java/
│ │ ├── tests/ # TestNG test classes
│ │ └── listeners/ # Custom TestNG listeners (e.g., screenshot on failure)
│
├── testdata/
│ └── TestData.xlsx # Excel file with login/email/password data
│
├── pom.xml # Maven configuration
└── README.md

markdown
Copy
Edit

---

## 🛠 Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Apache POI** (for Excel interaction)
- **Maven**
- **Allure Reporting**
- **Page Object Model (POM)** design pattern

---

## ✅ Features

- 🔐 **Login Page** automation with Excel-based credentials
- 📊 **Dashboard Page** and other UI components tested
- 📖 **Data-Driven Testing** from Excel file
- 🧱 **POM structure** for better maintainability
- 🧪 **TestNG** for structured test cases
- 📦 **Maven** for build & dependency management
- 📋 **Allure Reports** for rich test reporting
- 📸 **Screenshot capturing** on test failure

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/selenium-framework.git
cd selenium-framework
2. Prerequisites
Java JDK 8 or above (you are using JDK 23)

Maven

ChromeDriver or GeckoDriver (add to PATH)

3. Install Dependencies
bash
Copy
Edit
mvn clean install
🧪 Running the Tests
Run with Maven
bash
Copy
Edit
mvn test
Run specific suite using TestNG XML
bash
Copy
Edit
mvn test -DsuiteXmlFile=testng.xml
📊 Generate Allure Report
bash
Copy
Edit
allure serve allure-results
Note: Ensure JAVA_HOME is correctly set and Allure is installed globally (npm install -g allure-commandline or from official site).

🗂 Test Data Format (Excel)
Path: testdata/TestData.xlsx

TestCase	Email	Password
LoginTC1	user@example.com	pass123
LoginTC2	invalid@example.com	wrongpass

Apache POI is used to fetch the data from Excel for test methods.

🧩 Sample POM Code (Login Page)
java
Copy
Edit
public class LoginPage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "loginBtn")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
📝 Test Example (Using TestNG)
java
Copy
Edit
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return ExcelUtil.readExcel("testdata/TestData.xlsx", "Sheet1");
    }
}
📸 Screenshot on Failure
Listener will capture screenshots on test failure and save it to /screenshots folder.

🛡️ Best Practices Followed
Modular code structure

Data-driven test approach

Centralized configuration

Reusable page classes

Logging and reporting enabled

📮 Contact
Author: Raazik Pasha
LinkedIn: linkedin.com/in/raazikpasha
Email: raazik@example.com

📌 To Do
Integrate CI/CD (GitHub Actions / Jenkins)

Add more test cases for edge flows

Parallel execution with TestNG

yaml
Copy
Edit

---

Would you like me to create a downloadable `README.md` file or continue helping with the framework files like `BaseTest`, `ExcelUtil`, etc.?







