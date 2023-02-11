set serveroutput on
declare
   id  employee.eid%type;
   name  employee.ename%type;
   sal  employee.salary%type;  
   ex1 exception; 
 pragma exception_init(ex1,-2000);

 
begin
   id:=&id;
if id<=0 then 
   raise ex1;
else
select ename,salary into name,sal  from employee where eid=id;
        dbms_output.put_line(id||'                  '||name||'      '||sal);
end if;
 exception 
  when no_data_found then 
       dbms_output.put_line(' no record present for id  '||id);
when too_many_rows then 
       dbms_output.put_line(' multiple  records present   ');
when ex1 then
         dbms_output.put_line(' invalid id error  ');
           dbms_output.put_line('error code is  ' ||sqlcode);
           dbms_output.put_line('error message  '||sqlerrm);
 end;
/
