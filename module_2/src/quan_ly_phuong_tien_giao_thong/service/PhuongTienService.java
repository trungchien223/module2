package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.PhuongTien;
import quan_ly_phuong_tien_giao_thong.repository.IPhuongTienRepository;
import quan_ly_phuong_tien_giao_thong.repository.PhuongTienRepository;

import java.util.ArrayList;

public class PhuongTienService implements IPhuongTienService {
    private final IPhuongTienRepository repository = new PhuongTienRepository();

    @Override
    public ArrayList<PhuongTien> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(String bienSo) {
        repository.delete(bienSo);
    }

    @Override
    public void add(PhuongTien phuongTien) {
        repository.add(phuongTien);
    }

    @Override
    public PhuongTien findByBienSo(String bienSo) {
        return repository.findByBienSo(bienSo);
    }
}
