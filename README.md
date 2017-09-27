# zopa-selenium-automation
	

### Environment Setup
	
1.  Global Dependencies
	* [Install Maven](https://maven.apache.org/install.html)
	* Or Install Maven with [Homebrew](http://brew.sh/)
	
	```
	$ brew install maven
	
    
2. Project Dependencies
	* Check that Packages are available
	
	* TestNG:
	
	```
	<dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.9.10</version>
            <scope>test</scope>
        </dependency> 
	
	```
	* Selenium-Java:
	
	```
	<dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>2.53.1</version>
            <scope>test</scope>
        </dependency>
	
	```
	
	* Extent Reports:
	
	```
	<dependency>
             <groupId>com.relevantcodes</groupId>
    	     <artifactId>extentreports</artifactId>
    	     <version>2.41.2</version>
	</dependency>
	
	```
	
	``` $ mvn test-compile ```
* You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review     updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
	```
	$ mvn versions:display-dependency-updates
	```
	
	### Additional Information
	
  1. I created two classes to cover the Sign Up flow scenarios, SignUpFlow and SignUp_SadPath
  2. Sign Up flow contain a normal flow in the Sign Up process and storing the randomize data in SignUp.csv
  3. SignUp_SadPath contain 3 different tests in this class, that include the following assertions: email validation, 	            post code validation and phone number validation (phone number validation test it will fail because the UI                      doesn't validate a correct phone number format
  4. You can run the tests with a simple command in the console `mvn test -U -Psingle` if you want to run it in parallel             `mvn test -U -Pparallel`
