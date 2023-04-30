<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Add New Student</h1>
<form action="addUser.jsp" method="post"
      enctype="multipart/form-data>
    <table>
        <tr><td>ID:</td><td><input type="text" name="std_id" /></td></tr>
        <tr>
            <td>Name:</td><td><input type="text" name="std_name"></td>
        </tr>
        <tr>
            <td>Hobbies:</td><td>
            <input type="checkbox" name="hobbies" value="Singing">Singing
            <input type="checkbox" name="hobbies" value="Dancing">Dancing
            <input type="checkbox" name="hobbies" value="Coding">Coding
            <input type="checkbox" name="hobbies" value="Travelling">Travelling
        </td>
        </tr>
        <tr>
<%--            value rakhnaii parxa--%>
            <td>Gender:</td><td><input type="radio" name="gender" value="Male">Male
            <input type="radio" name="gender" value="Female">Female
        </td>
        </tr>
        <tr>
            <td>Country:</td><td>
            <select name="country" style="width:150px"  >
                <option >India</option>
                <option >USA</option>
                <option >Nepal</option>
                <option >UK</option>
            </select>
        </td>
        </tr>
<%--        //<tr><td><input type="File" value="Save photo"></td></tr>--%>
        <tr><td><input type="submit" value="Save Employee"></td></tr>
    </table>

</form>
</body>
</html>