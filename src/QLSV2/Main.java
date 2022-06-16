package QLSV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVienManager dssv = new SinhVienManager();
        int luaChon = 0;
        do {
            System.out.println("-----------------  MENU --------------- ");
            System.out.println(
                               "1.	Them sinh vien.\n"
                            + "2.	In danh sach ra man hinh.\n"
                            + "3.	Kiem tra danh sach co rong? \n"
                            + "4.	In ra so luong trong danh sach.\n"
                            + "5.	Lam rong danh sach.\n"
                            + "6.	Kiem tra sinh vien bang ID.\n"
                            + "7.	Xoa sinh vien bang ID.\n"
                            + "8.	Tim kiem sinh vien bang ten.\n"
                            + "9.	Liet ke danh sach co diem tu cao xuong.\n"
                            + "0. Thoat khoi chuong trinh");
            System.out.println("---------------------------------------------");
            System.out.print("\t\tVui long chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
//				1.	Thêm sinh viên vào danh sách.
                System.out.print("Ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                System.out.print("Ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.print("Nam sinh: ");
                int namSinh = sc.nextInt();
                System.out.print("Diem trung binh: ");
                float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            } else if (luaChon == 2) {
//				2.	In danh sách sinh viên ra màn hình.
                dssv.inDanhSachSinhVien();

            } else if (luaChon == 3) {
//				3.	Kiểm tra danh sách có rỗng hay không.
                System.out.print("Danh sach rong: " );
            } else if (luaChon == 4) {
//				4.	Lấy ra số lượng sinh viên trong danh sách.
                System.out.print("So luong hien tai: " + dssv.laySoLuongSinhVien());
            } else if (luaChon == 5) {
//				5.	Làm rỗng danh sách sinh viên.
                dssv.lamRongDanhSach();
            } else if (luaChon == 6) {
//				6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.print("Kiem tra sinh vien bang ID: " + dssv.kiemTraTonTai(sv));
            } else if (luaChon == 7) {
//				7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
                System.out.print("Nhap ID: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien theo ID: " + dssv.xoaSinhVien(sv));
            } else if (luaChon == 8) {
//				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
                System.out.print("Ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.print("Ket qua tim kiem: ");
                dssv.timSinhVien(hoVaTen);

            } else if (luaChon == 9) {
//				9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
            }
        } while (luaChon != 0);
    }
}
