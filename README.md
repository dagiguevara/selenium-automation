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
	
 
