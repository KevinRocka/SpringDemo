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
<h2>管理员，哈哈哈哈</h2>
<form name="mainForm" action="<%=request.getContextPath()%>/home/save" method="post">

    <div>
        <span>id：</span> <input type="text" id="id" name="id">
    </div>
    <div>
        <span>标题：</span> <input type="text" id="title" name="title">
    </div>
    <div>
        <span>选择界面</span>
        <select id="inter" name="inter">
            <option value="0">红色界面</option>
            <option value="1">蓝色界面</option>
            <option value="2">紫色界面</option>
        </select>
    </div>
    <div>
        <span>介绍:</span>
        <textarea id="desc" name="desc" rows="5" style="width:480px; top: 400px;"></textarea>
    </div>
    <div>
        <input type="submit" id="btnPass" value="提交"/>
    </div>
</form>
</body>
</html>
