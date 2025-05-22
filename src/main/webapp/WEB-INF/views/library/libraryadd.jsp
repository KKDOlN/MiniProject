<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>새 책 등록</title>
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        
        <main>
            <section class="board-title">
                <h1>대여 등록</h1>
            </section>
            
            <form action="/notice/libraryadd" method="post" class="book-form">
                <div class="form-group">
                    <label for="leaseNo">대여번호:</label>
                    <input type="text" id="leaseNo" name="leaseNo" required>
                </div>
                <div class="form-group">
                    <label for="bookNo">책번호:</label>
                    <input type="text" id="bookNo" name="bookNo" required>
                </div>
                <div class="form-group">
                    <label for="userId">고객아이디:</label>
                    <input type="text" id="userId" name="userId" required>
                </div>
                <button type="submit" class="btn btn-primary">등록</button>
                <a href="/notice/library" class="btn btn-secondary">취소</a>
            </form>
        </main>
        
        <footer>
            <p>&copy; 2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
