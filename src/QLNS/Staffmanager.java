package test;

import java.util.Scanner;

public class Staffmanager {
    Staff[] staffs;
    int index = 0;

    public Staff creatStaff(Scanner input) {
        System.out.print("Nhap ma so: ");
        int maso = input.nextInt();
        System.out.print("Nhap ten: ");
        String ten = input.next();
        System.out.print("Nhap tuoi: ");
        int tuoi = input.nextInt();
        System.out.print("Nhap gioi tinh: ");
        String gioitinh = input.next();
        System.out.print("Nhap luong: ");
        int luong = input.nextInt();
        return new Staff(maso, ten, tuoi, gioitinh, luong);
    }

    public Staff addStaff(Scanner input1) {
        Staff staff = creatStaff(input1);
        staffs[index] = staff;
        index++;
        return staff;
    }

    public void arrayNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int length = scanner.nextInt();
        staffs = new Staff[length];
        for (int i = 0; i < staffs.length; i++) {
            addStaff(scanner);
        }
    }

    public void editStaff(Scanner input2) {
        Staff staff = creatStaff(input2);
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten moi cua nhan vien: ");
        String ten = input.nextLine();
        staff.setTen(ten);
        System.out.print("Nhap tuoi moi cua nhan vien: ");
        int tuoi = input.nextInt();
        staff.setTuoi(tuoi);
        System.out.print("Nhap luong moi cua nhan vien: ");
        int luong = input.nextInt();
        staff.setLuong(luong);
    }

    public void displayOneStaff() {
        System.out.println("Khong co du lieu");
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
        for (int i = 0; i < staffs.length - 1; i++) {
            if (i < index) {
                newStaff[i] = staffs[i];
            } else {
                newStaff[i] = staffs[i + 1];
            }
        }
        staffs = newStaff;
    }
}



