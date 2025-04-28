package ss13.bai_tap.bt_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoiNhap = scanner.nextLine();

        String chuoiConDaiNhat = "";
        String chuoiConHienTai = "";

        for (int i = 0; i < chuoiNhap.length(); i++) {
            if (chuoiConHienTai.length() == 0 || chuoiNhap.charAt(i) >= chuoiConHienTai.charAt(chuoiConHienTai.length() - 1)) {
                chuoiConHienTai += chuoiNhap.charAt(i);
            } else {
                chuoiConHienTai = "" + chuoiNhap.charAt(i);
            }

            if (chuoiConHienTai.length() > chuoiConDaiNhat.length()) {
                chuoiConDaiNhat = chuoiConHienTai;
            }
        }

        System.out.println("Chuỗi con tăng dần dài nhất là: " + chuoiConDaiNhat);
    }
}
