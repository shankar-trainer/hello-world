localhost:4848
JDBC Connection Pool Properties

Pool Name:mysql1

Additional Properties (8)

url jdbc:mysql://localhost:3306/db2

password root
databaseName db2

user root

portNumber 3306

serverName localhost

useSSL false

allowPublicKeyRetrieval false

===============
JDBC Resource

JNDI Name:
jdbc/mysqldatasource
Pool Name:
mysql1

copy mysql-connector.jar glassfish/domains/domain1/lib/ext
create war by maven package

Applications
deploy

postman
add record
post
http://localhost:8080/rest2/api/books
get
http://localhost:8080/rest2/api/books


