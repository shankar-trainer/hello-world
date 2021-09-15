inside pgsql\bin

1.initdb.exe -D c:\Users\admin\pgdata -U postgres -W -E UTF8 -A scram-sha-256

password admin

installation complete
2. server start
 pg_ctl.exe -D c:\Users\admin\pgdata start
 pg_ctl -D c:\Users\admin\pgdata stop

3. client
psql.exe
psql -U postgres
pass admin

\l or \list   show all databases

create database mydb;
\c  mydb       


\c database_name
 connect to database
\dt
  show all table
 
\d+ tablename  -- show table structure
\du -- show all dabasae user 

select * from table ;
   must add ; in psql 
   

create user myuser with encrypted password 'mypass';
grant all privileges on database mydb to myuser;
