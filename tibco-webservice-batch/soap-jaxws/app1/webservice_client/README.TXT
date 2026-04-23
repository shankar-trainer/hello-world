make any directory  
C:\test\temp1

C:\test\temp1>set PATH=%PATH%;D:\software\extracted\openjdk-21.0.2_windows-x64_bin\jdk-21.0.2\bin

C:\test\temp1>set JAVA_HOME=D:\software\extracted\openjdk-21.0.2_windows-x64_bin\jdk-21.0.2

C:\test\temp1>D:\software\zip\soap\apache-cxf-4.2.0\bin\wsdl2java -p   com.cts.webservice -d ./src -client   http://localhost:8080/Calcws/calc?wsdl