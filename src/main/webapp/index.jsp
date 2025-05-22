<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX 도서관 관리</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/main.css">
</head>
<body>
    <div class="login-container">
        <h2>BOOKTRIX 로그인</h2>
        <h3>로그인</h3>
        <form action="/admin/login" method="post">
            <input type="text" name="adminId" placeholder="ID" required>
            <input type="password" name="adminPwd" placeholder="PWD" required>
            <div class="button-group">
                 <a href="#" class="find-button">아이디/비밀번호 찾기</a>
                <button type="submit">Login</button>
            </div>
        </form>
    </div>
</body>
</html>
