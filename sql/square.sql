set serveroutput on
create or replace procedure square(x in  out number) is 
begin
 x:=x*x;
end;
/