<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>首页</title>
<script src="bootstrap/JQuery/jquery-3.2.1.min.js"></script>
<body style="background-color: pink">
<div align="center">

    <h1 align="center">开始登录</h1>
    <form action="saveUser.action" method="get">
        账号：<input type="text" name="userName"/>
        密码：<input type="text" name="userPassword"/>
        <input type="submit" value="登录"/>
    </form>

    <h1 align="center">查询用户</h1>
    用户编号：<input type="text" id="queryUserId"/>
    <input type="button" value="确认查询" onclick="query()"/>
    用户名：<span id="queryUserName">暂无数据！</span>

    <h1 align="center">修改用户</h1>
    <form action="updateUser.action" method="get">
        用户编号：<input type="text" name="userId"/>
        修改为：<input type="text" name="userName"/>
        <input type="submit" value="确认修改"/>
    </form>

    <h1 align="center">删除用户</h1>
    <form action="deleteUser.action" method="get">
        用户编号：<input type="text" name="userId"/>
        <input type="submit" value="确认删除"/>
    </form>

</div>
</body>
<script>

    function query() {
        var queryUserId = $("#queryUserId").val();
        $.ajax({
            url: "queryUser.action",
            type: "get",
            data: {userId: queryUserId},
            dataType: "json",
            success: function (json) {
                $("#queryUserName").text(json.user.userName);
            }
        })
    }

</script>
</html>