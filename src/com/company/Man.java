package com.company;

import java.util.Scanner;

public class Man extends Human{

    boolean gender=true;

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
        String b, c, a1;
        float d, e;
//        System.out.println("Пол?//y,m for man");
//        a1 = sc.next();
//        //        a= sc.hasNext("m");
//        String a2 = "y";
//        String a3 = "n";
//        a = a1.equals(a2);
//        sc.nextLine();
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
