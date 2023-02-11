set serveroutput on
declare 
   id employee.eid%type;
   name employee.ename%type;
   sal employee.salary%type;
   
begin
 id:=10001;

merge into employee_copy  ec using employee e on (e.eid=id);

when matched then
 update set ec.ename=e.ename,
                  ec.salary=e.salary;
  dbms_output.put_line('merge updated');
when not matched then
 insert into employee_copy values(e.eid,e.ename,e.salary);
  dbms_output.put_line('merge inserted'); 	 
end;
/
