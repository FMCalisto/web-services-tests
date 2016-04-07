This is a simple Java application with JUnit tests. 
JUnit is a simple framework to write repeatable tests (http://junit.org/).


Instructions using Maven:
------------------------

To use JUnit in Maven, it is necessary to put the test classes under src/test/java. 
It is also necessary to add the following dependency:
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency> 
Note that the element <version> can be updated to the desired JUnit version.
The scope says that the library should only be used for testing.

The following configuration copies resource files to target and
the filtering option replaces ${property} by the respective values
    <testResources>
        <testResource>
            <directory>src/test/resources</directory>
            <filtering>true</filtering>
        </testResource>
    </testResources>

To compile:
  mvn compile

To test:
  mvn test

To run using exec plugin:
  mvn exec:java

To generate launch scripts for Windows and Linux:
  (appassembler:assemble is attached to install phase)
  mvn install

To run using appassembler plugin:
  On Windows:
    target\appassembler\bin\junit-app
  On Linux:
    ./target/appassembler/bin/junit-app


To configure the Maven project in Eclipse:
-----------------------------------------

If Maven pom.xml exist:
    'File', 'Import...', 'Maven'-'Existing Maven Projects'
    'Select root directory' and 'Browse' to the project base folder.
	Check that the desired POM is selected and 'Finish'.

If Maven pom.xml do not exist:
    'File', 'New...', 'Project...', 'Maven Projects'.
	Check 'Create a simple project (skip architype selection)'.
	Uncheck  'Use default Workspace location' and 'Browse' to the project base folder.
	Fill the fields in 'New Maven Project'.
	the Check if everything is OK and 'Finish'.

To run:
    Select the main class and click 'Run' (the green play button).
    Specify arguments using 'Run Configurations'


--
Revision date: 2016-02-16
leic-sod@disciplinas.tecnico.ulisboa.pt