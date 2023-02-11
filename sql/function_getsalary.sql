set serveroutput on
create or replace function find_employee(id employee.eid%type) 
 return number is 
 salary1   employee.salary%type;
begin

select salary into salary1 from employee where eid=id;
return salary1;

end;
/

--SQL> variable sal number
--SQL> execute :sal:=find_employee(10001)
--SQL> print :sal
