<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed"
              data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
              aria-expanded="false">
        <span class="sr-only">Toggle navigation</span> <span
          class="icon-bar"></span> <span class="icon-bar"></span> <span
          class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${ctx}/home">SSHdemo</a>
    </div>
    <div class="collapse navbar-collapse"
         id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="${currentPage=='user'?'active':''}"><a href="${ctx}/user">用户 </a></li>
        <li class="${currentPage=='role'?'active':''}"><a href="${ctx}/role">角色 </a></li>
      </ul>
    </div>
  </div>
</nav>