package HinhTamGiac;

public class HinhTamGiac {
    double CanhDay, ChieuCao;

    public HinhTamGiac() {
        this.CanhDay = CanhDay;
        this.ChieuCao = ChieuCao;
    }

    public double getCanhDay() {
        return CanhDay;
    }

    public void setCanhDay(double canhDay) {
        this.CanhDay = canhDay;
    }

    public double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.ChieuCao = chieuCao;
    }

    double dienTich() {
        return (CanhDay * ChieuCao) / 2;
    }
}

