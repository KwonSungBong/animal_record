<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="now" class="java.util.Date" />
<c:url var="logoutUrl" value="/logout" />
<html>
<head>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bower_components/jquery-ui/themes/base/jquery-ui.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/home/base.css?${now.time}" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/home/home.css?${now.time}" />
</head>
<body>
<div id="title">
	<div class="l-right-group">
		<form action="${logoutUrl}" id="logout" method="post">
			<button class="btn btn-sm btn-primary btn-block" type="submit">로그아웃</button>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
	<h3>동물기록</h3>
</div>
<div id="wrapper">
	<div id="header">
		<div class="input-group">
			<span class="input-group-btn">
				<button id="search" class="btn btn-default" type="button">검색</button>
			</span>
			<input id="search_name" type="text" class="form-control" placeholder="Search for...">
		</div>
	</div>
	<div id="content">
		<div class="l-row-half-3-bottom-of-top">
			<div class="l-col-half-4-left">
				<div class="head">
					<span class="text-head">동물기록</span>
				</div>
				<div class="body">
					<div class="table-head">
						<table class="table">
							<colgroup>
								<col class="" style="width:100px;"/>
								<col class="" style="width:100px;"/>
								<col class="" style="width:100px;"/>
								<col class="" style="width:100px;"/>
								<col class="" style="width:auto;"/>
							</colgroup>
							<thead>
							<tr>
								<th>이름</th>
								<th>종류</th>
								<th>성</th>
								<th>등록일자</th>
								<th></th>
							</tr>
							</thead>
						</table>
					</div>
					<div class="table-body">
						<div>
							<table class="table">
								<colgroup>
									<col class="" style="width:100px;"/>
									<col class="" style="width:100px;"/>
									<col class="" style="width:100px;"/>
									<col class="" style="width:100px;"/>
									<col class="" style="width:auto;"/>
								</colgroup>
								<tbody id="animal_records">
									<tr>
										<td colspan="5">
											검색결과가 없습니다.
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="table-body-scroll"><div class="table-body-size"></div><div class="table-body-dummy"></div></div>
			</div>
			<div class="l-col-half-4-left-of-right">
				<div class="head">
					<div class="l-right-group">
						<a id="save_animal_detail_record" class="">
							저장
						</a>
						<a id="update_animal_detail_record" class="">
							수정
						</a>
						<a id="create_animal_detail_record" class="">
							추가
						</a>
						<a id="destroy_animal_detail_record" class="">
							삭제
						</a>
					</div>
					<span class="text-head">동물 상세 기록</span>
				</div>
				<div id="animal_detail_record" class="body">
				</div>
			</div>
		</div>
		<div id="replies" class="l-row-half-3-bottom">
			<div class="head">
				<div class="l-right-group">
					<a id="save_reply" class="">
						저장
					</a>
					<a id="create_reply" class="">
						추가
					</a>
					<a id="destroy_reply" class="">
						삭제
					</a>
				</div>
				<span class="text-head">덧글</span>
			</div>
			<div class="body">
				<div class="table-head">
					<table class="table">
						<colgroup>
							<col class="" style="width:50px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:500px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:auto;"/>
						</colgroup>
						<thead>
						<tr>
							<th>선택</th>
							<th>키</th>
							<th>내용</th>
							<th>등록일자</th>
							<th>수정일자</th>
							<th></th>
						</tr>
						</thead>
					</table>
				</div>
				<div class="table-body use-foot">
					<div>
						<table class="table">
							<colgroup>
								<col class="" style="width:50px;"/>
								<col class="" style="width:200px;"/>
								<col class="" style="width:500px;"/>
								<col class="" style="width:200px;"/>
								<col class="" style="width:200px;"/>
								<col class="" style="width:auto;"/>
							</colgroup>
							<tbody id="reply_tbody"></tbody>
						</table>
					</div>
				</div>
				<div class="table-foot">
					<table class="table">
						<colgroup>
							<col class="" style="width:10px;"/>
							<col class="" style="width:50px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:500px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:200px;"/>
							<col class="" style="width:30px;"/>
							<col class="" style="width:auto;"/>
						</colgroup>
						<tfoot>
						<tr>
							<td id="reply_tfoot" colspan="8"></td>
						</tr>
						</tfoot>
					</table>
				</div>
			</div>
			<div class="table-body-scroll"><div class="table-body-size"></div><div class="table-body-dummy"></div></div>
		</div>
	</div>
	<div id="footer">
		backbone.js
	</div>
