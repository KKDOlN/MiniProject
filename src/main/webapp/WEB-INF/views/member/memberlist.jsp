<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOOKTRIX 회원관리</title>
    <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
    <div id="container">
       <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
     
        <main>
            <section class="board-title">
            <h1>회원관리</h1>
            </section>   
            <div class="button-container">
               <div class="search-container">
                   <form class="search-form" action="/notice/membersearch" method="get">
                       <select class="search-select" name="searchCondition">
                           <option value="Allmember">회원 전체 조회</option>
                           <option value="userName">회원 이름으로 조회</option>
                           <option value="userId">회원 아이디로 조회</option>
                       </select>
                       <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
                       <button type="submit" class="search-button">검색</button>
                   </form>
               </div>
               <div class="admin-button">
               		<a href="/member/register" class="btn btn-admin">회원 가입</a>
                   
               </div>
           </div>
           
            <section class="board-content">
                <table class="notice-table">
                <thead>
                    <tr>
                        <th class="userNo">고객번호</th>
                        <th class="userId">고객아이디</th>
                        <th class="userName">이름</th>
                        <th class="userAge">나이</th>
                        <th class="addr">주소</th>
                        <th class="gender">성별</th>
                        <th class="enrolldate">가입일</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach items="${memList}" var="member" varStatus="i">
                        <tr>
                        <td class="userNo">${member.userNo}</td>
                        <td class="userId"><a href="/notice/memberdetail?userNo=${member.userNo}">${member.userId}</a></td>
                        <td class="userName">${member.userName}</td>
                        <td class="userAge">${member.userAge}</td>
                        <td class="addr">${member.addr}</td>
                        <td class="gender">${member.gender}</td>
                        <td class="enrolldate">${member.enrolldate}</td>
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
