set serveroutput on
create or replace trigger emp_trigger1 
   after insert on employee
   
begin
 dbms_output.put_line('Record added to employee table at '||systimestamp||' by user  '||user);
end;
/