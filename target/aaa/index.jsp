<%--<html>--%>
<%--<head>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<title>test</title>--%>
<%--</head>--%>
<%--<script>--%>
    <%--function selectUser() {--%>
        <%--var xmlhttp = new XMLHttpRequest();--%>
        <%--xmlhttp.onreadystatechange = function () {--%>
            <%--if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {--%>
                <%--document.getElementById("test").innerHTML = xmlhttp.responseText;--%>
            <%--}--%>
        <%--}--%>
        <%--xmlhttp.open("POST", "user/showUser.do", true);--%>
        <%--xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");--%>
        <%--xmlhttp.send("id=1");--%>
    <%--}--%>
<%--</script>--%>
<%--<body>--%>
<%--<p id="test">Hello World!</p>--%>
<%--<button type="button" onclick="selectUser()">onclick test</button>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>首页</title>
</head>
<body>
<h5>
    <a href="<%=basePath%>user/getAllUser">进入用户管理页</a>

</h5>
</body>
</html>