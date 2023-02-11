create or replace package body  calculation is
   function addition(x int , y int)
      return int is 
       begin 
        return x+y;
       end;
  	function addition(x int , y int, z int) 
       return int is 
     begin   
      return x+y+z;
    end;
     function addition(fname varchar2,lname varchar2) 
        return varchar2 is
      begin
       return  fname||'    '||lname;
   end;
end calculation;
/

--SQL> variable g number
--SQL> execute :g:=calculation.addition(11,22)
-- print g