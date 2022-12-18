<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


guest info

<div class="body-title">
	<a href="">news >> </a> latest news
</div>

<form action="command.do?method=delete" method="post">
	<c:forEach var="news" items="${news}">
		<div class="single-news-wrapper">
			<div class="single-news-header-wrapper">
				<div class="news-title">
					<c:out value="${news.title}" />
				</div>
				<div class="news-date">
					<c:out value="${news.newsDate}" />
				</div>

				<div class="news-content">
					<c:out value="${news.brief}" />
				</div>
			</div>
		</div>

	</c:forEach>

	<div class="no-news">
		<c:if test="${news eq null}">
        No news.
	</c:if>
	</div>

</form>