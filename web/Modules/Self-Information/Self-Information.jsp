<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>您好，${users.get(0).name}！</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Modules/Self-Information/Self-Information.css" type="text/css">
</head>
<body>
    <h3>个人信息如下：<br/></h3>
    <div class="Self-Information">
        <table class="Self-Information-Maintable">
            <tr>
                <th name="users_information">
                    用户id：
                </th>
                <td>
                    ${users.get(0).id}
                </td>
            </tr>
            <tr>
                <th>
                    用户昵称：
                </th>
                <td>
                    ${users.get(0).name}
                </td>
            </tr>
            <tr>
                <th>
                    用户简介：
                </th>
                <td>
                    ${users.get(0).introduction}
                </td>
            </tr>
        </table>

        <br/><br/>
        <a id="Self-Information-return" href="${pageContext.request.contextPath}/index.jsp">---返回主页</a>
    </div>

</body>
</html>
