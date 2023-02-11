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
 id:=10001;
 
 loop 
 select ename, salary into name,sal from employee where eid=id;
 dbms_output.put_line('----------------------------');
  
 dbms_output.put_line('id is '||id);
 dbms_output.put_line('name is '||name);
 dbms_output.put_line('salary is '||sal);  

 dbms_output.put_line('----------------------------' );
 
  exit when id>=10003;
id:=id+1; 
 end loop;
end;
/
