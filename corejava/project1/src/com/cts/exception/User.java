package com.cts.exception;

public class User {
    private long id;      // id must not blank , range 10000 -50000
    private String name;   //name not blank, length 5- 15 char
    private float salary;  //not blank 20000- 200000

    public long getId() {
        return id;
    }

    public void setId(long id) throws UserException {
        if (id < 0)
            throw new UserException("id is blank or -ve");
        else if (id < 10000 || id > 50000)
            throw new UserException("id must have range of 10000- 50000");
        else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws UserException {
        if (name.isBlank())
            throw new UserException("name is blank");
        else if (name.length() < 5 || name.length() > 15)
            throw new UserException("name length must between 5 - 15 chars");
        else
            this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) throws UserException {

        if (salary < 0)
            throw new UserException("salary is blank or -ve");
        else if (salary < 20000 || salary > 200000)
            throw new UserException("salary must  between 20000 - 200000");

        this.salary = salary;
    }
}
