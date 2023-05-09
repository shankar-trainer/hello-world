set serveroutput on

   declare
     x int:=20;
    begin
    dbms_output.put_line('x is '||x);
    end;