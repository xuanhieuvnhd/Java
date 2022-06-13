package HinhChuNhat;

import java.util.Scanner;

public class MainHinhChuNhat {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println("Nhap vao chieu dai: ");
        hinhChuNhat.setDai(scanner.nextDouble());
        System.out.println("Nhap vao rong dai: ");
        hinhChuNhat.setRong(scanner.nextDouble());
        System.out.println("Chu vi hinh chu nhat la: "+hinhChuNhat.TinhChuVi());
        System.out.println("Dien tich hinh chu nhat la: "+hinhChuNhat.TinhDienTich());
    }
}