package quan_ly_phuong_tien_giao_thong.controller;

import quan_ly_phuong_tien_giao_thong.model.Oto;
import quan_ly_phuong_tien_giao_thong.model.PhuongTien;
import quan_ly_phuong_tien_giao_thong.model.XeMay;
import quan_ly_phuong_tien_giao_thong.model.XeTai;
import quan_ly_phuong_tien_giao_thong.service.IPhuongTienService;
import quan_ly_phuong_tien_giao_thong.service.PhuongTienService;
import quan_ly_phuong_tien_giao_thong.view.View;

import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private static final IPhuongTienService service = new PhuongTienService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(" MENU QUẢN LÝ PHƯƠNG TIỆN ");
                System.out.println("1. Thêm mới phương tiện");
                System.out.println("2. Hiển thị phương tiện");
                System.out.println("3. Xóa phương tiện");
                System.out.println("4. Thoát");
                System.out.print("Chọn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2:
                        display();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so nguyen");
            }

        }
    }

    private static void add() {
        System.out.println("1.Them xe tai");
        System.out.println("2.Them xe oto");
        System.out.println("3.Them xe may");
        System.out.println("4. Quay ve");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                XeTai xeTai = View.themXeTai();
                service.add(xeTai);
                System.out.println("them thanh cong");
                break;
            case 2:
                Oto oto = View.themOto();
                service.add(oto);
                System.out.println("them thanh cong");
                break;
            case 3:
                XeMay xeMay = View.themXeMay();
                service.add(xeMay);
                System.out.println("them thanh cong");
                break;
            case 4:

                break;
            default:
                System.out.println("Nhap lai");
        }
    }

    private static void delete() {
        System.out.println("nhap bien kiem soat: ");
        String bienKiemSoat = scanner.nextLine();
        PhuongTien phuongTien = service.findByBienSo(bienKiemSoat);
        if (phuongTien != null) {
            System.out.println("Ban co muon xoa khong (Y/N)");
            String kiemTra = scanner.nextLine().toUpperCase();
            if (kiemTra.equals("Y")) {
                service.delete(bienKiemSoat);
                System.out.println("da xoa");
            } else {
                System.out.println("cancel");
            }
        } else {
            System.out.println("bien so khong ton tai");
        }
    }

    private static void display() {
        while (true) {
            System.out.println("1. Hiển thị xe tải");
            System.out.println("2. Hiển thị ôtô");
            System.out.println("3. Hiển thị xe máy");
            System.out.println("4. Quay về");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean isFind = false;

            List<PhuongTien> phuongTiens = service.findAll();

            switch (choice) {
                case 1:
                    for (PhuongTien pt : phuongTiens) {
                        if (pt instanceof XeTai) {
                            System.out.println(pt);
                            isFind = true;
                        }
                    }
                    break;
                case 2:
                    for (PhuongTien pt : phuongTiens) {
                        if (pt instanceof Oto) {
                            System.out.println(pt);
                            isFind = true;
                        }
                    }
                    break;
                case 3:
                    for (PhuongTien pt : phuongTiens) {
                        if (pt instanceof XeMay) {
                            System.out.println(pt);
                            isFind = true;
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    continue;
            }

            if (!isFind) {
                System.out.println("Không tìm thấy phương tiện nào.");
            }
        }
    }

}
