package baiTapTOngHop.baingay22_12.bainopgit22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả người");
            System.out.println("2. Hiển thị tất cả nam");
            System.out.println("3. Hiển thị tất cả nữ");
            System.out.println("4. Hiển thị tất cả người < 20 tuổi");
            System.out.println("5. thêm 1 người");
            System.out.println("6. Xóa 1 người theo tên ( nếu trùng xóa tên ng đầu");
            System.out.println("7. Sửa 1 người theo tên ( nếu trùng sửa tên ng đầu");
            System.out.println("8. Hiển thị tất cả người theo tên nhập vào");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    String male = scanner.nextLine();
                    System.out.println(manager.displayHumanByMale(male));
                    break;
                case 3:
                    String female = scanner.nextLine();
                    System.out.println(manager.displayHumanByMale(female));
                    break;
                case 4:
                    int age = scanner.nextInt();
                    System.out.println(manager.displayByAgeUnder20(age));
                case 5:
                    Human human = manager.creatHuman();
                    manager.addHuman(human);
                case 6:
                    System.out.println("Nhập tên người muốn xóa : ");
                    String name6 = scanner.nextLine();
                    ArrayList<Human> arrayList1 = manager.deleteHumanByName(name6);
                    System.out.println(arrayList1);
                case 7:
                    System.out.println("Nhập tên người muốn sửa( không trùng): ");
                    String name7 = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(manager.editHuman(name7));
                case 8:
                    System.out.println("Nhập tên người muốn hiển thị : ");
                    String name = scanner.nextLine();
                    ArrayList<Human> arrayList = manager.displayHumanByName(name);
                    System.out.println(arrayList);
            }

        } while (choice!=0);
    }
}
