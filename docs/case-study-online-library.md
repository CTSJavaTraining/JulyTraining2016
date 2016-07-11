# **ONLINE LIBRARY**
---
## INTRODUCTION
##### PURPOSE

> The purpose of this document is to specify the software requirement for an online library system. 

##### OVERVIEW

> The online library will maintain an inventory of Books, Movies and Music. Customers may register to the library using the signup page or may login using social channels and become a member of the library after paying certain registration amount. A member may lend an item from the library also should be able to return the item to the library. A member may have different types of memberships based on which the system will determine his/her eligibility to lend the item(s).

## DESCRIPTION

##### ITEM SPECIFICATION

* _Library will maintain an inventory of Books, Movies & Music Items._
* _An Item have following mandatory attributes: name, year, price, description, format, date added._
* _An Item may have number of copies._
* _An Item may be associated with multiple tags._
* _A Book may have following attributes: author(s), publisher(s), edition no, rating_
* _A Music may have production(s), writer(s), singer(s), release date._
* _A Movie may have production(s), writer(s), singers(s), director(s), cast(s), release date_
* _Books may be present in physical or e-book format. (for e-books format, number of copies is not required.)_
* _Movies and Music may be in CD, DVD, Blu-Ray or Digital format. (for digital format, number of copies is not required.)_
* _The library will maintain number of copies of the Item in case of physical media._

##### USER CATAGORIES

**_Librarian_** --  

*  _A librarian may add, modify, delete Items in the library._
*  _A librarian may approve, reject, cancel membership of a user._
*  _A librarian may search and view the history of lending items for a specific user._
*  _A librarian should have log-in credentials to create user session._

**_Signed User_** --

* _User may use the signup form or may login using social channels._
* _In case of social channels, system needs to support Oauth2 protocol to populate signup form._
* _An user database needs to be maintained by the system._
* _An user may have following attributes: Name, Age, Gender, Languages, postal address, email, mobile e.t.c._
* _An user may subscribe to set of interests e.g. Music: A.R. Rahman, Movies:  Si-Fi e.t.c._
* _An user may rate one or more item(s)._
* _Based on the interests and rating, new items will be recommended to the user._

**_Member_** --

* _A signed user may pay for a specific membership scheme and may get a membership for specific period._
* _A member may search for an item present in the library._  
* _A member may see the availability of an Item in the library._
* _A member may create his personalize wish list with the items available in the library._
* _A member may set notification for an Item when it will be available to lend._
* _These are different types of memberships are available for the members to subscribe with. (e.g. Basic, Moderate, Extreme, VIP e.t.c.)_
* _Each type of membership have certain limit (e.g. Basic membership may lend items for which total cost should not exceed $200 at any point of time)._
* _An Item can be searched by any of its attributes._
* _A member should have log-in credentials to create user session._
* _A member may see his own history of lending items from the library._
* _A member database needs to be maintained by the system._
* _A member may have following attributes: Name, Age, Gender, Languages, postal address, email, mobile e.t.c._
* _A member may subscribe to set of interests e.g. Music: A.R. Rahman, Movies:  Si-Fi e.t.c._
* _A member may rate item(s)._
* _Based on the interests and rating, new items will be recommended to the member._

**_Anonymous_** --

* _An anonymous user may come to the system without logging in. Signup or logging using social channels are not mandatory for the below function(s)_
* _All Item search functionality will be available for this user._
* _The user will not be able to lend an Item until he/she subscribes to a membership scheme._
* _No user information will be stored in the system for anonymous users._


##### BATCH
* _If an Item is lend over two weeks, the system will send daily email notification to the user and the librarian._
* _Membership will be expired automatically after certain period and the user will be demoted to signed user; however the membership may be renewed or upgraded by paying certain amount._ 

## TECHNOLOGIES

* **Java1.8, Spring4, JPA/Hibernate, JAX-RS/CXF-REST, JAX-WS/CXF-WS, Spring-JDBC, Sping Batch. Maven**

## DATABASE 

* **MySQL**

## APPLICATION SERVERS

* **Tomcat8**

##	NONFUNCTIONAL REQUIREMENTS

*	**PERFORMANCE**

* _The load time for user interface screens shall take no longer than five seconds._
* _The log in information shall be verified within five seconds._
* _Queries shall return results within five seconds._

*	**AVAILABILITY**

* The system should be stateless and dynamically scalable.

*	**RELIABILITY**

* _Good validations for user inputs will be done._
* _Avoid storing inconsistence data._
* _Proper exception handling._

* **SECURITY**

* _Encrypted Password._


* **RESPONSIVENESS**

* _UI should be responsive._

*	**MAINTAINABILITY**

* Need to write test case for each unit of code.
* Use Findbugs (IDE plugin) for static analysis.
* 100% test case should be successful.
* Maintain SOLID Principle while developing code.

##### GOOD TO HAVE

* _At least one Social Channel Integration._
* _Jenkins, GIT, Sonar integration with code quality report.
* _Circuit Breaker and fallbacks._
* _No issues present in the code (As per Findbug report)._
* _Code coverage is more than 80%._

##### OUT OF SCOPE

* _Online Payment, Payment Gateway is out of scope._
* _Sending SMS is out of scope._
