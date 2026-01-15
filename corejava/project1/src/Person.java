public class Person {

    protected  int personId;
    protected   String  personName;
    protected   float personSalary;

    public Person(int personId, String personName, float personSalary) {
        this.personId = personId;
        this.personName = personName;
        this.personSalary = personSalary;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public float getPersonSalary() {
        return personSalary;
    }
}

/*
     Person    parent, super class
     /   \
    /     \   child class
  Manager   Customer Employee Teacher Engineer
 one super class can have multiple subclasses
 java does not support multiple inheritance
 */
