<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX 대여관리</title>
    
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        
        <main>
            <section class="board-title">
            <h1>대여관리</h1>
            </section>   
            <div class="button-container">
               <div class="search-container">
                   <form class="search-form" action="/notice/librarysearch" method="get">
                       <select class="search-select" name="searchCondition">
                           <option value="Allrent">대여 관리 전체 조회</option>
                           <option value="userId">회원 아이디로 대여 조회</option>
                           <option value="bookNo">책번호로 대여 조회</option>
                       </select>
                       <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
                       <button type="submit" class="search-button">검색</button>
                   </form>
               </div>
               <div class="admin-button">
                   <a href="/notice/libraryadd" class="btn btn-admin">대여정보 추가</a>
               </div>
           </div>
           
            <section class="board-content">
                <table class="notice-table">
                <thead>
                    <tr>
                        <th class="leaseNo">대여번호</th>
                        <th class="bookNo">책번호</th>
                        <th class="leaseDate">대여일</th>
                        <th class="returnDate">반납일</th>
                        <th class="userId">고객아이디</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach items="${libList}" var="library" varStatus="i">
                        <tr>
                        <td class="leaseNo">${library.leaseNo}</td>
                        <td class="bookNo">${library.bookNo}</td>
                        <td class="leaseDate">${library.leaseDate}</td>
                        <td class="returnDate">${library.returnDate}</td>
                        <td class="userId">${library.userId}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
            </section>

        </main>
        
        <footer>
            <p>&copy; 2025 BOOKTRIX. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
