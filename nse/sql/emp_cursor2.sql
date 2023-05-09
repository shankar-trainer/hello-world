set serveroutput on
declare
 cursor c1(id number) is 
--   select * from employee where eid=id;
   select * from employee where eid>id;
 emp employee%rowtype;
begin
  open c1(10002);
  fetch c1 into emp;
  while c1%found loop
         dbms_output.put_line(emp.eid||'      '||emp.ename||'              '||emp.salary);
   fetch c1 into emp;

end loop;
  close c1;
end;
/
