set serveroutput on
declare
 cursor c1  is 
   select * from employee;
 begin
 for emp in c1 loop
          dbms_output.put_line(emp.eid||'      '||emp.ename||'              '||emp.salary);
 end loop;
 
end;
/
