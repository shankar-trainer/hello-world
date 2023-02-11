set serveroutput on
create or replace trigger emp_trigger4
   after delete on employee 
    for each row
begin
 insert into employee_backup values(:old.eid,:old.ename,:old.salary);
end;
/