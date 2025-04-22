package ss12.bai_tap.repository;


import ss12.bai_tap.comparator.SortByPriceAscending;
import ss12.bai_tap.comparator.SortByPriceDescending;
import ss12.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(new Product(1, "Iphone 15", 29999));
        productList.add(new Product(2, "Samsung Galaxy S23", 25999));
        productList.add(new Product(3, "Xiaomi Redmi Note 13", 9999));
    }

    @Override

    public List<Product> findAll() {
        return productList;
    }


    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public void sortByPriceAscending() {
        Collections.sort(productList, new SortByPriceAscending());
    }

    @Override
    public void sortByPriceDescending() {
        Collections.sort(productList, new SortByPriceDescending());
    }
}
