<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
  <div align="left">

<a href="newsList">news >> </a> add news

<div>
 <br> 
      <form:form action="saveNews" modelAttribute="news" method="POST">		
			
		<label> news title <br />
		 <style type="text/css"> 
           textarea[name="title"] { resize: none; }
            </style>
            <textarea name="title" cols="90" rows="5" required="required"/></textarea> <br /> </label>
        <br>
        
        <label> news brief <br />
			<style type="text/css"> 
           textarea[name="brief"] { resize: none; }
            </style>
            <textarea name="brief" cols="90" rows="5" required="required"/></textarea> <br /> </label>
            
        <br>
       					
		<label> news content <br />	
         <style type="text/css"> 
           textarea[name="content"] { resize: none; }
            </style>
            <textarea name="content" cols="90" rows="15" required="required"/></textarea> <br /> </label>
            
            <label> news date <br />
		<input type="date" name="newsDate" required="required"/><br /> </label>
           
  
  <br>
  
    <input type="submit" value="Save" class="save" />
  
   </form:form>
  </div>
  </div>
  </body>