package quan_ly_phuong_tien_giao_thong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // Ghi file CSV
    public static void writeFileCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    // Đọc file CSV
    public static List<String> readFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return stringList;
    }
}