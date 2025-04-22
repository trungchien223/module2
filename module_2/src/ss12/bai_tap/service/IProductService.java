package ss12.bai_tap.service;

import ss12.bai_tap.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    void update(int id, String newName, double newPrice);

    void delete(int id);

    List<Product> findAll();

    List<Product> searchByName(String name);

    void sortByPriceAscending();

    void sortByPriceDescending();
}
