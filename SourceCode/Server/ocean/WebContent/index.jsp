<%@page import="java.util.Random"%>
<%@page import="java.util.Calendar"%>
<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,dao.MemberDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDTO member = new MemberDTO();
	member.setToken("MYTOKEN");
	//member = MemberDAO.insertMember(member);
	member = MemberDAO.selectMember(member);
	
	member.setPoint((new Random()).nextInt(1000));
	MemberDAO.updateMember(member);
	

%>
NUMBER = <%=member.getId() %>
</body>
</html>