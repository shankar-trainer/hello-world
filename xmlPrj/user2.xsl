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

						<xsl:if test="salary[. &gt;=17000 and . &lt;=22000]">
							<tr bgcolor='yellow'>
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
						</xsl:if>

						<xsl:if test="salary[. &gt;=11000 and . &lt;=16000]">
							<tr bgcolor='tomato'>
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
						</xsl:if>


					</xsl:for-each>
					
				</table>


	total salary		<xsl:value-of select="sum(salary)" />
			</body>
		</html>
		
	</xsl:template>


</xsl:stylesheet>