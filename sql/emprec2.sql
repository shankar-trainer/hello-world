set serveroutput on;
declare
 type emprec is record
 (
  id int,
  name varchar(20),
 esal float
);
 e emprec;

begin
  e.id:=90001;
  e.name:='sumendra partap';
  e.esal:=90000;
  dbms_output.put_line(' employee information');
  dbms_output.put_line('id  '||e.id);
  dbms_output.put_line('name '||e.name); 
  dbms_output.put_line('salary '||e.esal); 

   insert into employee values(e.id,e.name,e.esal); 
end;
