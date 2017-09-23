# zopa-selenium-automation

### Environment Setup
7	
8	1. Global Dependencies
9	    * [Install Maven](https://maven.apache.org/install.html)
10	    * Or Install Maven with [Homebrew](http://brew.sh/)
11	    ```
12	    $ brew install maven
13	    ```
14	2. Sauce Credentials
15	    * In the terminal export your Sauce Labs Credentials as environmental variables:
16	    ```
17	    $ export SAUCE_USERNAME=<your Sauce Labs username>
18		$ export SAUCE_ACCESS_KEY=<your Sauce Labs access key>
19	    ```
20	3. Project Dependencies
21		* Check that Packages are available
22		```
23		$ cd Java-TestNg-Selenium
24		$ mvn test-compile
25		```
26		* You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
27		```
28		$ mvn versions:display-dependency-updates
29		```
