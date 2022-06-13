package test;

import java.util.Scanner;

public class Staffmanager {
    int index = 0;
    Staff[] staffs;

    public Staff creatStaff(Scanner input) {
        System.out.print("Nhap ten: ");
        String name = input.next();
        System.out.print("Nhap tuoi: ");
        int age = input.nextInt();
        System.out.print("Nhap luong: ");
        int salary = input.nextInt();
        return new Staff(name, age, salary);
    }

    public void addStaff(Scanner input1) {
        Staff staff = creatStaff(input1);
        staffs[index] = staff;
        index++;
    }

    public void arrayNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong Staff: ");
        int length = scanner.nextInt();
        staffs = new Staff[length];
        for (int i = 0; i < staffs.length; i++) {
            addStaff(scanner);
        }
    }
    public void editStaff(){

    }
    public void displayStaff() {
        for (Staff staff : staffs) {
            if (staff != null) {
                System.out.println(staff);
            }
        }
    }
    public void deleteStaff() {
        Staff[] newStaff = new Staff[staffs.length - 1];
        for (int i = 0; i < staffs.length - 1; i++){
            if (i < index) {
                newStaff[i] = staffs[i];
            } else {
                newStaff[i] = staffs[i + 1];
            }
        }
        staffs = newStaff;
    }
}



