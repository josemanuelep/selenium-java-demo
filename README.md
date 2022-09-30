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

1. **Create Project Structure with Gradle**

![image](https://user-images.githubusercontent.com/8729953/193305991-0701980b-6682-4fea-b096-c6394dceef55.png)

2. **Install selenium library with gradle**

<code>dependencies {
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.4.0'
</code>

3. **Three Ways to Use Drivers:**

  3.1  [Driver Management Software](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager) : Most machines automatically update the           browser, but the driver does not. To make sure you get the correct driver for your browser, there are many third party libraries to assist you. 

    * Include dependency into gradle file

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

  3.2 The PATH Environment Variable : This option first requires manually downloading the driver

    echo 'export PATH=$PATH:/path/to/driver' >> ~/.bash_profile
    source ~/.bash_profile
    
  3.3 Hard Coded Location :Similar to Option 2 above, you need to manually download the driver
  
    System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
    ChromeDriver driver = new ChromeDriver();


4. **Browser Options**

<ol>
  <li>browserName</li>
  <li>browserVersion</li>
  <li>pageLoadStrategy
  <ol>
  <li>normal : Used by default, waits for all resources to download</li>
  <li>eager: DOM access is ready, but other resources like images may still be loading </li>
  </li>
</ol>

5. **Waits**

An example could be that the user instructs the browser to navigate to a page, then gets a no such element error when trying to find an element.

5.1 Explicit wait : Explicit waits are available to Selenium clients for imperative, procedural languages. They allow your code to halt program execution, or freeze the thread, until the condition you pass it resolves.

![image](https://user-images.githubusercontent.com/8729953/193310714-8dc1798d-a7e5-4c59-ba81-cad902835f3c.png)

### Expected conditions

* alert is present
* element exists
* element is visible
* title contains
* title is
* element staleness
* visible text

5.2 Implicit wait:  There is a second type of wait that is distinct from explicit wait called implicit wait. By implicitly waiting, WebDriver polls the DOM for a certain duration when trying to find any element. This can be useful when certain elements on the webpage are not available immediately and need some time to load.

![image](https://user-images.githubusercontent.com/8729953/193310974-5b1be74f-f180-4616-97b2-88cc7831a93a.png)

5.3 FluentWait : FluentWait instance defines the maximum amount of time to wait for a condition, as well as the frequency with which to check the condition.

![image](https://user-images.githubusercontent.com/8729953/193311248-3d13f480-025f-4cab-815a-c5efe1d3c1f2.png)


6. **Locator strategies** 

6.1 Traditional Locators

![image](https://user-images.githubusercontent.com/8729953/193311641-49483c0d-7dd6-49c9-a8b2-0a01bff3d03d.png)

6.2 Relative Locators:

![image](https://user-images.githubusercontent.com/8729953/193311728-c5c16c51-9b24-4f2b-9b6d-cbb750334d77.png)

6.3 **Interacting with web elements**

* Click 
* Sendkeys
* Clear

 
 
 
 
 
