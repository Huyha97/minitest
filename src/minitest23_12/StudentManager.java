package minitest23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public Student creatStudent() {
        System.out.println(" input id: ");
        int id = scanner.nextInt();
        System.out.println(" input name: ");
        String name = scanner.next();
        System.out.println("input age: ");
        int age = scanner.nextInt();
        System.out.println(" input Math Point: ");
        double Math = scanner.nextDouble();
        System.out.println(" input Physics Point: ");
        double physics = scanner.nextDouble();
        System.out.println(" input Chemistry Point: ");
        double chemistry = scanner.nextDouble();
        return new Student(id, name, age, Math, physics, chemistry);
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public Student deleteById(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        int index = students.indexOf(student);
        return students.remove(index);
    }

    public Student editStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println(" input name: ");
            String name = scanner.next();
            student.setName(name);
            System.out.println("input age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println(" input Math Point: ");
            double Math = scanner.nextDouble();
            student.setMath(Math);
            System.out.println(" input Physics Point: ");
            double physics = scanner.nextDouble();
            student.setPhysics(physics);
            System.out.println(" input Chemistry Point: ");
            double chemistry = scanner.nextDouble();
            student.setChemistry(chemistry);
            students.set(index, student);
        }
        return student;
    }

    public void displayStudentbyId (int id){
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            System.out.println(student);
        }
            else {
                System.out.println(" không có sinh viên với id tương ứng!");
            }
        }


    }
