set serveroutput on
create or replace package body  emppack is 
  id int;
 name varchar(20);
 procedure  myproc1 is 
  begin 
  dbms_output.put_line('welcome to package');
 end myproc1;
end emppack;
/

-- SQL> execute emppack.myproc1