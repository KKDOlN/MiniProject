<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 대여 관리 - 책관리 검색 목록</title>
		<link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
	<body>
		<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>

			<main>
				<section class="board-title">
					<h1>대여검색 결과</h1>
				</section>
				<div class="search-container">
					<form class="search-form" action="/notice/librarysearch" method="get">
						<select class="search-select" name="searchCondition">
							<option value="Allrent" <c:if test="${searchCondition eq 'Allrent' }">selected</c:if>>대여 관리 전체 조회</option>
							<option value="userId" <c:if test="${searchCondition eq 'userId' }">selected</c:if>>회원 아이디로 대여 조회</option>
							<option value="bookNo" <c:if test="${searchCondition eq 'bookNo' }">selected</c:if>>책번호로 대여 조회</option>
						</select>
						<input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요" value="${searchKeyword }">
						<button type="submit" class="search-button">검색</button>
					</form>
					  
					<a href="/library/register" class="btn btn-admin">대여 정보 추가</a>
				</div>
				
				<section class="board-content">
					<table class="notice-table">
						<thead>
							<tr>
								<th class="num">대여번호</th>
								<th class="num">책번호</th>
								<th class="writer">고객아이디</th>
								<th class="date">대여일</th>
								<th class="date">반납일</th>
							</tr>
						</thead>
						<tbody>
							<!-- 
								varStatus는 반복과정에서 반복 상태 정보를 담을 수 있게하는 속성
								* 1~2 결과값이 정수 
								1. index: 현재 반복의 0부터 시작하는 인덱스 번호
								2. count: 반복된 항목의 수, 1부터 시작하는 번호
								* 3~6 결과값이 true, false
								3. first: 첫번째면 true, 아니면 false
								4. last: 마지막이면 true, 아니면 false
								5. even: 짝수 번째면 true, 아니면 false
								6. odd: 홀수 번째면 true, 아니면 false
							-->
							
							<c:forEach items="${searchList}" var="library" varStatus="i">
							
								<tr>
									<td class="num">${library.leaseNo }</td>
									<td class="num"><a href="/notice/bookdetail?bookNo=${library.bookNo }">${library.bookNo }</a></td>
									<td class="writer">${library.userId }</td>
									<td class="date" align="center">${library.leaseDate }</td>
									<td class="date" align="center">${library.returnDate }</td>
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