package test;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staffmanager menu = new Staffmanager();
        int choice;
        do {
            System.out.println("-----------Menu----------");
            System.out.println("1. Add Staff");
            System.out.println("2. Display Staff");
            System.out.println("3. Edit Staff");
            System.out.println("4. Delete Staff");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menu.arrayNew();
                    break;
                case 2:
                    menu.displayStaff();
                    break;
                case 3:
                    menu.editStaff();
                    break;
                case 4:
                    menu.deleteStaff();
                    break;
            }
        }
        while (choice != 0);
    }
}


