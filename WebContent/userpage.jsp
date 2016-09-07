<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.bookstore.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>书城</title>
</head>
<body>
	<%
		User user = (User)session.getAttribute("user");
		String username = user.getUsername();
	%>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div style="background:#000;height:58px;" class="col-sm-12">
                    <div class="titlePosition">书城</div>
                        <div class="loginButtonPosition">
                            <%=username %>,欢迎光临
                        </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="jumbotron">
                <image src="images/jumbotron.jpg" width="100%" alt=""/>
            </div>
        </div>
        
        
        
    </div>
</body>
</html>