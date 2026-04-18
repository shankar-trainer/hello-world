start server by glassfish\bin 
 asadmin start-domain domain1
 
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

While Hibernate's native property hibernate.hbm2ddl.auto supports update, the Jakarta/JPA standard property only recognizes a specific set of actions. If you use update with the standard Jakarta property, most persistence providers will either ignore it or default to none, resulting in no tables being created.

1.The Standard Jakarta OptionsThe JPA specification only defines these four values for jakarta.persistence.schema-generation.database.action:

Value	Behavior
none	No schema generation occurs.
create	Creates the database objects (tables, etc.). It may fail if they already exist.
drop-and-create	Drops existing objects and then creates new ones.
drop	Drops the database objects.




