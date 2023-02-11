set serveroutput on
declare 
 emprow employee%rowtype;
id1 employee.eid%type;
begin
id1:=&id;
 select * into emprow from employee where eid=id1;
 dbms_output.put_line('eid        name        salary');
  dbms_output.put_line(emprow.eid||'            '||emprow.ename||'                 '||emprow.salary);
 
end;