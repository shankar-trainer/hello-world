package com.coforge.exception;

import java.util.Scanner;

public class Player {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CustomException {
        if(age<19)
            throw new CustomException("InvalidAgeRange");
        this.age = age;
    }

    public static void main(String[] args) {
        Player player=new Player();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the player name");
        player.setName(scanner.nextLine());

        System.out.println("Enter the player age");
        try {
            player.setAge(scanner.nextInt());
        } catch (CustomException e) {
            System.err.println(e.getClass().getSimpleName()+":"+e.getMessage());
        }
    }
}
