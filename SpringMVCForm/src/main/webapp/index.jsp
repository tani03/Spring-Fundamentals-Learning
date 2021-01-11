<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>

<%
		String errorMessage=(String)request.getAttribute("error");
		
		if(errorMessage!=null){
			out.println("<p style=\"color:red;\">"+errorMessage+"</p>");
		}
		
		
%>

<form action="add">
	<input type="text" name="name">
	<input type="password" name="password">
	<input type="submit" value="Login">
</form>
</body>
</html>
