package baiTapTOngHop.baingay22_12.bainopgit22_12.lamlai;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    ArrayList<Human> humans;
    Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public Human CreatHuman() {
        System.out.println(" input name: ");
        String name = scanner.next();
        System.out.println(" input age: ");
        int age = scanner.nextInt();
        System.out.println(" input gender:");
        String gender = scanner.next();
        System.out.println(" input addrerss: ");
        String address = scanner.next();
        return new Human(name, age, gender, address);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public ArrayList<Human> displayHumanByGender(String gender) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getGender().equals(gender)) {
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayHumanUnder20() {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getAge() < 20) {
                human.add(h);
        }
    }
    return human;
}
    public Human DeleteHumanByName(String name){
        Human human = null;
        for (Human h: humans) {
            if (h.getName().equals(name)){
                human = h;
                break;
            }
        }
        humans.remove(human);
        return human;
    }

    public ArrayList<Human> displayHumanByName(String name) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human.add(h);
            }
        }
        return human;
    }

    public Human editHuman(String name) {
        Human human = null;
        for (Human h: humans) {
            if (h.getName().equals(name)) {
                human =h;
                break;
            }
        }
        if (human != null) {
            int index = humans.indexOf(human);
            System.out.println("input name");
            String name1 = scanner.next();
            human.setName(name1);
            System.out.println("input age");
            int age1 = scanner.nextInt();
            human.setAge(age1);
            System.out.println(" input gender:");
            String gender = scanner.next();
            human.setGender(gender);
            System.out.println(" input addrerss: ");
            String address = scanner.next();
            human.setAddress(address);
            humans.set(index,human);
        }
        return human;
    }
}
