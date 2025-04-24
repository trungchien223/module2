package quan_ly_phuong_tien_giao_thong.model;

public class XeMay extends PhuongTien {
    private double congXuat;

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double congXuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public double getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(double congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cong xuat: " + congXuat;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + congXuat;
    }

}
