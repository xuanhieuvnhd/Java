package HinhChuNhat;

public class HinhChuNhat {

    double dai, rong;

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    double TinhDienTich() {
        return dai * rong;
    }

    double TinhChuVi() {
        return (dai + rong) * 2;
    }
}
