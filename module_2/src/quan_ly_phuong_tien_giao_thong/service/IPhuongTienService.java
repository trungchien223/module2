package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.PhuongTien;


import java.util.List;

public interface IPhuongTienService {
    List<PhuongTien> findAll();

    void delete(String bienSo);

    void add(PhuongTien phuongTien);

    PhuongTien findByBienSo(String bienSo);

}
