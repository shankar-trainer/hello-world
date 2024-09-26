<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<title><tiles:getAsString name="pageTitle"/></title>
<style type="text/css">@import url(CSS/main.css);</style>
</head>
<body>
    <tiles:insertAttribute name="header"/> 
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>
</body>
</html>
