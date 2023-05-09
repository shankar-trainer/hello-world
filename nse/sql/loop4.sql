set serveroutput on
declare 
   
begin
 for e in (select * from employee)  loop
 dbms_output.put_line(e.eid||'     '||e.ename||'               '||e.salary);
 end loop;
end;
/