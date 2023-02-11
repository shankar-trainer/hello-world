set serveroutput on

declare 
   id employee.eid%type;
   name employee.ename%type;
   sal employee.salary%type;
   
begin
 id:=&id;
 name:='&name';
 sal:=&salary;

insert into employee values(id,name,sal); 
 dbms_output.put_line(SQL%ROWCOUNT||'  record added ');  

end;
/
