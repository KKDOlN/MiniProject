<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX - 회원 등록</title>
    
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        
        <main>
            <section class="board-title">
                <h1>회원 등록</h1>
            </section>
            <form action="/member/register" method="post" class="member-form">
                <div class="form-group">
                    <label for="userId">아이디:</label>
                    <input type="text" id="userId" name="userId" required>
                </div>
                <div class="form-group">
                    <label for="password">비밀번호:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <div class="form-group">
                    <label for="userName">이름:</label>
                    <input type="text" id="userName" name="userName" required>
                </div>
                <div class="form-group">
                    <label for="userAge">나이:</label>
                    <input type="number" id="userAge" name="userAge">
                </div>
                <div class="form-group">
                    <label for="addr">주소:</label>
                    <input type="text" id="addr" name="addr">
                </div>
                <div class="form-group">
                    <label for="gender">성별:</label>
                    <select id="gender" name="gender">
                        <option value="M">남성</option>
                        <option value="F">여성</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">등록</button>
                <a href="memberlist.jsp" class="btn btn-secondary">취소</a>
            </form>
        </main>
        
        <footer>
            <p>&copy; 2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
