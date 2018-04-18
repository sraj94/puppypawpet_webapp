<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Puppy Paws Pet</title>
 <style> 
 	<%@ include file="/WEB-INF/resources/css/pageLayout.css"%>
 </style>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<div class="contentSection">
	<div class="container">
       <div class="col-lg-6 col-lg-offset-3">
            <div class="form-group inner-form">
                   <form role="form">
            		   <div class="row">
        			    	<div class="col-lg-12">
        			    	    <label>Email</label>
        			    	    <div class="form-group">
        			    			<input type="email" name="email" id="email" class="form-control" >
        			    		</div>
        			    	</div>
        			    	
        			    	<div class="col-lg-12">
        			    	    <label>Password</label>
        			    	    <div class="form-group">
        							<input type="password" name="password" id="password" class="form-control" >
        			    		</div>
        			    	</div>
        			    	
        					<div class="col-lg-12">
        					    <button type="submit" class="btn btn-default">
        							<span>LOGIN</span>
        						</button>
        					</div>
        					
            			 </div>
            	     </form>
                </div> <!-- inner-form -->
		</div>   
	</div> 
	</div>
<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
</body>
</html>