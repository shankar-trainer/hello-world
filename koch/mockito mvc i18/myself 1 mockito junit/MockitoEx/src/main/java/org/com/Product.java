package org.com;

public class Product {
  private int pid;
  private String name;

  private float specialDiscount;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpecialDiscount() {
        return specialDiscount;
    }

    public void setSpecialDiscount(float specialDiscount) {
        this.specialDiscount = specialDiscount;
    }
}
