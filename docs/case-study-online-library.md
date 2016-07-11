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
* _An Item have following mandatory attributes: name, year, price, description & format._
* _An Item may have number of copies._
* _An Item may be associated with multiple tags._
* _A Book may have following attributes: author(s), publisher(s), edition no._
* _A Music may have production(s), writer(s), singer(s)._
* _A Movie may have production(s), writer(s), singers(s), director(s), cast(s)_
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
* _A member may set notifiaction for an Item when it will be available to lend._
* _These are different types of memberships are available for the members to subscribe with. (e.g. Basic, Moderate, Extreme, VIP e.t.c.)_
* _Each type of membership have certain limit (e.g. Basic membership may lend items for which total cost should not exceed $200 at any point of time)._
* _An Item can be searched by any of its attributes._
* _A member should have log-in credentials to create user session._

**_Anonymous_** --

* _An nonymous user may come to the system without logging in. Signup or logging using social channels are not mandatory for the above function(s)_
* _All Item search functionality will be available for this user._
* _The user will not be able to lend an Item until he/she subscribes to a membership scheme._

##### IN SCOPE
##### OUT SCOPE
##### ASSUMPTIONS
## FUNTIONAL REQUIREMENTS
##### MUST HAVE
##### GOOD TO HAVE
## NON-FUNTIONAL REQUIREMENTS
##### MUST HAVE
##### GOOD TO HAVE
## TECHNOLOGIES
## DATABASE 
## APPLICATION SERVERS
