package ss12.bai_tap.comparator;

import ss12.bai_tap.model.Product;

import java.util.Comparator;

public class SortByPriceDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
