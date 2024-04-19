package question;

import java.util.Scanner;

public class Candidate {
    private String name;
    private String gender;
    private double expectedSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary)// throws InvalidSalaryException
    {
        if (expectedSalary < 10000) {
            throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000.");
        }
        //else
        this.expectedSalary = expectedSalary;
    }
}

