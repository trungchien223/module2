package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.PhuongTien;

import java.util.ArrayList;

public interface IPhuongTienRepository {
    ArrayList<PhuongTien> findAll();

    void add(PhuongTien phuongTien);

    PhuongTien findByBienSo(String bienSo);

    void delete(String bienSo);
}
