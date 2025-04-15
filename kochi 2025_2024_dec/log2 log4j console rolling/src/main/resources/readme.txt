rolling file appender
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="warn">
	<Properties>
		<Property name="basePath">./logs</Property>
	</Properties>

    <Appenders>

        <RollingFile name="File" fileName="${basePath}/FileOutput.log" filePattern="${basePath}/prints-%d{yyyy-MM-dd}.log">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
            <SizeBasedTriggeringPolicy size="500" />
        </RollingFile>

    	<!-- Console appender configuration -->
        <Console name="console" target="SYSTEM_OUT">
            <PatternLayout
                pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n" />
        </Console>
    </Appenders>
    <Loggers>
       <!-- <Logger name="org.example.Test1" level="error" additivity="false">
			<AppenderRef ref="Console" /
			<AppenderRef ref="File" />
		</Logger>-->

    	<!-- Root logger referring to console appender -->
        <Root level="info" additivity="false">
            <AppenderRef ref="console" />
        </Root>
    </Loggers>
</Configuration>

============================
console file appender
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN" monitorInterval="30">
    <Properties>
        <Property name="LOG_PATTERN">%d{yyyy-MM-dd'T'HH:mm:ss.SSSZ} %p %m%n</Property>
    </Properties>

    <Appenders>
        <Console name="console" target="SYSTEM_OUT" follow="true">
            <PatternLayout pattern="${LOG_PATTERN}"/>
        </Console>
    </Appenders>

    <Loggers>
        <Root level="info">
            <AppenderRef ref="console"/>
        </Root>
    </Loggers>
</Configuration>

=====
current rolling file appender
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="warn">
    <Properties>
        <Property name="basePath">./logs</Property>
    </Properties>
    <Appenders>
        <RollingFile name="fileLogger"
                     fileName="${basePath}/app.log"
                     filePattern="${basePath}/app-%d{yyyy-MM-dd}.log">
            <PatternLayout>
                <pattern>[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
                </pattern>
            </PatternLayout>
            <Policies>
                <TimeBasedTriggeringPolicy interval="1" modulate="true" />
                <SizeBasedTriggeringPolicy size="10MB" />
            </Policies>
            <!-- Max 10 files will be created everyday -->
            <DefaultRolloverStrategy max="10">
                <Delete basePath="${basePathr}" maxDepth="10">
                    <!-- Delete all files older than 30 days -->
                    <IfLastModified age="30d" />
                </Delete>
            </DefaultRolloverStrategy>
        </RollingFile>
    </Appenders>
    <Loggers>
        <Root level="info" additivity="false">
            <appender-ref ref="fileLogger" />
        </Root>
    </Loggers>
</Configuration>

