<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="user">
		<html>
			<body>
				This is user data
				<p style='color:blue;background:pink;'>
					Id
					<xsl:value-of select="id" />
					name
					<xsl:value-of select="name" />
					Salary
					<xsl:value-of select="salary" />
					Location
					<xsl:value-of select="location" />
				</p>
			</body>
		</html>
	</xsl:template>


</xsl:stylesheet>