package test;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staffmanager menu = new Staffmanager();
        int choice;
        do {
            System.out.println("\t\t------------------Menu-----------------");
            System.out.println("\t\t1. Them nhan vien");
            System.out.println("\t\t2. Hien thi tat ca nhan vien");
            System.out.println("\t\t3. Hien thi nhan vien bang ma so");
            System.out.println("\t\t4. Cap nhat thong tin nhan vien");
            System.out.println("\t\t5. Xoa nhan vien");
            System.out.println("\t\t0. Thoat");
            System.out.println("\t\t-------------------------------------------");
            System.out.print("\t\t\t\tNhap lua chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> menu.arrayNew();
                case 2 -> menu.displayStaff();
                case 3 -> menu.displayOneStaff();
                case 4 -> menu.editStaff(scanner);
                case 5 -> menu.deleteStaff();
            }
        }
        while (choice != 0);
    }
}