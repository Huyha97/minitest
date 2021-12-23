package minitest23_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("--------------MENU--------------");
            System.out.println("1. Hiển thị tất cả sinh viên ");
            System.out.println("2. Thêm sinh viên mới");
            System.out.println("3. Xóa sinh viên theo id  ");
            System.out.println("4. Sửa  sinh viên theo id ");
            System.out.println("5. Hiển thị sinh viên theo id");
            System.out.println("6. In ra danh sách được sắp xếp theo điểm trung bình ");
            System.out.println("7. hiển thị sinh viên có điểm cao nhất ");
            System.out.println("0.Exit ");
            System.out.println(" Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.displayAll();
                    break;
                case 2:
                    Student student = studentManager.creatStudent();
                    studentManager.addStudent(student);
                    break;
                case 3:
                    System.out.println(" nhập id sinh viên muốn xóa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Student s1 = studentManager.deleteById(id);
                    break;
                case 4:
                    System.out.println(" nhập id sinh viên muốn sửa: ");
                    int id4 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudent(id4));
                    break;
                case 5:
                    System.out.println(" nhập id sinh viên muốn hiển thị: ");
                    int id5 = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.displayStudentbyId(id5);
                    break;

            }
        }
        while (choice !=0);
    }
}
