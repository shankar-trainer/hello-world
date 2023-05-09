set serveroutput on
create or replace procedure update_employee_using_id(id  in int) is 
begin
 update employee set salary=salary+(salary*0.1) where  eid=id;
 dbms_output.put_line('employee record with id'||id||' is   updated');
end;
/
-- SQL> execute update_employee_using_id(10001);
