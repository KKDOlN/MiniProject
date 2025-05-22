<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX 관리자 메뉴</title>
    <link rel="stylesheet" href="../resources/css/reset.css">
    <link rel="stylesheet" href="../resources/css/adminmenu.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        <main>
            <a href="/notice/booklist" class="menu-item">
                <img src="../resources/images/books.jpg" alt="도서관리">
                <h2>도서관리</h2>
            </a>
            <a href="/notice/memberlist" class="menu-item">
                <img src="../resources/images/users.jpg" alt="회원관리">
                <h2>회원관리</h2>
            </a>
            <a href="/notice/library" class="menu-item">
                <img src="../resources/images/rent.jpg" alt="대여관리">
                <h2>대여관리</h2>
            </a>
        </main>
        
        
        <footer>
            <p>2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
