package quan_ly_phuong_tien_giao_thong.model;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Trong tai: " + trongTai;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + trongTai;
    }

}
