<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%
	List<String> list = new ArrayList<String>();
	list.add("Repulic of Korea");
	list.add("Hong Kong");
	list.add("Singapore");
%>
<table id="table1" border="1">
	<tr>
		<th>번호</th>
		<th>이름</th>
	</tr>
	<%
		for (int i = 0; i < list.size(); i++) {
	%>
		<tr>
			<td><%=i + 1%></td>
			<td><%=list.get(i)%></td>
		</tr>
	<%
		}
	%>
</table>