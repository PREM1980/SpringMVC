<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<%@ include file="css.jsp" %>


<style> 
.textbox {
   width: 200px;
   height: 20px;
   border: solid 1px #000000;
   padding: 2px;
   border-radius: 5px;
   font-size: 12px;
   box-shadow: 0px 1px 2px 0px #9C9C9C;
   background-color: #FAF7F7;
   outline: none;
   color: #474747;
  }
.textbox:hover  {
   border: 1px solid #000000;
   box-shadow: inset 1px 1px 0px 0px #FFFFFF;
   text-shadow: 1px 1px 0px #FFFFFF;
   background-color: #FFFFFF;
  }
.textbox:focus  {
   border: solid 1px #000000;
   box-shadow: inset 0px 1px 2px 0px #7A7575;
   background-color: #FFFFFF;
  }
.textbox:active  {
   border: solid 1px #000000;
   box-shadow: inset 1px 1px 0px 0px #FFFFFF;
   text-shadow: 1px 1px 0px #FFFFFF;
   background-color: #FFFFFF;
  }
  
.labels{
	width:150px;
	display:block;
	float:left;
}
</style> 
<script>
$(document).ready(function(){    
	$( "#datepicker" ).datepicker({
	      showOn: "button",
	      buttonImage: "images/calendar.gif",
	      buttonImageOnly: true,
	      buttonText: "Select date"
	    });
});
</script>
<body>


<h2>Student Information</h2>
<form:form method="POST" action="/SpringMVC/addStudent" modelAttribute="studentdetailBean" commandName="studentdetailBean">
	
    <br><br>
    <form:label path="st.fname" class="labels">First Name</form:label>
    <form:input path="st.fname" class="textbox" />
    
  <br><br>
    
        <form:label path="st.fname" class="labels">First Name</form:label>
        <form:input path="st.fname" class="textbox" />
    <br><br>
        <form:label path="st.mname" class="labels">Middle Name</form:label>
        <form:input path="st.mname" class="textbox" />
    <br><br>
        <form:label path="st.lname" class="labels">Last Name</form:label>
        <form:input path="st.lname" class="textbox" />
    <br><br>
        <form:label path="st.age" class="labels">Age</form:label>
        <form:input path="st.age" class="textbox" />
  	<br><br>
   	    <form:label path="st.dob" class="labels">Date of Birth</form:label>
        <form:input path="st.dob" type="text" class="textbox" id="datepicker" />
      <br><br>
      	<form:label path="st.gender" class="labels">Gender</form:label>
        <form:radiobuttons path="st.gender" items="${genderlist}" />
    
      <br><br>
  
        <form:label path="st.birthplace" class="labels">BirthPlace</form:label>
        <form:input path="st.birthplace" class="textbox" />
    
    <br><br>
    
        <form:label path="st.nationality" class="labels">Nationality</form:label>
        <form:input path="st.nationality" class="textbox" />
    <br><br>
    
    
        <form:label path="st.mothertongue" class="labels">Mother Tongue</form:label>
        <form:input path="st.mothertongue" class="textbox" />
    
    <br><br>
    
        <form:label path="st.religion" class="labels">Religion</form:label>
        <form:input path="st.religion" class="textbox"/>
    <br><br>
    <br><br>
    	----------------CONTACT DETAILS-------------------
    <br><br>
    <br><br>
    
        <form:label path="ci.addr1" class="labels">Address Line 1</form:label>
        <form:input path="ci.addr1" class="textbox"/>
    
    <br><br>
    
        <form:label path="ci.addr2" class="labels">Address Line 2</form:label>
        <form:input path="ci.addr2" class="textbox"/>
    
    <br><br>
    
        <form:label path="ci.city" class="labels">City</form:label>
        <form:input path="ci.city" class="textbox" />
    
    <br><br>
    
        <form:label path="ci.state" class="labels">State</form:label>
        <form:input path="ci.state" class="textbox" />
    
    <br><br>
    
        <form:label path="ci.pin" class="labels">PIN code</form:label>
        <form:input path="ci.pin" class="textbox" />
    <br><br>
    
    
        <form:label path="ci.country" class="labels">Country</form:label>
        <form:input path="ci.country" class="textbox" />
    
    <br><br>
    
        <form:label path="ci.phone" class="labels">Phone</form:label>
        <form:input path="ci.phone" class="textbox" />
    
    <br><br>
    
        <form:label path="ci.mobile" class="labels">Mobile</form:label>
        <form:input path="ci.mobile" class="textbox" />
    
    <br><br>
    
        <form:label path="ci.email" class="labels">Email</form:label>
        <form:input path="ci.email" class="textbox" />
    
    <br><br>
    
            <input type="submit" value="Submit"/>
        
    <br>
    
   
</form:form>
</body>
</html>