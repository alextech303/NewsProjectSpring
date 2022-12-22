<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="body-title">
	
</div>

<c:forEach var="news" items="${requestScope.news}">
	<div class="single-news-wrapper">
		<div class="single-news-header-wrapper">
			<div class="news-title"></div>
			<div class="news-date"></div>

			<div class="news-content"></div>
		</div>
	</div>

</c:forEach>

<div class="no-news">

	<img src="${pageContext.request.contextPath}/resources/news2.jpg"/>
	
</div>

