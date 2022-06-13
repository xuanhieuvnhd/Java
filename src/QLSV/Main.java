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
            System.out.println("4. Hien thi tat ca SinhVien");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            System.out.print("Hay chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    displayEdit(studentManager, scanner);
                    break;
                case 3:
                    displayDelete(studentManager, scanner);
                    break;
                case 4:
                    studentManager.display();
                    break;
            }
        } while (choice != 0);
    }
    public static void displayEdit(StudentManager StudentManager, Scanner scanner) {
        System.out.print("Nhap ID can thay doi: ");
        int editId = scanner.nextInt();
        scanner.nextLine();
        boolean checkEdit = StudentManager.updateEdit(editId, scanner);
        if (checkEdit) {
            System.out.println("Thay doi thanh cong !");
        } else {
            System.out.println(" Khong ton tai !");
        }
    }

    public static void displayDelete(StudentManager StudentManager, Scanner scanner) {
        System.out.print("Nhap ID can xoa: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();
        boolean checkDelete = StudentManager.deleteStudent(deleteId);
        if (checkDelete) {
            System.out.println("Xoa thanh cong !");
        } else {
            System.out.println(" Khong ton tai !" );
        }
    }
}
