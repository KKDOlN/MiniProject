<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서대여 관리</title>
		
        <link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
			<main>
			<form action="/book/modify" method="post" class="book-form">
				<article class="notice-detail">
					<div class="notice-header">
						<h2 class="notice-title">도서코드 : ${notice.bookNo }</h2>
						<input type="hidden" name="bookNo" value="${notice.bookNo}">
						
					</div>
					<div class="notice-header">
							<span>제목 : <input type="text" id="bookName" name="bookName" value = "${notice.bookName}"></span>
					</div>
					<div class="notice-header">
							<span>저자 : <input type="text" id="bookWriter" name="bookWriter" value = "${notice.bookWriter }"></span>
					</div>
					<div class="notice-header">
							<span>장르 : <input type="text" id="genre" name="genre" value = "${notice.genre }"></span>
					</div>
					<div class="notice-header">
							<span>가격 : <input type="text" id="bookPrice" name="bookPrice" value = "${notice.bookPrice }"></span>
					</div>
					<div class="notice-header">
							<span>제작사 : <input type="text" id="publisher" name="publisher" value = "${notice.publisher }"></span>
					</div>
				</article>
				<div class="button-group">
					<div class="admin-button">
					</div>
					<div class="navigation-buttons">
						<button type="submit" class="btn btn-primary">수정</button>
						<a href="/book/delete?bookNo=${notice.bookNo }" class="btn btn-secondary">삭제</a>
					</div>
				</div>
			</form>
			</main>
		</div>		
	</body>
</html>