</div>

<script type="text/template" id="animal_record_empty_template">
	<tr>
		<td colspan="5">
			검색결과가 없습니다.
		</td>
	</tr>
</script>

<script type="text/template" id="animal_record_template">
	<td>{{= name }}</td>
	<td>{{= kind }}</td>
	<td>{{= genderType }}</td>
	<td>{{= regDate }}</td>
</script>

<script type="text/template" id="animal_detail_record_select_template">
	<div class="dropdown">
		<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
			동물종류선택
			<span class="caret"></span>
		</button>
		<ul id="animal_record_type_enum" class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
			<c:forEach items="${animalRecordTypeEnum}" var="animalRecordType">
				<li role="presentation"><a class="animal_record_type" role="menuitem" tabindex="-1" href="#">${animalRecordType.name}</a></li>
			</c:forEach>
		</ul>
	</div>
</script>

<script type="text/template" id="mammalia_detail_record_write_form_template">
	<table>
		<tr>
			<td>번호</td>
			<td>{{= idx }}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" value="{{= name }}"/></td>
		</tr>
		<tr>
			<td>종류</td>
			<td><input type="text" value="{{= kind }}"/></td>
		</tr>
		<tr>
			<td>설명</td>
			<td><input type="text" value="{{= description }}"/></td>
		</tr>
		<tr>
			<td>성</td>
			<td>{{= genderType }}</td>
		</tr>
		<tr>
			<td>생일</td>
			<td>{{= birthday }}</td>
		</tr>
		<tr>
			<td>등록일</td>
			<td>{{= regDate }}</td>
		</tr>
		<tr>
			<td>수정일</td>
			<td>{{= modDate }}</td>
		</tr>
	</table>
</script>

<script type="text/template" id="mammalia_detail_record_read_form_template">
	<table>
		<tr>
			<td>번호</td>
			<td>{{= idx }}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>{{= name }}</td>
		</tr>
		<tr>
			<td>종류</td>
			<td>{{= kind }}</td>
		</tr>
		<tr>
			<td>설명</td>
			<td>{{= description }}</td>
		</tr>
		<tr>
			<td>성</td>
			<td>{{= genderType }}</td>
		</tr>
		<tr>
			<td>생일</td>
			<td>{{= birthday }}</td>
		</tr>
		<tr>
			<td>등록일</td>
			<td>{{= regDate }}</td>
		</tr>
		<tr>
			<td>수정일</td>
			<td>{{= modDate }}</td>
		</tr>
	</table>
</script>

<script>
	var contextPath = '${pageContext.request.contextPath}';
	var animalRecordTypeEnum = '${animalRecordTypeEnumJsonString}';
	var genderEnum = '${genderEnumJsonString}';
	var additionRecordCategoryTypeEnum = '${additionRecordCategoryTypeEnumJsonString}';
	var additionRecordStatusEnum = '${additionRecordStatusEnumJsonString}';
	var additionRecordTypeEnum = '${additionRecordTypeEnumJsonString}';
</script>
<script src="${pageContext.request.contextPath}/resources/bower_components/jquery/dist/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/jquery-ui/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/underscore/underscore-min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/backbone/backbone-min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bower_components/backbone.paginator/lib/backbone.paginator.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/home/base.js?${now.time}"></script>
<script src="${pageContext.request.contextPath}/resources/home/models.js?${now.time}"></script>
<script src="${pageContext.request.contextPath}/resources/home/views.js?${now.time}"></script>
<script src="${pageContext.request.contextPath}/resources/home/home.js?${now.time}"></script>
</body>
</html>