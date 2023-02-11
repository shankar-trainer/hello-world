set serveroutput on

declare 
  x int;
  y int;
  z int;
  ch int;
begin
   x:=&no1;
   y:=&no2;
   
	dbms_output.put_line('no1 is '||x);
	dbms_output.put_line('no2 is '||x);
	dbms_output.put_line('operation choices ');
	dbms_output.put_line('1.Addition ');
	dbms_output.put_line('2.Subtraction ');
	dbms_output.put_line('3.Multiplication ');
	dbms_output.put_line('4.Division ');

	ch:=&choice;

	if ch=1 then
	   z:=x+y; 
	  dbms_output.put_line('Addition is  '||z);
	end if;
	  
	if ch=2 then
	   z:=x-y; 
	  dbms_output.put_line('Subtraction is  '||z);
	end if;

	if ch=3 then
	   z:=x*y; 
	  dbms_output.put_line('Multiplication is  '||z);
	end if;

	if ch=4 then
	   z:=x/y; 
	  dbms_output.put_line('Division  is  '||z);
	end if;
  
end;
/
