<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>SSH Demo</title>
  <script type="text/javascript">
    var ctx = '<%=request.getContextPath() %>';
  </script>
  <link type="text/css" rel="stylesheet" href="${ctx}/bootstrap-3.3.6-dist/css/bootstrap.css"/>
  <link type="text/css" rel="stylesheet" href="${ctx}/font-awesome-4.5.0/css/font-awesome.css"/>
  <script type="text/javascript" src="${ctx}/jquery-2.2.2.js"></script>
  <style type="text/css">
    body {
      padding-top: 70px;
      padding-bottom: 30px;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SSH Demo</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active">
          <a href="#">用户 </a>
        </li>
        <li>
          <a href="#">角色</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
  <div class="page-header">
    <h1>用户
      <small></small>
    </h1>
  </div>

  <center><i id="loadingCircle" class="fa fa-spinner fa-pulse fa-5x"></i></center>

  <div id="userTable" class="table-responsive">
    <table class="table table-striped">
      <thead>
      <tr>
        <th>#ID</th>
        <th>用户名</th>
      </tr>
      </thead>
      <tbody id="userContent"></tbody>
    </table>
    <nav>
      <ul class="pagination pull-right" id="pageToolContent">

      </ul>
    </nav>
  </div>
</div>
<script type="text/javascript">

  var currentPage = 1;

  var onPageNumberClick = function (page) {
    currentPage = page;
    preparePages(currentPage);
    listUsers(currentPage);
  };


  var preparePages = function (currentPage) {
    $.getJSON('users/count', function (data) {
      var pages = parseInt(data / 4) + ((data % 4) > 0 ? 1 : 0 );

      var pageToolContent = '<li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>';
      for (var i = 1; i <= pages; i++) {
        if (i == currentPage) {
          pageToolContent += '<li class="active"><a href="#" onclick="onPageNumberClick(' + i + ')">' + i + '</a></li>';
        } else {
          pageToolContent += '<li><a href="#"  onclick="onPageNumberClick(' + i + ')">' + i + '</a></li>';
        }
      }
      pageToolContent += '<li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>';

      $('#pageToolContent').html(pageToolContent);


    });
  };


  var listUsers = function (startPage) {

    $('#loadingCircle').show();
    $('#userTable').hide();


    $.getJSON('users/list?startPage=' + (startPage - 1) + '&pageSize=4', function (data) {
      var users = data.content;

      var userListContent = '';

      for (var i = 0; i < users.length; i++) {
        var user = users[i];
        userListContent += '<tr><td>' + user.id + '</td><td>' + user.username + '</td></tr>';
      }

      $('#userContent').html(userListContent);

      $('#loadingCircle').hide();
      $('#userTable').show();

    });

  };

  $(document).ready(function () {

    onPageNumberClick(1);

  });
</script>
</body>
</html>
