package com.company;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human{
    boolean gender;

    public Woman(boolean gender, String name, String surname, float rost, float ves) {
        super(name, surname, rost, ves);
        this.gender = false;

    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rost=" + rost +
                ", ves=" + ves +
                "} " + super.toString();
    }
    public static Woman create(){
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
        Woman woman = new Woman(false,b,c,d,e);
        System.out.println(woman);
        return woman;
    }
    public static void bornBaby(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        Random rand2 = new Random();
        Scanner scan = new Scanner(System.in);
        boolean gend = rand2.nextBoolean();
        String n, s;
        float r, v;
        System.out.println("У вас родился ребенок!");
        if (gend) {
            System.out.println("Мальчик!");
        } else {
            System.out.println("Девочка!");
        }
        System.out.println("имя?");
        n = scan.next();
        if (firstHum instanceof Man) {
            s = firstHum.surname;
        } else {
            s = secHum.surname;

        }
        if ((gend) && (firstHum instanceof Man)) {
            r = (float) ((firstHum.rost + 0.3 * secHum.rost) - firstHum.rost);
            v = (float) ((firstHum.ves + 0.05 * secHum.ves) - firstHum.ves);
        } else {
            r = (float) ((secHum.rost + 0.3 * firstHum.rost) - secHum.rost);
            v = (float) ((secHum.ves + 0.05 * firstHum.ves) - secHum.ves);
        }
        if (gend) {
            Man baby1 = new Man(true, n, s, r, v);
            System.out.println(baby1);
        } else {
            Woman baby1 = new Woman(false, n, s+"a", r, v);
            System.out.println(baby1);
        }


    }


}
