package hinhTron;

import java.util.Scanner;
public class mainhinhTron {
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        r = scanner.nextDouble();
        System.out.println("Dien tich hinh tron la: " + classhinhTron.tinhDienTich(r));
        System.out.println("Chu vi hinh tron la: " + classhinhTron.tinhChuVi(r));
    }
}
