<%--
  Created by IntelliJ IDEA.
  User: Rocka
  Date: 2018/11/6
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <div align="center">
        <h2>请选择文件上传文件</h2>
        <form method="post" action="/home/upload" enctype="multipart/form-data">
            <input type="file" name="file"/>
            <input type="submit"/>
        </form>
    </div>
</body>
</html>
