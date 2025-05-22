<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>도서 수정</title>
    
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
        <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        
        <main>
            <section class="board-title">
                <h1>회원 정보 수정</h1>
            </section>
            
            <form action="/member/update" method="post" class="book-form">
                <input type="hidden" name="userNo" value="${member.userNo}">
                <div class="form-group">
                    <label for="bookName">제목1212:</label>
                    <input type="text" id="bookName" name="bookName" value="${book.bookName}" required>
                </div>
                <div class="form-group">
                    <label for="bookCode">도서코드:</label>
                    <input type="text" id="bookCode" name="bookCode" value="${book.bookCode}" required>
                </div>
                <div class="form-group">
                    <label for="bookWriter">저자:</label>
                    <input type="text" id="bookWriter" name="bookWriter" value="${book.bookWriter}" required>
                </div>
                <div class="form-group">
                    <label for="genre">장르:</label>
                    <input type="text" id="genre" name="genre" value="${book.genre}">
                </div>
                <div class="form-group">
                    <label for="bookPrice">가격:</label>
                    <input type="number" id="bookPrice" name="bookPrice" value="${book.bookPrice}">
                </div>
                <div class="form-group">
                    <label for="publisher">제작사:</label>
                    <input type="text" id="publisher" name="publisher" value="${book.publisher}">
                </div>
                
                <button type="submit" class="btn btn-primary">수정</button>
                <a href="book-management.jsp" class="btn btn-secondary">취소</a>
            </form>
        </main>
        
        <footer>
            <p>&copy; 2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>