package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.PhuongTien;

import java.util.ArrayList;

public interface IPhuongTienService {
    ArrayList<PhuongTien> findAll();

    void delete(String bienSo);

    void add(PhuongTien phuongTien);

    PhuongTien findByBienSo(String bienSo);

}
