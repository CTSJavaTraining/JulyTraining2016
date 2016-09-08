Attendance Data Management System (ADMS)

The attendance Data Management system we have developed would mainly function to facilitate the general employee attendance management system. We have designed this system to consolidate attendance data from various sources and to produce reports as needed.

We basically have developed a system that would keep record on each particular employee’s attendance of an organization.

We have given much of our emphasis to develop the system based on discrete information on every single employees of the organization. In order to maintain the distinct nature of the information, we have used minimum three basic slots for each employee: employee name, employee ID and the card number.

FUNTIONALITIES:
    1.	Register an employee when he joins organization and create a unique employee id and access card number.
    2.	Minimum 10 swipe in point which has two sides IN/OUT and each swipe point has unique name.
    3.	Employee has to be restricted from entering if he tail gates.
    4.	Employee may or may not have access to door, If not incident has to be recorded to produce a report.
    5.	If employee quits access card has to be deactivated and attendance data should be maintained for 6 months from date of relieving.

USER CATAGORIES
1.	Permanent employee
    a.	Can view the attendance sheet for one year
    b.	Can customize the start and end date to view the attendance
2.	Contract employee
    a.	Can view the attendance sheet for 3 months
    b.	No option to customize and view the attendance
**Generate attendance data in different formats of data source file like: CSV and excel.

TECHNOLOGIES
Java1.8, Spring4, JPA/Hibernate, JAX-RS/CXF-REST, JAX-WS/CXF-WS, Spring-JDBC, Spring Batch, Maven

DATABASE
    •	MySQL
APPLICATION SERVERS
    •	Tomcat8
PERFORMANCE
    •	The log in information shall be verified within five seconds.
    •	Queries shall return results within five seconds.
AVAILABILITY
    •	The system should be stateless and dynamically scalable.
RELIABILITY
    •	Good validations for user inputs will be done.
    •	Avoid storing inconsistence data.
    •	Proper exception handling.
CONCURRENCY
    •	Multiple concurrent logging for employees are allowed.
RESPONSIVENESS (optional)
        •	UI should be responsive (optional)
MAINTAINABILITY
    •	Need to write test case for each unit of code.
    •	Use Findbugs (IDE plugin) for static analysis.
    •	100% test case should be successful.
    •	Maintain SOLID Principle while developing code.

GOOD TO HAVE
    1.	Provision to send SMS on misplaced access
    2.	Jenkins, GIT, Sonar integration with code quality report.
    3.	No issues present in the code (As per Findbug report).
    4.	Code coverage will be more than 80%.
    5.	Use of lambda functions in business logic and validations.


OUT OF SCOPE
Providing option to enter attendance details (like top up)
