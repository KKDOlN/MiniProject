<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BOOKTRIX 책관리 검색 목록</title>

		<link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>

			<main>
				<section class="board-title">
					<h1>도서검색 결과</h1>
				</section>
				<div class="button-container">
					<div class="search-container">
					<form class="search-form" action="/notice/booksearch" method="get">
						<select class="search-select" name="searchCondition">
							<option value="bookTitle" <c:if test="${searchCondition eq 'bookTitle' }">selected</c:if>>제목</option>
							<option value="bookCode" <c:if test="${searchCondition eq 'bookCode' }">selected</c:if>>도서코드</option>
							<option value="bookWriter" <c:if test="${searchCondition eq 'bookWriter' }">selected</c:if>>저자</option>
						</select>
						<input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요" value="${searchKeyword }">
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
								<th class="num">도서코드</th>
								<th class="title">제목</th>
								<th class="writer">저자</th>
								<th class="date">출판사</th>
								<th class="views">장르</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${searchList}" var="book" varStatus="i">
							
								<tr>
									<td class="num">${book.bookNo }</td>
									<td class="title"><a href="/notice/bookdetail?bookNo=${book.bookNo }">${book.bookName }</a></td>
									<td class="writer">${book.bookWriter }</td>
									<td class="date">${book.publisher }</td>
									<td class="views">${book.genre }</td>
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