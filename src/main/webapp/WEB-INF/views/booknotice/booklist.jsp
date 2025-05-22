<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX 도서관리</title>
    
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
        
        <main>
            <section class="board-title">
            <h1>도서관리</h1>
            </section>   
            <div class="button-container">
               <div class="search-container">
                   <form class="search-form" action="/notice/booksearch" method="get">
                       <select class="search-select" name="searchCondition">
                           <option value="bookTitle">제목</option>
                           <option value="bookCode">도서코드</option>
                           <option value="bookWriter">저자</option>
                       </select>
                       <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
                       <button type="submit" class="search-button">검색</button>
                   </form>
               </div>
               <div class="admin-button">
                   <a href="/notice/insert" class="btn btn-admin">새 책 등록</a>
               </div>
           </div>
           
            <section class="board-content">
                <table class="notice-table">
                <thead>
                    <tr>
                        <th class="bookNo">도서코드</th>
                        <th class="bookName">타이틀</th>
                        <th class="bookWriter">저자</th>
                        <th class="genre">장르</th>
                        <th class="bookPrice">가격</th>
                        <th class="publisher">제작사</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach items="${nList}" var="book" varStatus="i">
                        <tr>
                        <td class="bookNo">${book.bookNo}</td>
                        <td class="bookName"><a href="/notice/bookdetail?bookNo=${book.bookNo}">${book.bookName}</a></td>
                        <td class="bookWriter">${book.bookWriter}</td>
                        <td class="genre">${book.genre}</td>
                        <td class="bookPrice">${book.bookPrice}</td>
                        <td class="publisher">${book.publisher}</td>
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
