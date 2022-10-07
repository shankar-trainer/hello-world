<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<tiles:insertTemplate template="layout.jsp">

	<tiles:putAttribute name="header" value="/WEB-INF/tiles/header.jsp"></tiles:putAttribute>
	<tiles:putAttribute name="body" value="/WEB-INF/tiles/body1.jsp"></tiles:putAttribute>
	<tiles:putAttribute name="footer" value="/WEB-INF/tiles/footer.jsp"></tiles:putAttribute>

</tiles:insertTemplate>
