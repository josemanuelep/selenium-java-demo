# Selenium demo with Java and Gradle 

## What's selenium?

Selenium is an umbrella project for a range of tools and libraries that enable and support the automation of web browsers, It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification that lets you write interchangeable code for all major web browsers.

**This project is made possible by volunteer contributors who have put in thousands of hours of their own time, and made the source code freely available for anyone to use, enjoy, and improve.**

## Selenium components

1. WebDriver : If you are beginning with desktop website or mobile website test automation, then you are going to be using WebDriver APIs. WebDriver uses browser automation APIs provided by browser vendors to control the browser and run tests

  - WebDriver is designed as a simple and more concise programming interface.

  - WebDriver is a compact object-oriented API.

  - It drives the browser effectively.

2. Selenium IDE : Open source record and playback test automation for the web

3. Selenium grid: Selenium Grid allows you to run test cases in different machines across different platforms. The control of triggering the test cases is on the local end, and when the test cases are triggered, they are automatically executed by the remote end.

  It's very usefull to:
  
 - To run your tests in parallel, against different browser types, browser versions, operating systems
 - To reduce the time needed to execute a test suite
 
 ## Selenium webdriver : 
 
 WebDriver is an API and protocol that defines a language-neutral interface for controlling the behaviour of web browsers.
 
### Staring from scratch with selenium and gradle over java 

1. Create Project Structure with Gradle

![image](https://user-images.githubusercontent.com/8729953/193305991-0701980b-6682-4fea-b096-c6394dceef55.png)

2. Install selenium library with gradle 

<code>dependencies {
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.4.0'
</code>

3. Three Ways to Use Drivers: 

3.1  Driver Management Software: Most machines automatically update the browser, but the driver does not. To make sure you get the correct driver for your browser, there are many third party libraries to assist you. 

* Include dependency into gradle file

// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
<code>implementation group: 'io.github.bonigarcia', name: 'webdrivermanager', version: '5.3.0'</code>

<code>

class ChromeTest {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        // Your test logic here
    }

}

</code>



 
 
 
 
 
