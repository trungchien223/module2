package ss16.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();
        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();
        File targetFile = new File(targetPath);

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại. Ghi đè? (y/n): ");
            String confirm = scanner.nextLine();
            if (!confirm.equals("y")) {
                System.out.println("Hủy sao chép.");
                return;
            }
        }

        int charCount = 0;

        try (Reader reader = new FileReader(sourceFile);
             Writer writer = new FileWriter(targetFile)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }

            System.out.println("Sao chép hoàn tất.");
            System.out.println("Số ký tự đã sao chép: " + charCount);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
