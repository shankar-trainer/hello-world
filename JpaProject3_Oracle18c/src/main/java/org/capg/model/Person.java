package org.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person1")
public class Person{

    @Id
    private  int id;
    private String name;
    private Gender gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

/*
 SQL> desc person1;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(10)
 GENDER                                             NUMBER(10)
 NAME                                               VARCHAR2(255 CHAR)
 
 SQL> select *  from  person1;

ID        GENDER  NAME
--------------------------------------------------------------------------------
677766      0   suresh kumar
677769      1   sita kumari

Person{id=677766, name='suresh kumar', gender=male}
Person{id=677769, name='sita kumari', gender=female}
 */