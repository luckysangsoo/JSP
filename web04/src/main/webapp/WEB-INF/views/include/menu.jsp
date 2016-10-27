<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- pageContext.request.contextPath
컨텍스트 이름을 리턴(request.getContext()과 같음) -->
<!-- set var="변수명" value="값" -->
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!-- WEB-INF/views/include/header.jsp -->
<!-- 상단메뉴 구성 -->
<div style="text-align: center;">
    <!-- <a href="/web04/guestbook/list">방명록</a> -->
	<a href="${path}/guestbook/list">방명록</a>
	수산물관리
	상품관리
	장바구니
	게시판
	로그인
	로그아웃
</div>
<hr>