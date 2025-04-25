package ss12.bai_tap.repository;

import ss12.bai_tap.readandwritefile.ReadAndWriteFileCSV;
import ss12.bai_tap.readandwritefile.ReadAndWriteFileBinary;
import ss12.bai_tap.comparator.SortByPriceAscending;
import ss12.bai_tap.comparator.SortByPriceDescending;
import ss12.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String CSV_FILE_PATH = "module_2/src/ss12/bai_tap/data/products.csv";
    private static final String BINARY_FILE_PATH = "module_2/src/ss12/bai_tap/data/products.dat";

    private List<Product> productList;

    public ProductRepository() {
        this.productList = loadFromCSVFile();
    }

    //  đọc từ file CSV
    private List<Product> loadFromCSVFile() {
        List<String> lineList = ReadAndWriteFileCSV.readFileCSV(CSV_FILE_PATH);
        List<Product> products = new ArrayList<>();
        for (String line : lineList) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                try {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    products.add(new Product(id, name, price));
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi định dạng dữ liệu: " + line);
                }
            }
        }
        return products;
    }

    private List<Product> loadFromBinaryFile() {
        return ReadAndWriteFileBinary.readFromFile(BINARY_FILE_PATH);
    }

    private void saveToCSVFile() {
        List<String> lineList = new ArrayList<>();
        for (Product product : productList) {
            lineList.add(product.getId() + "," + product.getName() + "," + product.getPrice());
        }
        ReadAndWriteFileCSV.writeFileCSV(CSV_FILE_PATH, lineList, false);
    }

    private void saveToBinaryFile() {
        ReadAndWriteFileBinary.writeToFile(productList, BINARY_FILE_PATH);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
        saveToCSVFile();
        saveToBinaryFile();
    }

    @Override
    public void update(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                saveToCSVFile();
                saveToBinaryFile();
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                saveToCSVFile();
                saveToBinaryFile();
                return;
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public void sortByPriceAscending() {
        Collections.sort(productList, new SortByPriceAscending());
        saveToCSVFile();
        saveToBinaryFile();
    }

    @Override
    public void sortByPriceDescending() {
        Collections.sort(productList, new SortByPriceDescending());
        saveToCSVFile();
        saveToBinaryFile();
    }
}
