package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.Oto;
import quan_ly_phuong_tien_giao_thong.model.PhuongTien;
import quan_ly_phuong_tien_giao_thong.model.XeMay;
import quan_ly_phuong_tien_giao_thong.model.XeTai;

public class PhuongTienRepository implements IPhuongTienRepository {
    private static final PhuongTien[] phuongTienList = new PhuongTien[10];

    static {
        phuongTienList[0] = new XeTai("43C-111.11", "Hyundai", 2020, "Huy", 3.5);
        phuongTienList[1] = new Oto("29A-222.22", "Toyota", 2019, "Chien", 5, "Du lịch");
        phuongTienList[2] = new XeMay("77B1-333.33", "Yamaha", 2021, "Vuong", 110);
        phuongTienList[3] = new Oto("73B1-333.33", "Lamborghini", 2021, "Vinh", 6, "The thao");
    }

    @Override
    public PhuongTien[] findAll() {
        return phuongTienList;
    }

    @Override
    public void add(PhuongTien phuongTien) {
        for (int i = 0; i < phuongTienList.length; i++) {
            if (phuongTienList[i] == null) {
                phuongTienList[i] = phuongTien;
                break;
            }
        }
    }

    @Override
    public PhuongTien findByBienSo(String bienSo) {
        for (int i = 0; i < phuongTienList.length; i++) {
            if (phuongTienList[i] != null && phuongTienList[i].getBienKiemSoat().equals(bienSo)) {
                return phuongTienList[i];
            }
        }
        return null;
    }

    @Override
    public void delete(String bienSo) {
        for (int i = 0; i < phuongTienList.length; i++) {
            if (phuongTienList[i] != null && phuongTienList[i].getBienKiemSoat().equals(bienSo)) {
                for (int j = i; j < phuongTienList.length - 1; j++) {
                    phuongTienList[j] = phuongTienList[j + 1];
                }
                phuongTienList[phuongTienList.length - 1] = null;
                break;
            }
        }
    }

}
