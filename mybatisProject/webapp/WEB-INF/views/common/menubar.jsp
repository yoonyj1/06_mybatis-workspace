<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .login-area a{
        text-decoration: none;
        color: black;
        font-size: 12px;
    }
</style>
</head>
<body>
    <h1 align="center">Welcome to MyBatis World</h1>
    <br>

    <div class="login-area" align="right">
        <!-- case1. 로그인 전 -->
         <form action="" method="post">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="userId" required></td>
                    <td rowspan="2"><button type="submit" style="height: 50px;">로그인</button></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="userPwd" required></td>
                </tr>
                <tr>
                    <td colspan="3" align="center">
                        <a href="#">회원가입</a>
                        <a href="#">아이디 / 비밀번호 찾기</a>
                    </td>
                </tr>
            </table>
         </form>
        <!-- case2. 로그인 후 -->

    </div>

    <div class="nav-area">


    </div>
</body>
</html>