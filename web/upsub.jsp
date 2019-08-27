
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>File Uploading Form</title>
	  <style type="text/css">
	          body{
			     display: inline-block;
				 background-color:#E1D7C3;
				 }
				 div {
            border-radius: 4px;
            background-color: #FDFFD0;
            padding: 20px;
             }
	         .custom-file-upload {
              border: 1px solid #ccc;
              display: inline-block;
              padding: 6px 12px;
              cursor: pointer;
              }
	         input[type=submit] {
                  width: 50%;
				  text-align:center;
                  background-color: #4CAF50;
                  color: white;
                  padding: 10px 10px;
                  margin: 10px 10px;
                  border: none;
                  border-radius: 4px;
                  cursor: pointer;
               }
		      input[type=submit]:hover {
                   background-color:#45a049;
               }	
	  </style>
   </head>
   
   <body>
   <div>
      <h3>File Upload:</h3>
      <label class="custom-file-upload">Select a file to upload: <br />
      <form action = "FileServlet2" method = "post"
         enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "50" /></label>
         <br />
         
         <input type = "submit" value = "Upload File" margin=10px auto />
      </form>
	 </div>
   </body>
   
</html>