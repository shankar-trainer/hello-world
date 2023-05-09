set serveroutput on
create or replace procedure search_employee
(id  in  employee.eid%type,name out  employee.ename%type,  esalary out  employee.salary%type) is 
begin
select ename,salary into name,esalary from employee where eid=id;
 dbms_output.put_line('employee record found with id'||id);
exception 
 when no_data_found then
  dbms_output.put_line('employee record  not found with id'||id);
 
end;
/

--SQL> variable name1 varchar2(20)
--SQL> variable salary1 number

--SQL> execute   search_employee(10001,:name1,:salary1);

--SQL> print name1
