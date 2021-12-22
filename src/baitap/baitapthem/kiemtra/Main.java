package baitap.baitapthem.kiemtra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerCandy managerCandy = new ManagerCandy();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị tất cả kẹo");
            System.out.println("2. Thêm 1 viên kẹo");
            System.out.println("3. xóa 1 viên kẹo");
            System.out.println("4. sửa 1 viên kẹo");
            System.out.println("5. Hiển thị 1 viên kẹo theo id");
            System.out.println("6. xóa tất cả kẹo có màu được nhập từ bàn phím");
            System.out.println("7. Hiern thị tất cả kẹo có màu được nhập từ bàn phím");
            System.out.println("8. tìm kẹo có đơn giá cao nhất");
            System.out.println("9. tính giá thành kẹo");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerCandy.dispalyAllCandy();
                    break;
                case 2:
                    Candy candy = managerCandy.creatCandy(scanner);
                    managerCandy.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Nhập id kẹo muốn xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(managerCandy.deleteById(idDelete));
                    break;
                case 4:
                    System.out.println("Nhập id kẹo muốn sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    managerCandy.updateById(id,scanner);
                    break;
                case 5:
                    System.out.println("Nhập id kẹo muốn hiển thị: ");
                    int idDisplay = scanner.nextInt();
                    scanner.nextLine();
                    managerCandy.DisplayById(idDisplay);
                    break;
                case 6:
                    System.out.println(" nhập màu kẹo muốn xóa: ");
                    String color = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(managerCandy.deleteByColor(color));
                case 7:

            }

        } while (choice != 0);
    }
}
