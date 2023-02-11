set serveroutput on
declare 
   
begin
-- for i in  1.. 10 loop
  for i in  reverse 1.. 10 loop
 dbms_output.put_line(i);
 end loop;
end;
/