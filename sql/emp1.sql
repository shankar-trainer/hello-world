set serveroutput on

declare 
 --id int ;
 --name varchar(20);
 --sal float;
   id employee.eid%type;
   name employee.ename%type;
   sal employee.salary%type;
   grade varchar(20);   
begin
 id:=&employeeid;
 
 select ename, salary into name,sal from employee where eid=id;
 dbms_output.put_line('id is '||id);
 dbms_output.put_line('name is '||name);
 dbms_output.put_line('salary is '||sal);  

 if sal between 10000 and 20000 then 
   grade:='poor';
 elsif sal between 20001 and 40000 then 
  grade:='average';
else
  grade:='excellent'; 
end if;
 dbms_output.put_line('your salary is '||grade);  
end;
/
