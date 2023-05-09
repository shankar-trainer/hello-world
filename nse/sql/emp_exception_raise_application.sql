set serveroutput on
declare
   id  employee.eid%type;
   name  employee.ename%type;
   sal  employee.salary%type;  

 
begin
   id:=&id;
if id<=0 then 
  raise_application_error(-20001,'invalid id');
else
select ename,salary into name,sal  from employee where eid=id;
        dbms_output.put_line(id||'                  '||name||'      '||sal);
end if;
 exception 
  when no_data_found then 
     raise_application_error(-20002,'no data present for id '||id);
   when too_many_rows then 
     raise_application_error(-20003,'multiple record present  ');
 end;
/
