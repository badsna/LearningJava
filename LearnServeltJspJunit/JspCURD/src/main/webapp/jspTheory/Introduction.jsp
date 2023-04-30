-used to create web application just like Servlet,also as extension ad it provides more funtionality
-contains HTML tags and JSP tags
-can use implicit objects(objects that are created by the container automatically and the container makes them available to developers), predefined tags, expression language and Custom tags in JSP
-servlet code needs  to be updates  and recompiled if we have to change the look and feel of the application


############# LifeCycle of a JSP Page#########
-------Translation of JSP Page
_______Compilation of JSP Page
_______Classloading(the classloader loads class file
-------Instantiation(Object of the Generated Servlet is created)
-------Initialization(the container invokes jspInit() method)
-------Request processing(the container invokes -jspService() method)
-------Destroy(the contaoner invokes jspDestroy() method).


################## JSP API#####################
--------javax.servlet.jsp
--------javax.servlet.jsp.tagext



#####jspPage interface####
------public void  jspInit()
------public void jspDestory()

#####HttpJspPage interface####
-------public  void jspService()


############JSP Scriptlet tag(Scripting elements)
-------code can be written inside the jsp page using scriptlet tag
-------provides the ability ot insert java code

******** JSP scriplet tag ***********
---------used to execute java source code
--------- <% java source code %>
----------eg: <% out.print("welcome to jsp");%>


************ Basic demo in htmlFiles/Demo.html********

********** Jsp expression tag *******
---------code inside this  is written to the output stream of the response
--------so no need to write out.print
------- used to call the method
________ <%= statement %>



********** Jsp Declaration Tag ****
-------- used to declare fields and methods.
-------- code is placed outside the service() method of auto generated servlet
-------- it doesn't get memory at each request

___________ <%! field or method declaration %>


************* JSP Implicit Objects
----9 jsp implicit objects
1. out=>JspWriter                =>to write any data to buffer
2.request=>HttpServletRequest    =>used to get request info
3.response=>HttpServletResponse   =>used to add or manipulate response
4.config=>ServletConfig           =>used to get initialization parameter
5.application=>ServletContext     =>same as application as well as request
6.session=>HttpSession            =>use to set,get or remove attribute or to get session info
7.pageContext=>PageContext        =>use to set,get or remove attribute from page,request,session or  application
8.page=>Object                    =>this object is assigned to the reference of autogenerted servlet class.Since it  is of type Object it is less used beacuse you can use this object directly in jsp
9.exception=>Throwable            =>used to print the exception but it can be used in error pages



********************** JSP directives *************
-----are msg that tells the web container how to translate a JSP page into the coressponding servlet

1. page directive =>defines attributes that apply to an entire JSP page
                    <%@ page attribute="value" %>
                    a. import =>used to import class,interface
                    b. contentType=>defines the MIME(Multipurpose Internet Mail Extension)type of HTTP response
                    c. extends
                    d.info =>set the info of JSP page that can  be retrived using getServletInfo()
                    e. buffer=> set the buffer size in kb to handle output.default is 8kb
                    f. language =>specifies the scripting language.default is java
                    g. isELIgnored
                    h.isThreadSafe=> if it is false,it will serialize the multiple request
                    i. errorPage=>define the error page. error auxa then kun page ma jane
                    j. isErrorPage=>declare that the current page is the error page.kun chai excpetion falne valu echai treu hunu paryo

2. Jsp Include Directives=> used to include the contents of any other resources
                            <%@ include file="resourceName" %>
                            -it will expand teh actual page size at runtime

3.Jsp Taglib directive=>used to define a tag library that defines many tags
                        <%@ taglib uri="uriofthetaglibrary" prefix="prefixiftaglibrary" %>



****************** two ways to handle exception **********
1.By errorPage and isErrorpage attributes of page directives
2. By <error-page> element in web.xml file


########################### JSP Action Tags#############
jsp:forward         <jsp:forward page="page1.jsp" />
jsp:include        <jsp:include page="page1.jsp" />
    :useBean
    :setProperty
    :getProperty
    :plugin
    :param
    :fallback



############################### JavaBean ##############
-class that should follow:
        -it should hava a no-args constructor.
        -it should be serializable.
        -it should provide methods to set and get the values of thepropeties ,know as getter and setter methods.
-A bean encapsulates many objects into one  object so that we can acces this object from multiple places
-getPropertyName()==>this method is called the accessor
-setPropertyName()==>this is called mutator



************ Expression Language(EL) in JSP
-----simplifies the accessibility of  data stored in the java bean component and other object like request,session,application, etc
    ---${param.name}


################## MVC in JSP ######################
--design pattern that separates the business logic ,presentation logic and data
--Controller acts as an interface between View and Model.Controller intercepts all the incomming requests
--Model represents the state of the application ie data. It can also have business logic
--View represents the presentation ie. UI

#################### JSTL(JSP Standard Tag Library)



*************Loop in jsp************
    <m:loop end="5" start="1">
    <p>My Name is khan</p>
    </m:loop>

**************** Pagination in JSP***************
-it is required if you have to display many records.
-Displaying many records in  a single page may take  time, so it is better to break the page into parts.
-to do so, we create pagination application
    <a href="view.jsp?page=1">View EMployees</a>





