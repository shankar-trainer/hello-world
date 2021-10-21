SQL> create table student(stud_roll int primary key,name varchar(20))
/

create table examination(exam_id int primary key,exam_roll int references student(stud_roll),subject varchar(20))
/
Table created.

Table created.

SQL> ed rel1.sql

SQL> insert into student values(1002,'mohan kumar');

1 row created.

SQL> insert into student values(1003,'suresh kumar');

1 row created.

SQL> insert into student values(1004,'anand kumar');

1 row created.

SQL> commit;

Commit complete.

SQL> insert into examination values(9004,1002,'hindi');

1 row created.

SQL> insert into examination values(9005,1002,'science');

1 row created.

SQL> insert into examination values(9006,1002,'english');

1 row created.

SQL> insert into examination values(9007,1003,'english');

1 row created.

SQL> insert into examination values(9008,1003,'tamil');

1 row created.

SQL> insert into examination values(9009,1003,'telugu');

1 row created.

SQL> insert into examination values(9010,1004,'telugu');

1 row created.

SQL> insert into examination values(9011,1004,'tamil');

1 row created.

SQL> insert into examination values(9012,1004,'kannada');

1 row created.


SQL> select * from student,examination where student.stud_roll=examination.exam_roll;

 STUD_ROLL NAME                    EXAM_ID  EXAM_ROLL SUBJECT
---------- -------------------- ---------- ---------- --------------------
      1001 ram kumar                  9001       1001 math
      1001 ram kumar                  9002       1001 science
      1001 ram kumar                  9003       1001 hindi
      1002 mohan kumar                9004       1002 hindi
      1002 mohan kumar                9005       1002 science
      1002 mohan kumar                9006       1002 english
      1003 suresh kumar               9007       1003 english
      1003 suresh kumar               9008       1003 tamil
      1003 suresh kumar               9009       1003 telugu
      1004 anand kumar                9010       1004 telugu
      1004 anand kumar                9011       1004 tamil

 STUD_ROLL NAME                    EXAM_ID  EXAM_ROLL SUBJECT
---------- -------------------- ---------- ---------- --------------------
      1004 anand kumar                9012       1004 kannada

12 rows selected.

SQL> select * from student,examination where student.stud_roll(+)=examination.exam_roll;

 STUD_ROLL NAME                    EXAM_ID  EXAM_ROLL SUBJECT
---------- -------------------- ---------- ---------- --------------------
      1001 ram kumar                  9003       1001 hindi
      1001 ram kumar                  9002       1001 science
      1001 ram kumar                  9001       1001 math
      1002 mohan kumar                9006       1002 english
      1002 mohan kumar                9005       1002 science
      1002 mohan kumar                9004       1002 hindi
      1003 suresh kumar               9009       1003 telugu
      1003 suresh kumar               9008       1003 tamil
      1003 suresh kumar               9007       1003 english
      1004 anand kumar                9012       1004 kannada
      1004 anand kumar                9011       1004 tamil

 STUD_ROLL NAME                    EXAM_ID  EXAM_ROLL SUBJECT
---------- -------------------- ---------- ---------- --------------------
      1004 anand kumar                9010       1004 telugu

12 rows selected.

SQL> desc student;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 STUD_ROLL                                 NOT NULL NUMBER(38)
 NAME                                               VARCHAR2(20)

SQL> desc examination;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EXAM_ID                                   NOT NULL NUMBER(38)
 EXAM_ROLL                                          NUMBER(38)
 SUBJECT                                            VARCHAR2(20)

SQL> select s.stud_roll, s.name, e.exam_id, e.subject from student s,examination e where s.stud_roll(+)=e.exam_roll;

 STUD_ROLL NAME                    EXAM_ID SUBJECT
---------- -------------------- ---------- --------------------
      1001 ram kumar                  9003 hindi
      1001 ram kumar                  9002 science
      1001 ram kumar                  9001 math
      1002 mohan kumar                9006 english
      1002 mohan kumar                9005 science
      1002 mohan kumar                9004 hindi
      1003 suresh kumar               9009 telugu
      1003 suresh kumar               9008 tamil
      1003 suresh kumar               9007 english
      1004 anand kumar                9012 kannada
      1004 anand kumar                9011 tamil

 STUD_ROLL NAME                    EXAM_ID SUBJECT
---------- -------------------- ---------- --------------------
      1004 anand kumar                9010 telugu

12 rows selected.

