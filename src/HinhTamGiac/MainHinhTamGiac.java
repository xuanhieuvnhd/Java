package HinhTamGiac;

import java.util.Scanner;

public class MainHinhTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhTamGiac hinhTamGiac = new HinhTamGiac();
        System.out.println("Nhap vao canh day: ");
        hinhTamGiac.setCanhDay(scanner.nextDouble());
        System.out.println("Nhap vao chieu cao: ");
        hinhTamGiac.setChieuCao(scanner.nextDouble());
        System.out.println("Dien tich hinh tam giac la: "+hinhTamGiac.dienTich());
    }
}
