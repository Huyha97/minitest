package baitap.baitapthem.chua;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("**********Menu************");
            System.out.println("1. Hiển thị tất cả kẹo có trong list");
            System.out.println("2. thêm 1 viên kẹo vào list");
            System.out.println("3. xóa 1 viên kẹo theo id");
            System.out.println("4. sửa 1 viên kẹo theo id");
            System.out.println("5. hiển thị 1 viên kẹo theo id");
            System.out.println("6. xóa tất cả kẹo có màu được nhập ");
            System.out.println("7. hiển thị tất cả kẹo có màu đk nhập ");
            System.out.println("8. tìm viên kẹo có đơn giá cao nhất ( có thể có từ 2 kẹo trở lên)");
            System.out.println("9. tính giá thành kẹo và hiển thị dưới dạng tên - giá thành");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    Candy candy = manager.creatCandy();
                    manager.addCandy(candy);
                    break;
                case 3:
                    System.out.println(" nhap id keo muon xoa");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Candy candy1 = manager.deleteById(idDelete);
                    if (candy1 ==null)
                        System.out.println(" khong co keo voi id tuong ung");
                    else
                        System.out.println(candy1);
                    break;
                case 4:
                    System.out.println(" nhap id keo muon sua");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println( manager.eidtCandy(idEdit));
                    break;
                case 5:
                    System.out.println(" nhap id keo muon hien thi");
                    int idDisplay = scanner.nextInt();
                    scanner.nextLine();
                   manager.displayCandy(idDisplay);
                case 6:
                    System.out.println(" nhap mau keo muon xoa: ");
                    scanner.nextLine();
                    String color6 = scanner.nextLine();
                    ArrayList<Candy> arrayList1 = manager.deleteCandyByColor(color6);
                    System.out.println(arrayList1);
                    break;
                case 7:
                    System.out.println(" nhap mau keo muon hien thi: ");
                    scanner.nextLine();
                    String color7 = scanner.nextLine();
                    ArrayList<Candy> arrayList7 = manager.displayCandyByColor(color7);
                    System.out.println(arrayList7);
                    break;
                case 8:
                    ArrayList<Candy> arrayList8 = manager.SearchByPrice();
                    System.out.println(arrayList8);
                    break;
                case 9:
                    manager.displayListAndTotalPrice();
                    break;
            }
        } while (choice !=0);
    }
}
