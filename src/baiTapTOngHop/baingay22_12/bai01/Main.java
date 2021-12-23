package baiTapTOngHop.baingay22_12.bai01;

import baiTapTOngHop.baingay22_12.bai02.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ManagerKs manager = new ManagerKs();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("--------Menu----------");
            System.out.println("1. Hiển thị tất cả khách");
            System.out.println("2. Thêm khách");
            System.out.println("3. Xóa 1 khách theo id");
            System.out.println("4. Sửa 1 khách theo id");
            System.out.println("5. Hiển thị khách theo id");
            System.out.println("6. Tính tiền theo CMND");
            System.out.println("0. Exit");
            System.out.println("----------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    KhachSan khachSan1 = manager.creatKhachSan();
                    manager.addKhach(khachSan1);
                    break;
                case 3:
                    System.out.println(" nhap cmnd cua khach ban muon xoa: ");
                    int cmnd = scanner.nextInt();
                    scanner.nextLine();
                    KhachSan khachSan3 = manager.deleteById(cmnd);
                    if (khachSan3 == null) {
                        System.out.println("Không có khách với cmnd tương ứng!");
                    } else {
                        System.out.println(khachSan3);
                    }
                    break;
                case 4:
                    System.out.println(" nhap cmnd cua khach ban muon sua: ");
                    int cmnd4 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(manager.editKhach(cmnd4));
                    break;
                case 5:
                    System.out.println(" nhap cmnd cua khach ban muon hien thi: ");
                    int cmnd5 = scanner.nextInt();
                    scanner.nextLine();
                    manager.displayKhach(cmnd5);
                    break;
                case 6:
                    manager.tinhTien();
                    break;
                }
        } while (choice != 0);
    }
}
