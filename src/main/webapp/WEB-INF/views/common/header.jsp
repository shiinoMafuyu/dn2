<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	String version = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
%>

<!-- css -->
<link rel="stylesheet" href="<%=basePath%>/css/style.css" type="text/css">



<!-- js -->
<script type="text/javascript" src="<%=basePath%>/js/common.js"></script>