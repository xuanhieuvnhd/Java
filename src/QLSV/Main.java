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
                    displayOneStudent(studentManager,scanner);
                    break;
                case  5:
                    studentManager.display();
            }
        } while (choice != 0);
    }
    public static void displayEdit(StudentManager studentManager, Scanner scanner) {
        System.out.print("Nhap ID can thay doi: ");
        int editId = scanner.nextInt();
        scanner.nextLine();
        boolean checkEdit = studentManager.updateEdit(editId, scanner);
        if (checkEdit) {
            System.out.println("Thay doi thanh cong !");
        } else {
            System.out.println(" Khong ton tai !");
        }
    }

    public static void displayDelete(StudentManager studentManager, Scanner scanner) {
        System.out.print("Nhap ID can xoa: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();
        boolean checkDelete = studentManager.deleteStudent(deleteId);
        if (checkDelete) {
            System.out.println("Xoa thanh cong !");
        } else {
            System.out.println(" Khong ton tai !" );
        }
    }
    private static void displayOneStudent(StudentManager studentManager, Scanner scanner) {
        System.out.print("Nhap ID SinhVien muon hien thi: ");
        int displayID = scanner.nextInt();
        if (!studentManager.displayOne(displayID)) {
            System.out.println(" Khong ton tai !");
        }
    }
}
