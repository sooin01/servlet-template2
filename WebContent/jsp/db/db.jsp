<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB 조회</title>
<script type="text/javascript" src="/resources/js/jquery/jquery-1.2.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#selectTable").click(function() {
		$.get("/jsp/db/db1.jsp", {name: "Korea"}, function(data) {
			$("#db1").html(data);
		});
	});
});
</script>
</head>
<body>

<div>
	테이블목록:
	<select id="tableList">
		<option value="user">user</option>
	</select>
	<button id="selectTable">눌러</button>
</div>

<div id="db1"></div>

</body>
</html>