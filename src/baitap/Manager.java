package baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Manager {
private static Set<Animal> animals;
    private final Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.animals = new HashSet<>();
    }

    public static void displayAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public static Animal deleteByName(String name) {
        Animal animal = null;
        for (Animal h : animals) {
            if (h.getName().equals(name)) {
                animal = h;
            }
        }
        animals.remove(animal);
        return animal;
    }

    public static void upDateByName(Scanner scanner) {
        System.out.println(" nhập tên con vật cần sửa: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        Animal AnimalUpdate;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                AnimalUpdate = animal;
                System.out.println("Nhập tên mới: ");
                AnimalUpdate.setName(scanner.nextLine());
                System.out.println(" nhập tuổi mới");
                AnimalUpdate.setAge(scanner.nextInt());
                System.out.println(" nhập cân nặng mới");
                AnimalUpdate.setWeight(scanner.nextDouble());
                scanner.nextLine();
            }
        }
    }

    public static void DisplayByName(Scanner scanner) {
        System.out.println(" nhập tên con vật muốn hiển thị: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        for (Animal animal : animals) {
            if (name.equals(animal.getName())) {
                System.out.println(animal);
            }else
                System.out.println(" không tìm thấy!!!");
            }
    }


    public static Animal creatAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        if (choice == 1) {
            System.out.println(" Nhập tên chó: ");
            String name = scanner.nextLine();
            System.out.println(" nhập tuổi chó: ");
            int age = scanner.nextInt();
            System.out.println(" nhập cân nặng chó: ");
            double weight = scanner.nextDouble();
            return new Animal(name,age,weight);
        } else if (choice ==2) {
            System.out.println(" Nhập tên mèo: ");
            String name = scanner.nextLine();
            System.out.println(" nhập tuổi mèo: ");
            int age = scanner.nextInt();
            System.out.println(" nhập cân nặng mèo: ");
            double weight = scanner.nextDouble();
            return new Animal(name,age,weight);
        } else if (choice ==3) {
            System.out.println(" Nhập tên chuột: ");
            String name = scanner.nextLine();
            System.out.println(" nhập tuổi chuột: ");
            int age = scanner.nextInt();
            System.out.println(" nhập cân nặng chuột: ");
            double weight = scanner.nextDouble();
            return new Animal(name,age,weight);
        }
        return null;
    }










}
