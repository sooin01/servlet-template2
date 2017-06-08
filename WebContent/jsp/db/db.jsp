<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB 조회</title>
<script type="text/javascript" src="/resources/js/jquery/jquery-1.2.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#tbl1").click(function() {
		$.get("/jsp/db/db1.jsp", {name: "Republic of Korea"}, function(data) {
			$("#db1").html(data);
		});
	});
});
</script>
</head>
<body>

<h4>jQuery 방식</h4>
<div>
	테이블목록:
	<select id="tblList">
		<option value="user">user</option>
	</select>
	<button id="tbl1">눌러</button>
</div>
<div id="db1"></div>

<br><br><br>

<h4>iFrame 방식</h4>
<form action="/jsp/db/db1.jsp" target="tbl2">
	테이블목록:
	<select id="tblList">
		<option value="user">user</option>
	</select>
	<input type="submit" value="눌러">
</form>
<iframe name="tbl2" frameborder="0" height="100%" width="100%"></iframe>

</body>
</html>