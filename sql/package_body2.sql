create or replace package body comm_package is 
    g_comm number:=0;
    procedure max_salary(maxsalary out number) is 
begin
   select max(salary) into maxsalary from employee;
end   max_salary;
end comm_package;
/


--SQL> variable max_sal number
--SQL> execute comm_package.max_salary(:max_sal)

--SQL> print max_sal