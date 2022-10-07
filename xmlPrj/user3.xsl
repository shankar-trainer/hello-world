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
							Salary range
						</th>

						<th>
							Location
						</th>
					</tr>
					<xsl:for-each select="user">

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
								<xsl:choose>
									<xsl:when test="salary[. &gt;=10000 and . &lt;=12000]">
										<xsl:text>poor salary</xsl:text>
									</xsl:when>
									
									<xsl:when test="salary[. &gt;=12000 and  . &lt;=13000]">
										<xsl:text>average salary</xsl:text>
									</xsl:when>
									
									<xsl:when test="salary[. &gt;=13000 and  . &lt;=15000]">
										<xsl:text>good salary</xsl:text>
									</xsl:when>
									
									<xsl:when test="salary[. &gt;=13000 and  . &lt;=20000]">
										<xsl:text>excellent salary</xsl:text>
									</xsl:when>
									
								</xsl:choose>

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