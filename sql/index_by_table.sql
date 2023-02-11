set serveroutput on
declare
 type language is table of varchar(20)
   index by varchar(20);
   la language;

  p varchar(20);
  begin
+    la('ja'):='java';
    la('js'):='java script';
    la('an'):='angular';
    la('ms'):='micro service';

    dbms_output.put_line(la.count||'total count of langauge  ');
   p:=la.first;
   while p<=la.last loop
         dbms_output.put_line(la(p));
     p:=la.next(p);
 end loop;
 end;
