package ss17.bai_tap.bt_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại. Ghi đè có thể gây mất dữ liệu.");
            System.out.println("Bạn có muốn tiếp tục (yes/no)?");
            String response = scanner.nextLine();
            if (!response.equals("yes")) {
                System.out.println("Hủy thao tác sao chép.");
                return;
            }
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép hoàn tất. Tổng số byte: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp:");
            e.printStackTrace();
        }
    }
}
