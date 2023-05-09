set serveroutput on
declare
 cursor c1 is select * from employee;
 emp employee%rowtype;
begin
  open c1;
  fetch c1 into emp;
  while c1%found loop
         dbms_output.put_line(emp.eid||'      '||emp.ename||'              '||emp.salary);
   fetch c1 into emp;

end loop;
  close c1;
end;
/
