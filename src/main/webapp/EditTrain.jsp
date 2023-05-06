<%@page import="dao.Traindao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Train</title>
</head>
<body>
<%=  Traindao dao=new Traindao(); %>
<% Train train =dao.fetch(Integer.parseInt(req.getParameter("number"))); %>

 
<form action="updatetrain" method="post" >
Train Number : <input type="number" name="tnumber" value=" <%= train.getNumber()%>" readonly="readonly"><br>
Train Name : <input type="text" name="tname" value=" <%= train.getName()%>"><br>
Number of seats : <input type="number" name="tseat" value=" <%= train.getSeat()%>"><br>
Stations : <textarea rows="5" cols="30" name="tstation"  value=" <%=Arrays.toString( train.getStations())%>"></textarea><br>
Ticket Price :<textarea rows="5" cols="30" name="tprice" value=" <%=Arrays.toString( train.getPrice())%>" ></textarea><br>
Time : <textarea rows="5" cols="30" name="ttime" value=" <%=Arrays.toString( train.getTime())%>"></textarea><br>
Days : <textarea rows="5" cols="30" name="tdays" value=" <%=Arrays.toString( train.getDays())%>"></textarea><br><br><br>
<button type="reset">Cancel</button><button>Add</button> <br>

</form>
</body>
</html>