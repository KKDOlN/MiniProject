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
                <h1>새 책 등록</h1>
            </section>
            
            <form action="/notice/insert" method="post" class="book-form">
                <div class="form-group">
                    <label for="bookName">제목:</label>
                    <input type="text" id="bookName" name="bookName" required>
                </div>
                <div class="form-group">
                    <label for="bookCode">도서코드:</label>
                    <input type="text" id="bookCode" name="bookCode" required>
                </div>
                <div class="form-group">
                    <label for="bookWriter">저자:</label>
                    <input type="text" id="bookWriter" name="bookWriter" required>
                </div>
                <div class="form-group">
                    <label for="genre">장르:</label>
                    <input type="text" id="genre" name="genre">
                </div>
                <div class="form-group">
                    <label for="bookPrice">가격:</label>
                    <input type="number" id="bookPrice" name="bookPrice">
                </div>
                <div class="form-group">
                    <label for="publisher">제작사:</label>
                    <input type="text" id="publisher" name="publisher">
                </div>
                
                <button type="submit" class="btn btn-primary">등록</button>
                <a href="book-management.jsp" class="btn btn-secondary">취소</a>
            </form>
        </main>
        
        <footer>
            <p>&copy; 2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
