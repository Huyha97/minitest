
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số sinh viên muốn tạo: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManager studentManager = new StudentManager(students);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả");
            System.out.println("2. thêm người vào danh sách");
            System.out.println("3. tìm vị trí 1 người trong danh sách");
            System.out.println("4. Xoá 1 người trong danh sách theo mã");
            System.out.println("5. Sửa thông tin của 1 người theo mã");
            System.out.println("6. Sắp xếp danh sách theo điểm trung bình.");
            System.out.println("7. Tính tổng điểm");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Manager.displayStudent();
                    break;
                case 2:
                    Student student = createStudent(scanner);
                    StudentManager.addStudent(student);
                case 3:
            }
        } while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println(" Nhập id: ");
        int id = scanner.nextInt();
        System.out.println(" Nhập điểm trung bình: ");
        double avgPoint = scanner.nextDouble();
        return new Student(name, age, id,avgPoint);
    }
}