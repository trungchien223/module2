package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.model.PhuongTien;

public interface IPhuongTienRepository {
    PhuongTien[] findAll();

    void add(PhuongTien phuongTien);

    PhuongTien findByBienSo(String bienSo);

    void delete(String bienSo);
}
