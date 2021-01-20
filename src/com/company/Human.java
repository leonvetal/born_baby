package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.Woman.bornBaby;

public class Human {
    String name, surname;
    float rost, ves;

    public Human(String name, String surname, float rost, float ves) {
        this.name = name;
        this.surname = surname;
        this.rost = rost;
        this.ves = ves;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rost=" + rost +
                ", ves=" + ves +
                '}';
    }

    public static Human newHum() {
        System.out.println("Пол?//y, for MAN,<any key> for WOMAN");
        Scanner scan = new Scanner(System.in);
        boolean a;
        a = scan.hasNext("y");
        if (a) {
            Man man = Man.create();
            return man;
        } else {
            Woman woman = Woman.create();
            return woman;
        }
    }

    public boolean speak(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        System.out.println("Будут ли общаться?");
        if ((firstHum instanceof Woman) && (secHum instanceof Woman)) {
            System.out.println("Да, жен+жен");
            return true;
        }
        if ((firstHum instanceof Man) && (secHum instanceof Man)) {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                System.out.println("Да, муж+муж, вер. 50%");
                return true;
            } else {
                System.out.println("Нет, муж+муж, вер. 50%");
                return false;
            }

        } else {
            System.out.println("Да, жен+муж или муж+жен");
            return true;
        }
    }

    public boolean obshestvo(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        Random rand = new Random();
        double r1 = rand.nextDouble();
        System.out.println("Будут ли терпеть друг друга?");
        System.out.println(r1);
        if ((firstHum instanceof Woman) && (secHum instanceof Woman)) {
            if (r1 < 0.05) {
                System.out.println("Да, жен+жен,с вероятностью 5%");
                return true;
            } else {
                System.out.println("Нет, жен+жен,с вероятностью 95%");
                return false;
            }
        }
        if ((firstHum instanceof Man) && (secHum instanceof Man)) {
            if (r1 <= 0.056) {
                System.out.println("Да, муж+муж,с вероятностью 5,6%");
                return true;
            } else {
                System.out.println("Нет, муж+муж, с вероятностью 94,4%");
                return false;
            }

        } else {
            if (r1 < 0.7) {
                System.out.println("Да,муж+жен, с вероятностью 70%");
                return true;
            } else {
                System.out.println("Нет, муж+жен, с вероятностью 30%");
                return false;
            }
        }

    }

    public boolean vmeste(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        System.out.println("Будут ли проводить время вместе?");
        Random rand = new Random();
        float r = ((Math.abs(firstHum.rost - secHum.rost)) / firstHum.rost) * 100;

//        System.out.println(r);
        double r1 = rand.nextDouble();
        System.out.println(r1);
        if ((r > 10) && (r1 < 0.85)) {
            System.out.println("Да,разница в росте= " + r + "%,  вер. 85%");
            return true;
        } else if ((r <= 10) && (r1 < 0.95)) {
            System.out.println("Да,разница в росте= " + r + "%,  вер. 95%");
            return true;
        } else {
            System.out.println("Не будут");
            return false;
        }
    }

    public Human relat(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        if (firstHum.getClass() == secHum.getClass()) {
            System.out.println(speak(firstHum, secHum));
            System.out.println(obshestvo(firstHum, secHum));
            System.out.println(vmeste(firstHum, secHum));
            System.out.println("Не родят, однополые");
            return null;
        }
        if (speak(firstHum, secHum) && obshestvo(firstHum, secHum) && vmeste(firstHum, secHum)) {
            bornBaby(firstHum, secHum);
            return new Human("f", "ff,", 155, 56);
        } else {
            System.out.println("Не вышло, разбежались");
            return null;
        }

    }


}
