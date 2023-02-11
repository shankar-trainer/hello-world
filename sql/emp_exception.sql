set serveroutput on
declare
   id  employee.eid%type;
   name  employee.ename%type;
   sal  employee.salary%type;   
 
begin
 --  id:=&id;
 sal:=&salary;
 --select ename,salary into name,sal  from employee where eid=id;
select ename,eid into name,id  from employee where salary=sal;
        dbms_output.put_line(id||'                  '||name||'      '||sal);
 exception 
  when no_data_found then 
       dbms_output.put_line(' no record present for id  '||id);
  
when too_many_rows then 
       dbms_output.put_line(' multiple  records present   ');
  
end;
/
