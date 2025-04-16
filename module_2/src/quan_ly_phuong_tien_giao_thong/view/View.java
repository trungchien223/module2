package quan_ly_phuong_tien_giao_thong.view;

import quan_ly_phuong_tien_giao_thong.model.*;

import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);

    private static PhuongTien thongTinChung() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        return new PhuongTien(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu) {
        };
    }

    public static XeTai themXeTai() {
        PhuongTien base = thongTinChung();
        System.out.print("Nhập tải trọng: ");
        double taiTrong = Double.parseDouble(scanner.nextLine());

        return new XeTai(base.getBienKiemSoat(), base.getHangSanXuat(), base.getNamSanXuat(), base.getChuSoHuu(), taiTrong);
    }

    public static XeMay themXeMay() {
        PhuongTien base = thongTinChung();
        System.out.print("Nhập công suất: ");
        double congXuat = Double.parseDouble(scanner.nextLine());

        return new XeMay(base.getBienKiemSoat(), base.getHangSanXuat(), base.getNamSanXuat(), base.getChuSoHuu(), congXuat);
    }

    public static Oto themOto() {
        PhuongTien base = thongTinChung();
        System.out.print("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();

        System.out.print("Nhập số chỗ ngồi: ");
        int choNgoi = Integer.parseInt(scanner.nextLine());

        return new Oto(base.getBienKiemSoat(), base.getHangSanXuat(), base.getNamSanXuat(), base.getChuSoHuu(), choNgoi, kieuXe);
    }
}
