<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Friendly  Pets</title>
	<style>
	<%@ include file="/WEB-INF/resources/css/contactUs.css"%>
	</style>
</head>

<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div class="contact">
	<div class="contact-section w3-red">
				<div class="container ">
				<form>
					<div class="col-md-4  ">
			  			<div class="form-group">
			  			<label for="title"><span style="font-size:25px; font-color:black;">Get in touch with us</span></label><br>
			  				<label for="exampleInputUsername">Your name</label>
					    	<input type="text" class="form-control" id="" placeholder=" Enter Name">
				  		</div>
				  		<div class="form-group">
					    	<label for="exampleInputEmail">Email Address</label>
					    	<input type="email" class="form-control" id="exampleInputEmail" placeholder=" Enter Email id">
					  	</div>	
					  	<div class="form-group">
					    	<label for="telephone">Mobile No.</label>
					    	<input type="tel" class="form-control" id="telephone" placeholder=" Enter 10-digit mobile no.">
			  			</div>
			  	
			  		
			  			<div class="form-group">
			  				<label for ="description"> Message</label>
			  			 	<textarea  class="form-control" id="description" placeholder="Enter Your Message"></textarea>
			  			</div>
			  			<div style="padding-top: 7px">
			  				<button type="button" class="btn btn-default submit"><i class="fa fa-paper-plane" aria-hidden="true"></i>  Send Message</button>
			  			</div>
			  			
						</div>
				</form>
			</div>
		</div>
		<!--Close of contact  -->
		<div class="map-section">
					  <iframe id="frameSection" src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d3736489.7218514383!2d90.21589792292741!3d23.857125486636733!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sbd!4v1506502314230"
					  |	  frameborder="0" style="border:0" allowfullscreen></iframe>
		</div> 
</div>
<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>