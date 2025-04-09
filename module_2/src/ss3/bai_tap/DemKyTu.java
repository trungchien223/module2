package ss3.bai_tap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "huy vinh chien Vuong";
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' là: " + count);
    }
}
