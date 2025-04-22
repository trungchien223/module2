package ss12.bai_tap.controller;

import ss12.bai_tap.model.Product;
import ss12.bai_tap.service.IProductService;
import ss12.bai_tap.service.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public void add(Product product) {
        productService.add(product);
    }

    public void update(int id, String newName, double newPrice) {
        productService.update(id, newName, newPrice);
    }

    public List<Product> findAll() {
        return productService.findAll();
    }

    public List<Product> searchByName(String name) {
        return productService.searchByName(name);
    }

    public void delete(int id) {
        productService.delete(id);
    }

    public void sortAscending() {
        productService.sortByPriceAscending();
    }

    public void sortDescending() {
        productService.sortByPriceDescending();
    }

}
