package baitap.baitapthem.kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCandy {
    private ArrayList<Candy> candys;
    Scanner scanner = new Scanner(System.in);


    public  ManagerCandy(){
        this.candys = new ArrayList<>();
    }


    public void dispalyAllCandy() {
        for (Candy candy : candys) {
            System.out.println(candy);
        }
    }

    public void addCandy(Candy candy) {
        candys.add(candy);
    }


    public Candy deleteById(int id) {
        Candy candy = null;
        for (Candy h : candys) {
            if (h.getId() == id) {
                candy = h;
            }
        }
        candys.remove(candy);
        return candy;
    }

    public void DisplayById(int id) {
        Candy candy = null;
        for (Candy h : candys) {
            if (h.getId() == id) {
                candy = h;
            }
            System.out.println(h);
        }
    }

    public Candy deleteByColor(String color) {
        Candy candy = null;
        for (Candy h : candys) {
            if (h.getColor() == color) {
                candy = h;
            }
        }
        candys.remove(candy);
        return candy;
    }

    public void DisplaybyColor(String color) {
        for (Candy k : candys) {
            if (k.getColor().equals(color)) {
                System.out.println(k);
            }

        }
    }

    public void updateById ( int id, Scanner scanner) {
        Candy candyUpdate = null;
        for (Candy candy : candys) {
            if (candy.getId() == id) {
                candyUpdate = candy;
                System.out.println("nhập màu: ");
                candyUpdate.setColor(scanner.nextLine());
                System.out.println("nhập tính chất: ");
                candyUpdate.setProperty(scanner.nextLine());
                System.out.println("nhập số lượng: ");
                candyUpdate.setQuanity(scanner.nextInt());
                System.out.println("nhập giá: ");
                candyUpdate.setPrice(scanner.nextDouble());
            }
        }
    }

    public Candy creatCandy(Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập màu: ");
        String color = scanner.nextLine();
        System.out.println("nhập tính chất: ");
        String property = scanner.nextLine();
        System.out.println("nhập số lượng: ");
        int quanity = scanner.nextInt();
        System.out.println("nhập giá: ");
        double price = scanner.nextDouble();
        return new Candy(color,property,quanity,price);
    }

}
