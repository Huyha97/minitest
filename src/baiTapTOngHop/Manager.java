package baiTapTOngHop;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Human> humans;
    private Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.humans = new ArrayList<>();
    }
    public void displayAll() {
        for (Human h: humans) {
            System.out.println(h);
        }
    }

    public Human creatHuman() {
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input age");
        int age = scanner.nextInt();
        System.out.println(" input gender: ");
        String gd = scanner.nextLine();
        scanner.nextLine();
        System.out.println(" input address");
        String address = scanner.nextLine();
        return new Human(name, age, gd, address);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

   public ArrayList<Human> displayHumanByFemale (String female) {
       ArrayList<Human> human = new ArrayList<>();
       for (Human h: humans) {
           if (h.getGender().equals(female)) {
               human.add(h);
           }
       }
       return human;
   }

    public ArrayList<Human> displayHumanByMale (String male) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h: humans) {
            if (h.getGender().equals(male)) {
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayByAgeUnder20 (int age){
        ArrayList<Human> human = new ArrayList<>();
        for (Human h: humans) {
            if (h.getAge() < 20) {
                human.add(h);
            }
        }
        return human;

    }

    public ArrayList<Human> deleteHumanByName(String name) {
        ArrayList<Human> candy = new ArrayList<>();
        for (Human c : humans) {
            if (c.getName().equals(name)) {
                candy.add(c);
                break;
            }
        }
        humans.removeAll(candy);
        return candy;
    }

    public ArrayList<Human> displayHumanByName (String name) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h: humans) {
            if (h.getGender().equals(name)) {
                human.add(h);
            }
        }
        return human;
    }

    public Human editHuman(String name) {
        Human human = null;
        for (Human c : humans) {
            if (c.getName().equals(name)) {
                human = c;
                break;
            }
        }
        if (human != null) {
            int index = humans.indexOf(human);
            System.out.println("input name: ");
            String name1 = scanner.nextLine();
            human.setName(name1);
            System.out.println("input age");
            int age = scanner.nextInt();
            human.setAge(age);
            System.out.println(" input gender: ");
            String gd = scanner.nextLine();
            human.setGender(gd);
            scanner.nextLine();
            System.out.println(" input address");
            String address = scanner.nextLine();
            human.setAddress(address);
            humans.set(index,human);
        }
        return human;
    }


}
