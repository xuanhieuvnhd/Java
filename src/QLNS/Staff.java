package test;

public class Staff {
    private int maso;
    private String ten;
    private int tuoi;
    private String gioitinh;
    private int luong;
    public Staff(int maso, String ten, int tuoi, String gioitinh, int luong) {
        this.maso = maso;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
        @Override
    public String toString() {
        return "Staff{" +
                "maso=" + maso +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", luong=" + luong +
                '}';
    }
}