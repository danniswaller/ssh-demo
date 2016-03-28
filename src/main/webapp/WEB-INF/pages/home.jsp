
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSH Demo</title>
<script type="text/javascript">
    var ctx = '<%=request.getContextPath()%>';
</script>
<link type="text/css" rel="stylesheet"
	href="${ctx}/bootstrap-3.3.6-dist/css/bootstrap.css" />
<style type="text/css">
body {
	padding-top: 70px;
	padding-bottom: 30px;
}
</style>
<script type="text/javascript" src="${ctx}/jquery-2.2.2.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">SSHdemo</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">用户 </a></li>
					<li><a href="#">角色 </a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container ">
		<h2 class="sub-header">用户管理</h2>


		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>用户名</th>
						<th>邮箱</th>
						<th>客户类型</th>
						<th>上次登录IP</th>
						<th>上次登录时间</th>
					</tr>
				</thead>
				<tbody id="usercontent">

				</tbody>
			</table>
		</div>
		<nav>
			<ul class="pagination pull-right" id="pageContent">


			</ul>
		</nav>
	</div>
	<script type="text/javascript">
	    var currentPage=1;
	//    var totalPages=0;
	    var onPageNumberClick=function(page){
	    	    currentPage=page;
	    //	    preparePages(currentPage);
	    	    listusers(currentPage);
	    }
	/* 
	 var preparePages=function(currentPage){
		
	 } */
       var listusers=function(startPage){
        	       $.getJSON("users/list?startPage="+(startPage-1)+"&pageSize=10",function(data){
        	    	   var users=data.content;
        	    	   var userlistcontent='';
        	    	 totalPages=data.totalPages;
        	    	  
        	    	//   console.log(data.totalPages);
                        for(var i=0;i<users.length;i++){
                        	  userlistcontent+='<tr><td>'+users[i].username+ '<td><td>'+users[i].id+'</td></tr>'
                        }
                 $('#usercontent').html(userlistcontent);
                 var totalPageContent='';
        		 console.log(totalPages)
        		 for(var j=1;j<=totalPages;j++){
               	  if(j==currentPage){
               	  totalPageContent+='<li class="active"><a href="#" onclick="onPageNumberClick(' + j + ')">' + j + '</a></li>';}
               	  else{
               		totalPageContent += '<li><a href="#"  onclick="onPageNumberClick(' + j + ')">' + j + '</a></li>';
               	  }
                 }
        		  $('#pageContent').html(totalPageContent);
        	       }
        	       )
       }
           $(document).ready(function(){
        	    onPageNumberClick(1);
           })
     </script>
</body>
</html>
