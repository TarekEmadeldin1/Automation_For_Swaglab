*Description -This project was about testing Login Features of SwagLabs Website with Valid and InValid User Credentials.

-Project was written on Intellij IDEA. -Project was written by Java Language , Java OOP (Inheritance concept) , Selenium Webdriver , TestNG , Page Object Design Model Pattern and this project was tested on Environment Google Chrome.

*src/main : -Parent Class is to declare protected driver and write down main funtions to be able to be recalled by any of the inherited Classes. 
            -LoginPage Class is to write down the attributes and operations which will be recalled and tested in src/test/LoginPageTest.

*src/test : -TestBase Class is to declare protected driver and write down main functions to be able to be recalled by any of the inherited Classes. 
            -LoginPageTest Class is to recall functions from src/main/LoginPage to perform testing.

*test.xml : -To run src/test/LoginPageTest through.
