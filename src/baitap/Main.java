package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int choice;

        do {
            System.out.println(" -----------Menu------------");
            System.out.println("1. Thêm 1 con vật, không trùng tên");
            System.out.println("2. Hiển thị tất cả các con vật trong tập hợp");
            System.out.println("3. Xóa 1 con vật vào tập hợp theo tên ");
            System.out.println("4. Sửa 1 con vật theo tên");
            System.out.println("5. Hiển thị thông tin 1 con vật theo tên nhập vào ");
            System.out.println("6. Trả về tất cả các con Dog trong tập hợp");
            System.out.println("7. Trả về tất cả các con vật trong khoảng cân nặng được nhập vào");
            System.out.println("0. Exit");
            System.out.println("-----------------------------");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                int choice1;
                do {
                    System.out.println(" Lựa chọn con vật muốn thêm: ");
                    System.out.println("1.Dog");
                    System.out.println("2.Cat");
                    System.out.println("3.Mouse");
                    System.out.println("0. Exit");
                    choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            Animal animal = Manager.creatAnimal(scanner, choice1);
                            Manager.addAnimal(animal);
                            break;
                        case 2:
                            Animal animal2 = Manager.creatAnimal(scanner, choice1);
                            Manager.addAnimal(animal2);
                            break;
                        case 3:
                            Animal animal3 = Manager.creatAnimal(scanner, choice1);
                            Manager.addAnimal(animal3);
                            break;

                    }
                } while (choice1 !=0);
                case 2:
                    Manager.displayAll();
                    break;
                case 3:
                    System.out.println(" nhập tên con vật muốn xóa");
                    String name1 = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(Manager.deleteByName(name1));
                    break;
                case 4:
                    Manager.upDateByName(scanner);
                    break;


            }


        } while (choice !=0);
    }

}
