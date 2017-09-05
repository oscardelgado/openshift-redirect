<%
response.setStatus(301);
response.setHeader( "Location", "http://www.google.com" );
response.setHeader( "Connection", "close" );
%>
