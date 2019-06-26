<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<html>
<body>
<h2>Hello World!</h2>

<%
    String username = (String)request.getAttribute("username");
    out.print(username);

%>
</body>
</html>
