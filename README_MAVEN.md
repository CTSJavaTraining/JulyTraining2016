## MAVEN COMMANDS TO RUN A PROJECT FROM ECLIPSE: ##

	1.	Right click on the project and click Run As and then click MAVEN clean.
	2.	Right click on the project and click Run As and then click MAVEN install.
	3.	Right click on the project and click Run As and then click Maven test to run the test classes alone.
	4.	Right click on the project and click Run As and then click Maven package.

## MAVEN COMMANDS TO RUN THE PROJECT FROM COMMAND PROMPT: ##

	1.	mvn compile (to compile the project).
	2.	mvn install (creates build result in  target folder).
	3.	mvn clean install (ensures that the build target is removed before a new build).
	4.	mvn -o clean install (instructs maven to work with local repositories alone and do not check online for dependencies).
	5.	mvn test (to run the test classes).

After running the maven project there will be a new folder created as target in the project structure that holds the details of the project build.
"mvn package" compiles, runs and packages the project into a jar file.
