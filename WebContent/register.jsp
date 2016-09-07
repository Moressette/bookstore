<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>用户注册</title>
</head>
<body>    
    <form class="form-horizontal formstyle" role="form" method="post" action="RegisterServlet">
        <div class="form-group">
            <div class="col-sm-12">
                <label for="username">用户名</label>
            </div>
            <div class="col-sm-12">
                <input type="text" class="form-control" id="username" name="username" placeholder="在此输入用户名">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-12">
                <label for="password">密码</label>
            </div>
            <div class="col-sm-12">
                <input type="password" class="form-control" id="password" name="password" placeholder="在此输入密码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-12">
                <label for="email">邮箱</label>
            </div>
            <div class="col-sm-12">
                <input type="email" class="form-control" id="email" name="email" placeholder="在此输入邮箱地址" >
            </div>
        </div>
        <div class="row">
            <div class="col-sm-5">
                <button type="submit" class="btn">注册</button>
            </div>
            <div class="col-sm-6 registerTextStyle">
                已经有账号?<a href="login.jsp">点此登录</a>
            </div>
        </div>
    </form>
</body>
</html>


