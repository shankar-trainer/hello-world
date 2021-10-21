mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=c:\ojdbc6.jar -DgeneratePom=true


create table student(stud_roll int primary key,name varchar(20))
/

create table examination(exam_id int primary key,exam_roll int references student(stud_roll),subject varchar(20))
/


select s.stud_roll, s.name, e.exam_id, e.subject from student s,examination e where s.stud_roll(+)=e.exam_roll
/
