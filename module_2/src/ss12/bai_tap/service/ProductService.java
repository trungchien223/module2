package ss12.bai_tap.service;

import ss12.bai_tap.model.Product;
import ss12.bai_tap.repository.IProductRepository;
import ss12.bai_tap.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public void update(int id, String newName, double newPrice) {
        repository.update(id, newName, newPrice);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> searchByName(String name) {
        return repository.searchByName(name);
    }

    @Override
    public void sortByPriceAscending() {
        repository.sortByPriceAscending();
    }

    @Override
    public void sortByPriceDescending() {
        repository.sortByPriceDescending();
    }
}
