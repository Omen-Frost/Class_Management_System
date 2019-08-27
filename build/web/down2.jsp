<%@ page import="java.io.*"%>
<html>
<head>
   <style>
     div {
            border-radius: 4px;
            background-color: #FDFFD0;
            padding: 20px;
             }
			 .center{
		   margin:auto;
		   width:60%;
		   
		 }
		 a:link, a:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 300px;
             }
			 a:hover,a:active {
              background-color:#45a049;
             }
		
		   body{
				 background-color:#E1D7C3;
				 }
		
        table {
        border-collapse: collapse;
        width: 100%;
        }

th, td {
  margin:10px 300px;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body>
  <div class="center">
  <table>
      <tr><th>File Name</th><th>Download File</th>
        <%
            File f = new File("/home/praagy/Downloads/upload2");
            File[] files = f.listFiles();
            for(int i=0;i<files.length;i++){
            String name=files[i].getName();
            String path=files[i].getPath();
        %>
      <tr><td><%=name%></td><td><a href="download.jsp?f=<%=path%>" class="button">Download File</a></td></tr>
        <%
        }
        %>
   </table>
  </div>
<body>
</html>