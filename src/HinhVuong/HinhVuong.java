package HinhVuong;

public class HinhVuong {
    double canh;

    public HinhVuong() {
        super();
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double dienTich(){
        return canh*canh;
    }
    public  double chuVi(){
        return canh*4;
    }
}
