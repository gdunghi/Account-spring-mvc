<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../decorator/header.jsp" />

<div class="col-md-8">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
		<c:forEach items="${userList}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.lastName}</td>
				<td><a href="getArticleUpdate/${item.id}" class="btn btn-info">Update</a>
				</td>
				<td><a href="articleDelete/${item.id}" type="button"
					class="btn btn-danger">Del</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
<jsp:include page="../decorator/footer.jsp" />

