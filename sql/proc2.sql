set serveroutput on
create or replace procedure update_employee is 
begin
 update employee set salary=salary+(salary*0.1);

 dbms_output.put_line('all record update');
end;
/

-- SQL> execute update_employee