<%--
  Created by IntelliJ IDEA.
  User: Rocka
  Date: 2018/11/5
  Time: 上午9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is a Index Title</title>
    <link rel="stylesheet" type="text/css" href="../statics/css/index.css">

</head>
<body>
    <h2>Welcome to the fucking Spring world!</h2>
    <ui>
        <li>标题:${home.title}</li>
        <li>id:${home.id}</li>
        <li>正文:${home.content}</li>
        <li>名称:${home.name}</li>
    </ui>
</body>
</html>
