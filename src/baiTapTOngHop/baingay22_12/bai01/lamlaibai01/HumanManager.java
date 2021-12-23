package baiTapTOngHop.baingay22_12.bai01.lamlaibai01;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Human> humans;

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public Human creatHuman(){
        System.out.println("input name: ");
        String name = scanner.next();
        System.out.println();
        System.out.println(" input date: ");
        String date = scanner.next();
        System.out.println(" input idcard: ");
        String idcard = scanner.next();
        for (Human human : humans) {
            if (human.getIdCard().equals(idcard)){
                System.out.println(" idcard duplicate!!!, try again!!!");
                return null;
            }
        }
        Human human = new Human(name,date,idcard);
        humans.add(human);
        return human;
    }

    public void deleteHuman(String idCard) {
        Human human = null;
        for (Human h: humans) {
            if (human.getIdCard().equals(idCard)){
                human = h;
            }
        }
        boolean check = humans.remove(human);
        if (check) {
            System.out.println(" delete completed");
        } else {
            System.out.println(" delete fail!!!");
        }
    }

    public void displayHuman(String idCard) {
        Human human = null;
        for (Human h: humans) {
            if (h.getIdCard().equals(idCard)) {
                human =h;
            }
        }
        if (human !=null)
            System.out.println(human);
        else
            System.out.println("idcard does not exit!!");
    }

    public void displayAll(){
        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public Human getHuman(String idCard) {
        Human human = null;
        for (Human h: humans) {
            if (h.getIdCard().equals(idCard))
                human =h;
        }
        return human;
    }
}
