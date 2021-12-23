package baiTapTOngHop.baingay22_12.bai01;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerKs {
private ArrayList<KhachSan> khachSans;
private Scanner scanner = new Scanner(System.in);

    public ManagerKs() {
        this.khachSans = new ArrayList<>();
    }

    public void displayAll() {
        for (KhachSan c : khachSans) {
            System.out.println(c);
        }
    }

    public void addKhach(KhachSan khachSan){
        khachSans.add(khachSan);
    }

    public KhachSan deleteById(int CMND) {
        KhachSan khachSan = null;
        for (KhachSan c : khachSans) {
            if (c.getPerson().getCMND()== CMND) {
              khachSan = c;
            }
        }
        int index = khachSans.indexOf(khachSan);
        return khachSans.remove(index);
    }

    public KhachSan editKhach(int CMND) {
        KhachSan khachSan = null;
        for (KhachSan c : khachSans) {
            if (c.getPerson().getCMND() == CMND) {
                khachSan = c;
            }
        }
        if (khachSan != null) {
            int index = khachSans.indexOf(khachSan);
            System.out.println(" nhap so ngay kach tro: ");
            int day = scanner.nextInt();
            khachSan.setNgaytro(day);
            System.out.println(" nhap loai phong: ");
            String type = scanner.nextLine();
            khachSan.setLoaiPhong(type);
            scanner.nextLine();
            System.out.println(" nhap gia phong: ");
            double price = scanner.nextDouble();
            khachSan.getPrice();
            System.out.println("nhap ten nguoi");
            String fullName = scanner.nextLine();
            khachSan.getPerson().setFullName(fullName);
            scanner.nextLine();
            System.out.println(" nhap ngay sinh: ");
            String d= scanner.nextLine();
            khachSan.getPerson().setDateOfBirth(d);
            khachSans.set(index, khachSan);
        }
        return khachSan;
    }


    public void displayKhach (int CMND) {
        KhachSan khachSan = null;
        for (KhachSan c : khachSans) {
            if (c.getPerson().getCMND() == CMND) {
                khachSan = c;
            }
        }
        if (khachSan != null) {
            System.out.println(khachSan);
        } else {
            System.out.println(" không có khách với cmnd tương ứng");
        }
    }
    public void tinhTien(){
        for (KhachSan c: khachSans) {
            System.out.println(c.getPerson().getCMND() + "---" + c.getPrice()*c.getNgaytro());
        }
    }
    public KhachSan creatKhachSan(){
        System.out.println(" nhap so ngay kach tro: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" nhap loai phong: ");
        String type = scanner.nextLine();
        System.out.println(" nhap gia phong: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhap ten nguoi");
        String fullName = scanner.nextLine();
        System.out.println(" nhap ngay sinh: ");
        String dateofBirth = scanner.nextLine();
        System.out.println(" nhap so CMND: ");
        int CMMD = scanner.nextInt();
        Person person = new Person(fullName,dateofBirth,CMMD);
       return new KhachSan(day,type,price,person);
    }
}
