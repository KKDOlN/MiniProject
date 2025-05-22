<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	<title>회원 관리</title>
	<link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
		<main> 
		<form action="/member/modify" method="post" class="book-form">
			<article class="notice-detail">
				<div class="form-group">
					<h1 class="notice-header">회원 정보 수정</h1>
					<h2 class="notice-title">고객번호 : ${notice.userNo }</h2>
					<input type="hidden" name="userNo" value="${notice.userNo}">
					
				</div>
				<div class="form-group">
					<label>아이디 : </label>
						<input type="text" id="userId" name="userId" value = "${notice.userId}" size="100">
				</div>
				<div class="form-group">
						<label>이름 : </label> 
							<input type="text" id="userName" name="userName" value = "${notice.userName }" size="100">
				</div>
				<div class="form-group">
						<label>나이 : </label> 
							<input type="text" id="userAge" name="userAge" value = "${notice.userAge }" size="100">
				</div>
				<div class="form-group">
						<label>주소 : </label> 
							<input type="text" id="addr" name="addr" value = "${notice.addr }" size="100">
				</div>
				<div class="form-group">
						<label>성별 :</label>
						<input type="text" id="gender" name="gender" value = "${notice.gender }" size="100">
				</div>
			</article>
			<div class="button-group">
				<div class="admin-button">
				</div>
				<div class="navigation-buttons">
					<button type="submit" class="btn btn-primary">수정</button>
					<a href="/notice/memberlist" class="btn btn-secondary">취소</a>
					<a href="/member/delete?userNo=${notice.userNo }" class="btn btn-secondary">삭제</a>
				</div>
			</div>
		</form>
		</main>
	</div>		
</body>
</html>