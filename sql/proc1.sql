set serveroutput on
create or replace procedure hello is 

begin
 dbms_output.put_line('hello to procedure');

end;
/