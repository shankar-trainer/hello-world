<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="users">
		<html>
			<body>
				<table border='1' bgcolor='aqua' align='center'>
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
					<xsl:for-each select="user">
						<xsl:sort select="salary"/>
							<tr bgcolor='pink'>
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

					</xsl:for-each>

				</table>
			</body>
		</html>

	</xsl:template>


</xsl:stylesheet>