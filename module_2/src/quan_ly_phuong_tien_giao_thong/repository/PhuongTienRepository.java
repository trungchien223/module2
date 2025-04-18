package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.Oto;
import quan_ly_phuong_tien_giao_thong.model.PhuongTien;
import quan_ly_phuong_tien_giao_thong.model.XeMay;
import quan_ly_phuong_tien_giao_thong.model.XeTai;

import java.util.ArrayList;

public class PhuongTienRepository implements IPhuongTienRepository {
    private static final ArrayList<PhuongTien> phuongTienList = new ArrayList<>();

    static {
        phuongTienList.add(new XeTai("43C-111.11", "Hyundai", 2020, "Huy", 3.5));
        phuongTienList.add(new Oto("29A-222.22", "Toyota", 2019, "Chien", 5, "Du lịch"));
        phuongTienList.add(new XeMay("77B1-333.33", "Yamaha", 2021, "Vuong", 110));
        phuongTienList.add(new Oto("73B1-333.33", "Lamborghini", 2021, "Vinh", 6, "Thể thao"));
    }

    @Override
    public ArrayList<PhuongTien> findAll() {
        return phuongTienList;
    }

    @Override
    public void add(PhuongTien phuongTien) {
        phuongTienList.add(phuongTien);
    }

    @Override
    public PhuongTien findByBienSo(String bienSo) {
        for (PhuongTien pt : phuongTienList) {
            if (pt.getBienKiemSoat().equals(bienSo)) {
                return pt;
            }
        }
        return null;
    }

    @Override
    public void delete(String bienSo) {
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (phuongTienList.get(i).getBienKiemSoat().equals(bienSo)) {
                phuongTienList.remove(i);
                break;
            }
        }
    }
}
