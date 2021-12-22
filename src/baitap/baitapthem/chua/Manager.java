package baitap.baitapthem.chua;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private final ArrayList<Candy> candies;
    private ArrayList<Candy> Candies;
    private Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.candies = new ArrayList<>();
    }
// hiển thị tất cả candy
    ////
    public void displayAll(){
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }
//////////: tạo candy mới
    public Candy creatCandy() {
        System.out.println(" Nhap mau keo: ");
        String color = scanner.nextLine();
        System.out.println(" nhập tính chất kẹo");
        String pro = scanner.nextLine();
        System.out.println(" nhập số lượng kẹo: ");
        int qua = scanner.nextInt();
        System.out.println("Nhập đơn giá kẹo: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new Candy(color,pro,qua,amount);
    }
// thêm candy vào mảng
    public void addCandy(Candy candy){
        candies.add(candy);
    }
// xóa candy theo id
    public Candy deleteById(int id){
        Candy candy = null;
        for (Candy c: candies) {
            if (c.getId()==id) {
                candy = c;
            }
        }
        int index = candies.indexOf(candy);
        return candies.remove(index);
    }
// sửa candy theo id;
    public Candy eidtCandy(int id) {
        Candy candy = null;
        for (Candy c: candies) {
            if (c.getId()==id) {
                candy = c;
            }
        }
        if (candy != null) {
            int index = candies.indexOf(candy);
            System.out.println(" nhập màu mới: ");
            String color = scanner.nextLine();
            candy.setColor(color);
            System.out.println(" nhập tính chất mới: ");
            String pro = scanner.nextLine();
            candy.setProperty(pro);
            System.out.println(" nhập số lượng mới: ");
            int qua = scanner.nextInt();
            candy.setQuanity(qua);
            System.out.println(" nhập đơn giá mới: ");
            double amount = scanner.nextDouble();
            candy.setAmount(amount);
            candies.set(index,candy);
        }
        return candy;
    }

    //hiển thị candy theo id:
    public void displayCandy(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId()==id) {
                candy = c;
            }
        }
        if (candy != null) {
            System.out.println(candy);
        } else {
            System.out.println(" ko có kẹo có id tương ứng");
        }
    }

    // xoa theo mau

    public ArrayList<Candy> deleteCandyByColor (String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c: candies) {
            if (c.getColor().equals(color)){
                candy.add(c);
            }
        }
        candies.removeAll(candy);
        return candy;
    }

    public ArrayList<Candy> displayCandyByColor(String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c: candies) {
            if (c.getColor().equals(color)){
                candy.add(c);
            }
        }
         return candy;
    }

    public ArrayList<Candy> SearchByPrice() {
        ArrayList<Candy> candy = new ArrayList<>();
        double max = candies.get(0).getAmount();
        for (Candy c: candies) {
            if (c.getAmount() > max) {
                max = c.getAmount();
            }
        }
        for (Candy c: candies
             ) {
            if (c.getAmount() == max) {
                candy.add(c);
            }

        }
        return candy;
    }
    public void displayListAndTotalPrice() {
        for (Candy c: candies) {
            System.out.println(c.getId() + "---" + ( c.getAmount()*c.getQuanity() ));
        }
    }




}
