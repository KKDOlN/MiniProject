<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 관리 - 회원관리 검색 목록</title>
		<link rel="stylesheet" href="../../../resources/css/bookmanagement.css">
	</head>
	<body>
		<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>

			<main>
				<section class="board-title">
					<h1>회원검색 결과</h1>
				</section>
				<div class="search-container">
					<form class="search-form" action="/notice/membersearch" method="get">
						<select class="search-select" name="searchCondition">
							<option value="Allmember" <c:if test="${searchCondition eq 'Allmember' }">selected</c:if>>회원 전체 조회</option>
							<option value="userName" <c:if test="${searchCondition eq 'userName' }">selected</c:if>>회원 이름으로 조회</option>
							<option value="userId" <c:if test="${searchCondition eq 'userId' }">selected</c:if>>회원 아이디로 조회</option>
						</select>
						<input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요" value="${searchKeyword}" >
						<button type="submit" class="search-button">검색</button>
						
						<a href="/member/register" class="btn btn-admin">회원 가입</a>
                 	    <a href="/member/modify" class="btn btn-admin">회원 정보 수정</a>
                		<a href="/member/delete" class="btn btn-admin">회원 탈퇴</a>
					</form>
				</div>
				
				
				<section class="board-content">
					<table class="notice-table">
						<thead>
							<tr>
								<th class="userId">고객아이디</th>
								<th class="userName">이름</th>
								<th class="userAge">나이</th>
								<th class="gender">성별</th>
								<th class="addr">주소</th>
								<th class="enrolldate">가입일</th>
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
							
							<c:forEach items="${searchList}" var="member" varStatus="i">
							
								<tr>
									<td class="userId" align="center">${member.userNo }</td>
									<td class="userName" align="center"><a href="/notice/memberdetail?memberNo=${member.userId }">${member.userName }</a></td>
									<td class="userAge" align="center">${member.userAge }</td>
									<td class="gender" align="center">${member.gender }</td>
									<td class="addr">${member.addr }</td>
									<td class="enrolldate" align="center">${member.enrolldate }</td>
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