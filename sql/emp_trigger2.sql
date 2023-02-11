set serveroutput on
create or replace trigger emp_trigger2 
   after insert on employee
   
begin
 insert into employee_audit values(user,systimestamp);

end;
/