<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="login" method="post"  theme="simple">
                  用户名:<s:textfield name="userid"></s:textfield><br>
        <!-- 
        <s:fielderror></s:fielderror> -->
        ${fieldErrors["userid"][0]}    <br>  
                  密码:<s:textfield name="pwd"></s:textfield><br>
		<s:submit value="提交"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>
</body>
</html>