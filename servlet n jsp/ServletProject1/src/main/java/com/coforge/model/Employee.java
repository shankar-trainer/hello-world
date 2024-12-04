package com.coforge.model;

public class Employee {
    private int empolyeeId;
    private String empolyeeName;
    private float empolyeeSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "empolyeeId=" + empolyeeId +
                ", empolyeeName='" + empolyeeName + '\'' +
                ", empolyeeSalary=" + empolyeeSalary +
                '}';
    }

    public int getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(int empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public String getEmpolyeeName() {
        return empolyeeName;
    }

    public void setEmpolyeeName(String empolyeeName) {
        this.empolyeeName = empolyeeName;
    }

    public float getEmpolyeeSalary() {
        return empolyeeSalary;
    }

    public void setEmpolyeeSalary(float empolyeeSalary) {
        this.empolyeeSalary = empolyeeSalary;
    }
}
