package com.company;

import java.util.Scanner;

public class Man extends Human{

    boolean gender;

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rost=" + rost +
                ", ves=" + ves +
                ", gender=" + gender +
                "} " + super.toString();
    }

    public Man(boolean gender, String name, String surname, float rost, float ves) {
        super(name, surname, rost, ves);
        this.gender = true;

    }
    public static Man create(){
        Scanner sc = new Scanner(System.in);
        String b, c;
        float d, e;
        System.out.println("Имя?");
        b = sc.next();
        System.out.println("Фамилия?");
        c = sc.next();
        System.out.println("Рост?");
        d = sc.nextFloat();
        System.out.println("Вес?");
        e = sc.nextFloat();
        Man man = new Man(true,b,c,d,e);
        System.out.println(man);
        return man;

    }

}
