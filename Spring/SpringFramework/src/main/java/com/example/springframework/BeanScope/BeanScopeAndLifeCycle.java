package com.example.springframework.BeanScope;

public class BeanScopeAndLifeCycle {
    /*
    A bean is an object that is instantiated,assembled and otherwise managed by a Spring IoC container.
    An applicationContext is a container that manages the lifecycle of beans.It provides configuration and dependency injection mechanisms that allow developers
    to define and wire together beans in a modular and loosely coupled manner.
    ####### Properties#############
        -lazy-initialization mode:
            -tells the Ioc container to create a bean instance when it  is first requested, rather than at the startup

        ################Three imp methods to provide configuration metadata to the Spring Container
                1.XML based configuration file
                2. Annotation-based configuration
                3.Java-based configuration


        ######################## Scope
                1.singleton
                    -this scopes the bean definition to a single instance per Spring IoC Container(default)
                    -the single instance is stored in a cache of such singleton beans,
                        and all subsequent request and references for that named bean return the cached object.
                    -use it for stateless beans
                2.prototype
                    -this scopes a single bean definition to have any number of object instances
                    -use it for state-full beans

                3.request
                4. session
                5.global-session
                    3,4,5 for a web-aware ApplicationContext.A web-aware ApplicationContext is an ApplicationContext that is specifically designed for web applications.
                    It provides additional functionality and awareness of web-related components, such as servlets, filters, and listeners, that are commonly used in web applications


             ###################Life Cycle of Bean methods
             -We can change these name of these method but signature must be same
                1.public void init()
                    -initialization code,loading config,Connection db,webservice,etc
                2.public void destroy()
                    -clean up code

              1.We give bean having default constructor or getter, setter to IoC container
              2.Creates object of the bean
              3.Sets the value of properties
              4.(object instantiation)
              5.then we read and use the bean
              6. call destory before ending the object of bean

     */
}
