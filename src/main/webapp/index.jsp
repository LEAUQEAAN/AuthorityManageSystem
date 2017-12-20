<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="./login" method="post">
        <input type="text" id="code" name="code" required placeholder="输入账号...." />
        <input type="password" id="pwd" name="pwd" required  placeholder="输入密码...." />
        <input type="submit"  value="登陆" />
    </form>
</body>
<script src="jquery/jquery-3.1.1.min.js" ></script>
<script>
    function login()
    {
        var params = {};
        // params.XX必须与Spring Mvc controller中的参数名称一致
        // 否则在controller中使用@RequestParam绑定
        params.code = document.getElementById("code").value;
        params.pwd = document.getElementById("pwd").value;
        $.ajax({
            async: false,
            type: "POST",
            url: "./login",// 注意路径
            data: params,
            dataType: "json",
            success: function (data) {
                if (data) {
                    alert(JSON.stringify(data, null, 4));
                }
            },
            error: function (data) {
                alert(JSON.stringify(data, null, 4));
            }
        });
    }

</script>

</html>
