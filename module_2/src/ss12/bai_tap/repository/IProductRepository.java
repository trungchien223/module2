package ss12.bai_tap.repository;

import ss12.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    void update(int id, String newName, double newPrice);

    void delete(int id);

    List<Product> searchByName(String name);

    void sortByPriceAscending();

    void sortByPriceDescending();
}
