package HinhVuong;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhVuong hinhVuong = new HinhVuong();
        System.out.print("Nhap chieu dai mot canh hinh vuong: ");
        hinhVuong.setCanh(scanner.nextDouble());
        System.out.print("Dien tich hinh vuong la: "+hinhVuong.dienTich());
        System.out.print("\nChu vi hinh vuong la : "+hinhVuong.chuVi());
    }
}
