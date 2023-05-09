set serveroutput on
declare 
 count1 int:=1;
   
begin
 while count1<=10 loop
  dbms_output.put_line(count1);
  count1:=count1+1;
 end loop;
end;
/