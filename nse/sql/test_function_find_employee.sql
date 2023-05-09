declare 
id  int;
salary number;

begin
 id:=&id;

salary:=find_employee(id);
 dbms_output.put_line('salary for id '||id||' is '||salary);

exception
 when no_data_found then
  dbms_output.put_line('no data present for  id '||id);

end;
/
