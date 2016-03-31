<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <meta name="description" content="Font Awesome, the iconic font and CSS framework">
  <meta name="author" content="Dave Gandy">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>SSH Demo</title>
  <script type="text/javascript">
    var ctx = '<%=request.getContextPath()%>';
  </script>
  <link type="text/css" rel="stylesheet" href="${ctx}/bootstrap-3.3.6-dist/css/bootstrap.css"/>
  <link type="text/css" rel="stylesheet" href="${ctx}/font-awesome-4.5.0/css/font-awesome.css"/>
  <style type="text/css">
    body {
      padding-top: 70px;
      padding-bottom: 30px;
    }
  </style>
  <script type="text/javascript" src="${ctx}/jquery-2.2.2.js"></script>
  <script type="text/javascript" src="${ctx}/bootstrap-3.3.6-dist/js/bootstrap.js"></script>
</head>
<body>
<jsp:include page="common/header.jsp"/>

</body>
</html>
