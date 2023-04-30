

<%@ page import="com.example.jspcurd.dao.StudentDao" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.InputStream" %>
<jsp:useBean id="s" class="com.example.jspcurd.bean.Student"></jsp:useBean>
<jsp:setProperty name="s" property="*" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>a
</head>
<body>
<%
    String hobbies[]=request.getParameterValues("hobbies");
    String hobby="";
    for (int j=0;j< hobbies.length;j++){
        hobby+=hobbies[j]+" ";
    }
    s.setHobbies(hobby);


//    InputStream photo=request.getPart("photo").getInputStream();
//    s.setPhoto(photo);

//    String gender=request.getParameter("gender");
//    s.setGender(gender);

int i= StudentDao.save(s);
if(i>0){
    out.print("sucessfull "+s.getStd_name());
    request.getRequestDispatcher("viewStudent.jsp").include(request,response);
}
else {
    out.print("isn't sucessfull");
    request.getRequestDispatcher("addNewStudent.jsp").include(request,response);
}
%>
</body>
</html>