set serveroutput on
declare 
 count1 int:=1;
   
begin
 loop
  dbms_output.put_line(count1);
  count1:=count1+1;
  exit when count1>=10;
 end loop;
end;
/