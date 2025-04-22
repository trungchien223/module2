package ss12.bai_tap.comparator;

import ss12.bai_tap.model.Product;

import java.util.Comparator;

public class SortByPriceAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
