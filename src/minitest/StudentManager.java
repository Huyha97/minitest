//package minitest;
//
//import java.util.Arrays;
//
//public class StudentManager implements Manager {
//
//    private static Student[] students;
//    private static int index = 0;
//
//    public StudentManager(Student[] students) {
//        this.students = students;
//    }
//
//
//
//    @Override
//    public static void displayStudent() {
//        for (Student student : students) {
//            if (student != null) {
//                System.out.println(student);
//            }
//        }
//        System.out.println("---------------");
//    }
//
//    @Override
//    public void addStudent() {
//
//    }
//
//
//    @Override
//    public static void addStudent(Student student) {
//        if (index == students.length) {
//        students = Arrays.copyOf(students, students.length * 2);
//    }
//        students[index] = student;
//        index++;
//        System.out.println("Thêm thành công!");
//        System.out.println("---------------");
//    }
//
//
//    @Override
//    public void searchStudent() {
//
//    }
//
//    @Override
//    public void deleteStudent() {
//
//    }
//
//    @Override
//    public void editStudent() {
//
//    }
//
//    @Override
//    public void sortStudent() {
//
//    }
//
//    @Override
//    public void totalPoint() {
//
//    }
//}
