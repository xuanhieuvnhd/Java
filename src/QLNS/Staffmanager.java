package QLNS;

import java.util.ArrayList;
import java.util.Scanner;

public class Staffmanager {
    private ArrayList<Staff> staffs;

    public Staffmanager() {
        staffs = new ArrayList<>();
    }

    public Staff creatStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String name = scanner.next();
        System.out.print("Tuoi: ");
        int age = scanner.nextInt();
        System.out.print("Nhap luong: ");
        double salary = scanner.nextDouble();
        return new Staff(name,age,salary);
    }

    public void addStaff() {
        Staff staff = creatStaff();
        staffs.add(staff);
    }

    public void addStaffByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vi tri muon them: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= staffs.size()){
            System.out.println("Vi tri khong phu hop !");
        }else {
            Staff staff = creatStaff();
            staffs.add(index, staff);
        }
    }
       public void updateStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vi tri muon cap nhat: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index<0 || index >= staffs.size()){
            System.out.println("Vi tri khong phu hop !");
        }else {
            Staff staff = staffs.get(index);
            System.out.print("Nhap vao ten moi cua nhan vien: ");
            String name = scanner.nextLine();
            staff.setName(name);
            System.out.print("Nhap tuoi moi cua nhan vien: ");
            int age = scanner.nextInt();
            staff.setAge(age);
            System.out.print("Nhap luong moi cua nhan vien: ");
            double salary = scanner.nextDouble();
            staff.setSalary(salary);
            staffs.set(index, staff);
        }
    }
    public void deleteStaff(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao vi tri muon xoa: ");
        int index = scanner.nextInt();
        if (index < 0 || index >=staffs.size()){
            System.out.println("Vi tri khong phu hop !");
        }else {
            staffs.remove(index);
        }
    }
    public void displayStaff() {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }

    public void displayOneStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao vi tri can hien thi: ");
        int index = scanner.nextInt();
        if (index < 0 || index > staffs.size()){
            System.out.println("Vi tri khong phu hop !");
        }else {
            System.out.println(staffs.get(index));
        }
    }
}



