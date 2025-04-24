package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.ReadAndWriteFile;
import quan_ly_phuong_tien_giao_thong.model.Oto;
import quan_ly_phuong_tien_giao_thong.model.PhuongTien;
import quan_ly_phuong_tien_giao_thong.model.XeMay;
import quan_ly_phuong_tien_giao_thong.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository implements IPhuongTienRepository {
    private static final String XE_TAI_FILE = "module_2/src/quan_ly_phuong_tien_giao_thong/data/xe_tai.csv";
    private static final String XE_MAY_FILE = "module_2/src/quan_ly_phuong_tien_giao_thong/data/xe_may.csv";
    private static final String OTO_FILE = "module_2/src/quan_ly_phuong_tien_giao_thong/data/oto.csv";

    @Override
    public List<PhuongTien> findAll() {
        List<PhuongTien> phuongTienList = new ArrayList<>();

        for (String line : ReadAndWriteFile.readFileCSV(XE_TAI_FILE)) {
            if (line.trim().isEmpty()) continue;
            String[] parts = line.split(",");
            String bienSo = parts[0];
            String hangSX = parts[1];
            int namSX = Integer.parseInt(parts[2]);
            String chuSoHuu = parts[3];
            double trongTai = Double.parseDouble(parts[4]);
            phuongTienList.add(new XeTai(bienSo, hangSX, namSX, chuSoHuu, trongTai));
        }

        for (String line : ReadAndWriteFile.readFileCSV(XE_MAY_FILE)) {
            if (line.trim().isEmpty()) continue;
            String[] parts = line.split(",");
            String bienSo = parts[0];
            String hangSX = parts[1];
            int namSX = Integer.parseInt(parts[2]);
            String chuSoHuu = parts[3];
            double congXuat = Double.parseDouble(parts[4]);
            phuongTienList.add(new XeMay(bienSo, hangSX, namSX, chuSoHuu, congXuat));
        }

        for (String line : ReadAndWriteFile.readFileCSV(OTO_FILE)) {
            if (line.trim().isEmpty()) continue;
            String[] parts = line.split(",");
            String bienSo = parts[0];
            String hangSX = parts[1];
            int namSX = Integer.parseInt(parts[2]);
            String chuSoHuu = parts[3];
            int choNgoi = Integer.parseInt(parts[4]);
            String kieuXe = parts[5];
            phuongTienList.add(new Oto(bienSo, hangSX, namSX, chuSoHuu, choNgoi, kieuXe));
        }

        return phuongTienList;
    }

    @Override
    public void add(PhuongTien phuongTien) {
        List<String> lines = new ArrayList<>();
        lines.add(phuongTien.toCSV());

        if (phuongTien instanceof XeTai) {
            ReadAndWriteFile.writeFileCSV(XE_TAI_FILE, lines, true);
        } else if (phuongTien instanceof XeMay) {
            ReadAndWriteFile.writeFileCSV(XE_MAY_FILE, lines, true);
        } else if (phuongTien instanceof Oto) {
            ReadAndWriteFile.writeFileCSV(OTO_FILE, lines, true);
        }
    }

    @Override
    public void delete(String bienSo) {
        List<PhuongTien> all = findAll();
        List<PhuongTien> updated = new ArrayList<>();

        for (PhuongTien pt : all) {
            if (!pt.getBienKiemSoat().equals(bienSo)) {
                updated.add(pt);
            }
        }

        List<String> xeTaiList = new ArrayList<>();
        List<String> xeMayList = new ArrayList<>();
        List<String> otoList = new ArrayList<>();

        for (PhuongTien pt : updated) {
            if (pt instanceof XeTai) {
                xeTaiList.add(pt.toCSV());
            } else if (pt instanceof XeMay) {
                xeMayList.add(pt.toCSV());
            } else if (pt instanceof Oto) {
                otoList.add(pt.toCSV());
            }
        }

        ReadAndWriteFile.writeFileCSV(XE_TAI_FILE, xeTaiList, false);
        ReadAndWriteFile.writeFileCSV(XE_MAY_FILE, xeMayList, false);
        ReadAndWriteFile.writeFileCSV(OTO_FILE, otoList, false);
    }

    @Override
    public PhuongTien findByBienSo(String bienSo) {
        List<PhuongTien> list = findAll();
        for (PhuongTien pt : list) {
            if (pt.getBienKiemSoat().equals(bienSo)) {
                return pt;
            }
        }
        return null;
    }
}