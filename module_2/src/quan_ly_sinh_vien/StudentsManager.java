package quan_ly_sinh_vien;

import java.util.Locale;
import java.util.Scanner;

public class StudentsManager {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "chien");
        students[1] = new Student(2, "huy");
        students[2] = new Student(3, "vuong");
        students[3] = new Student(4, "vinh~");
    }

    public void display() {
        System.out.println("----- DANH SÁCH SINH VIÊN -----");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("nhap id:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap ten:");
                String name = scanner.nextLine();
                students[i] = new Student(id, name);
                break;
            }
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id can xoa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                System.out.println("xoa sinh vien thanh cong");
            }
        }
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id can sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                System.out.println("nhap lai ten can sua:");
                String name = scanner.nextLine();
                students[i].setName(name);
                System.out.println("sua thanh cong");
            }
        }
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten can tim");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(students[i]);
                }
            } else {
                break;
            }
        }
    }
}
