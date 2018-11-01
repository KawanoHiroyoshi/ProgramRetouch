<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報</title>
<jsp:include page="/baselayout/head.html" />
</head>
<body>
	<jsp:include page="/baselayout/header.jsp" />
	<br>
	<br>
	<div class="container">
		<div class="row center">
			<h5 class=" col s12 light">ユーザー情報</h5>
		</div>
		<div class="row">
			<div class="col s12">
				<div class="card grey lighten-5">
					<div class="card-content">
						<form action="UserDataUpdateConfirm" method="POST">
							<c:if test="${validationMessage != null}">
								<p class="red-text center-align">${validationMessage}</p>
							</c:if>
							<br> <br>
							<div class="row">
								<div class="input-field col s6">
									<input type="text" name="user_name" value="${udb.name}"> <label>名前</label>
								</div>
								<div class="input-field col s6">
									<input type="text" name="login_id" value="${udb.loginId}"> <label>ログインID</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<input type="text" name="user_address" value="${udb.address}"> <label>住所</label>
								</div>
							</div>
							<div class="row">
								<div class="col s12">
									<button class="btn  waves-effect waves-light  col s4 offset-s4" type="submit" name="action">更新</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!--  購入履歴 -->
			<c:if test = "${ubdb[0].createDate != null}">
		<div class="row">
			<div class="col s12">
				<div class="card grey lighten-5">
					<div class="card-content">

						<table class="bordered">
							<thead>

								<tr>
									<th style="width: 10%"></th>
									<th class="center"><label>購入日時</label></th>
									<th class="center">配送方法</th>
									<th class="center">購入金額</th>



								</tr>

							</thead>

							<tbody>
							<tr>
									<td class="center"><a href="UserBuyHistoryDetail?buy_id=<"class="btn-floating btn waves-effect waves-light "> <i class="material-icons">details</i></a></td>
									<td class="center">${ubdb[0].createDate}</td>
									<td class="center">${ubdb[0].delivery_Method}</td>
									<td class="center">${ubdb[0].total_Price}</td>

								</tr>
								<c:forEach  begin="2" end="${ubdb.size()}" varStatus="status" >
								<tr>

									<td class="center"><a href="UserBuyHistoryDetail?buy_id=<"class="btn-floating btn waves-effect waves-light "> <i class="material-icons">details</i></a></td>
									<td class="center">${ubdb[status.count].createDate}</td>
									<td class="center">${ubdb[status.count].delivery_Method}</td>
									<td class="center">${ubdb[status.count].total_Price}</td>



								</tr>

								</c:forEach>


							</tbody>

						</table>

					</div>
				</div>
			</div>
		</div>
		</c:if>
	</div>
	<jsp:include page="/baselayout/footer.jsp" />
</body>
</html>