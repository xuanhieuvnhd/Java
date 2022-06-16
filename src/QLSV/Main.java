package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-------------Menu-------------");
            System.out.println("1. Them SinhVien");
            System.out.println("2. Sua SinhVien bang ID");
            System.out.println("3. Xoa SinhVien bang ID");
            System.out.println("4. Hien thi SinhVien theo ID");
            System.out.println("5. Hien thi tat ca SinhVien");
            System.out.println("6. Tim SinhVien theo ID");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            System.out.print("Hay chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> studentManager.addStudent();
                case 2 -> studentManager.editStudentById();
                case 3 -> studentManager.deleteStudentById();
                case 4 -> studentManager.displayStudentById();
                case 5 -> studentManager.displayStudentAll();
                case 6 -> studentManager.searchStudent();
            }
        } while (choice != 0);
    }
}
