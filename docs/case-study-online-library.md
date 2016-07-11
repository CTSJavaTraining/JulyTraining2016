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
*  _A librarian should have log-in credentials to create user session._

**_Member_** --

* _A member may search for an item present in the library._  
* _A member may see the availability of an Item in the library._
* _A member may create his personalize wish list with the items available in the library._
* _A member may set notification for an Item when it will be available to lend._
* _These are different types of memberships are available for the members to subscribe with. (e.g. Basic, Moderate, Extreme, VIP e.t.c.)_
* _Each type of membership have certain limit (e.g. Basic membership may lend items for which total cost should not exceed $200 at any point of time)._
* _An Item can be searched by any of its attributes._
* _A member should have log-in credentials to create user session._

**_Anonymous_** --

* _An anonymous user may come to the system without logging in. Signup or logging using social channels are not mandatory for the above function(s)_
* _All Item search functionality will be available for this user._
* _The user will not be able to lend an Item until he/she subscribes to a membership scheme._

##### SIGNUP

* _User may use the signup form or may login using social channels._
* _In case of social channels, system needs to support Oauth2 protocole to integrate with social channels_
* _An user database needst to be maintained by the system._
* _An user may have following attributes: Name, Age, Gender, Languages, postal address, email, mobile e.t.c._
* _An user may subscribe to set of interrests e.g. Music: A.R. Rahaman, Movies:  Si-Fi e.t.c._
* _An uaers may rate item(s)._
* _Based on the interrests and rating, new items will be recommended to the user._

##### BATCH
* _If an Item is lend over two weeks, the system will send daily notification to the user and the librarian._

##### OUT OF SCOPE

* _Online Payment, Payment Gateway is out of scope._
* _Sending email, SMS is out of scope._

##### GOOD TO HAVE

* _At least one Socila Channel Integration._
* _Jenkins, GIT, Sonar integration with code quality report.

## TECHNOLOGIES

* **Java1.8, Spring4, JPA/Hibernate, JAX-RS/CXF-REST, JAX-WS/CXF-WS, Spring-JDBC, Sping Batch. Maven**

## DATABASE 

* **MySQL**

## APPLICATION SERVERS

* **Tomcat8**
