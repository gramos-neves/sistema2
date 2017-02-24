<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap3.3.7.min.css" rel="stylesheet">
	<link href="resources/css/estilo.css" rel="stylesheet">
	  <script src="resources/js/jquery.js"></script>
	  <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="container">
<div><!-- Header -->
 
<h2>Dropdowns</h2>
  <p>The .dropdown-header class is used to add headers inside the dropdown menu:</p>
</div>
  
  <!-- Menu -->
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
		<a class="navbar-brand" href="#">System</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
  <!-- Corpo -->
  
		<nav class="navbar navbar-default">
			<div class="container-fluid">
   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
						  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
						  <ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						  </ul>
						</li>
					  </ul>
				  <form class="navbar-form navbar-right">
					<div class="form-group">
					  <input type="text" class="form-control" placeholder="Search">
					</div>
				  </form>
				</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
		</nav>
		<table class="table ">
				<tr>
                          <th>#</th>
                          <th>First Name</th>
                          <th>Last Name</th>
                          <th>Username</th>
                        </tr>
		</table>
		<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
 </div>
</body>
</html>