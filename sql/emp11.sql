set serveroutput on

declare 
 --id int ;
 --name varchar(20);
 --sal float;
   id employee.eid%type;
   name employee.ename%type;
   sal int;
   grade varchar(20);   
begin
 id:=&employeeid;
 
 select ename, salary into name,sal from employee where eid=id;
 dbms_output.put_line('id is '||id);
 dbms_output.put_line('name is '||name);
 dbms_output.put_line('salary is '||sal);  
 case sal
  when  sal between 10000 and 20000 then 
   grade:='poor';

  when sal between 20001 and 40000 then 
  grade:='average';
  
  else
  grade:='excellent'; 
 end case;
 dbms_output.put_line('your salary is '||grade);  
end;
/
