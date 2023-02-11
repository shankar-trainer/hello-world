set serveroutput on
declare
 cursor c1  is 
   select * from employee;
 begin
          dbms_output.put_line('total no of record is '||sql%rowcount);

 for emp in c1 loop
       if (emp.eid>10000) then
          dbms_output.put_line(emp.eid||'      '||emp.ename||'              '||emp.salary);
     end if;
 end loop;
 
end;
/
