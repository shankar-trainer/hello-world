set serveroutput on

declare 
 x int:=&n1;
  y int:=&n1;
 z int;

begin
z:=x+y;
dbms_output.put_line('no1 is '||x);
dbms_output.put_line('no2 is '||x);
dbms_output.put_line('sum is '||z);

end;
