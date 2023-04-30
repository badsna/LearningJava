package org.example;

public class IntroPart3{
    /*
    *******************Mockito*******************
    -it is built on the top of  JUnit tool
    * It is given to  perform unit testing by mocking  the local dependent or external dependent objs.
    *  Let us assume Dao class coding is not complete but service class coding is completed and we want to finsish unit testing of service class.
    * Then we need to create Mock/fake object for DAO class and  assign/inject to  Service class in order to write test class on service class methods.
    *     Note:Mock objects are for temporary means, mostly they wwill be used in unit testing .
    * These mock objets create d in test method doesn't affect real code
    *
    * We can do this mocking in three ways
    *   a)Using  Mock  objects/fake obj(provides temporary objects)
    *   b) Using Stub Obj(Providing  some functionality for the methods of mock obj like
    *       specifying for certain inputs or certain output should come)
    *   c) Using Spy Object(It  is called  Partial Mock obj/Half  mock obj that means if you need new functionality to method that will be used-otherwise
    *       real object functionality will be used
    *       Note: While working with spy object we will be having  real object also
    *
    * Insted of creating class manually to prepare Mock,Stub and Spy objects-we can use
    * Mock frameworks available  in the market which are capable generating such class dynamically at run time
    *  as  InMemory class(That class that are generated in JVM memory of RAM)
    *
    *
    * lets us assume testing loginmgmtservice class without keeping loginmgmtdao class
    *





     */
}
