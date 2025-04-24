package ss12.bai_tap.repository;

import ss12.bai_tap.ReadAndWriteFile;
import ss12.bai_tap.comparator.SortByPriceAscending;
import ss12.bai_tap.comparator.SortByPriceDescending;
import ss12.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "module_2/src/ss12/bai_tap/data/products.csv";

    private List<Product> productList;

    public ProductRepository() {
        this.productList = loadFromFile(); // Load danh sách sản phẩm khi khởi tạo
    }

    private List<Product> loadFromFile() {
        List<String> lineList = ReadAndWriteFile.readFileCSV(FILE_PATH);
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

    private void saveToFile() {
        List<String> lineList = new ArrayList<>();
        for (Product product : productList) {
            lineList.add(product.getId() + "," + product.getName() + "," + product.getPrice());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, lineList, false); // Ghi đè file
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
        saveToFile();
    }

    @Override
    public void update(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                saveToFile();
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                saveToFile();
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
        saveToFile();
    }

    @Override
    public void sortByPriceDescending() {
        Collections.sort(productList, new SortByPriceDescending());
        saveToFile();
    }
}
