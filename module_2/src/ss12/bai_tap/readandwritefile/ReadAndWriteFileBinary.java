package ss12.bai_tap.readandwritefile;

import ss12.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileBinary {

    public static void writeToFile(List<Product> productList, String filePath) {
        File file = new File(filePath);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            ProductListWrapper wrapper = new ProductListWrapper(productList);
            oos.writeObject(wrapper);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file nhị phân: " + e.getMessage());
        }
    }

    public static List<Product> readFromFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ProductListWrapper wrapper = (ProductListWrapper) ois.readObject();
            return wrapper.getProductList();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file nhị phân: " + e.getMessage());
        }

        return new ArrayList<>();
    }
}
