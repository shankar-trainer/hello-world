set serveroutput on
create or replace trigger emp_trigger3 
   before insert on employee 
    for each row
begin
  if :new.eid<=0 then 
   raise_application_error(20050,'invalid id'); 
 end if;
end;
/