<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="user">
		<html>
			<body>
				<table border='1'>
					<tr>
						<th>
							Id
						</th>
						<th>
							Name
						</th>
						<th>
							Salary
						</th>
						<th>
							Location
						</th>
					</tr>
					<tr>
						<td>
							<xsl:value-of select="id" />
						</td>
						<td>
							<xsl:value-of select="name" />

						</td>
						<td>
							<xsl:value-of select="salary" />

						</td>
						<td>
							<xsl:value-of select="location" />

						</td>
					</tr>
				</table>
			</body>
		</html>
	</xsl:template>


</xsl:stylesheet>