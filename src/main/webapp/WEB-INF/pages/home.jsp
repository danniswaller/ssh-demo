<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>SSH Demo</title>
  <script type="text/javascript">
    var ctx = '<%=request.getContextPath() %>';
  </script>
  <link type="text/css" rel="stylesheet" href="${ctx}/ext-4.2.1/resources/ext-theme-classic/ext-theme-classic-all.css" />
  <script type="text/javascript" src="${ctx}/ext-4.2.1/ext-all.js"></script>
  <script type="text/javascript" src="${ctx}/scripts/app/app.js"></script>
</head>
<body>
<body>
<p>JSP demo, works!</p>
</body>
</body>
</html>
