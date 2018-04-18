<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Reset Password</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
	
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
	<div>
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	</div>
	
	<div class="contentSection" style="display: flex;">

		<div class="container" style="padding-top:50px;"> 
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="text-center">
								<h3>
									<i class="fa fa-lock fa-4x"></i>
								</h3>
								<h2 class="text-center">Forgot Password?</h2>
								<p>You can reset your password here.</p>
								<div class="panel-body">

									<form id="register-form" role="form" autocomplete="off"
										class="form" method="post">

										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon"><i
													class="glyphicon glyphicon-envelope color-blue"></i></span> <input
													id="email" name="email" placeholder="email address"
													class="form-control" type="email">
											</div>
										</div>
										<div class="form-group">
											<input name="recover-submit"
												class="btn btn-lg btn-primary btn-block"
												value="Reset Password" type="submit">
										</div>

										<input type="hidden" class="hide" name="token" id="token"
											value="">
									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div>
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
	</div>
</body>
</html>