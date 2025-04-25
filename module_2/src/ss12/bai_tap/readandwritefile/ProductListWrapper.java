package ss12.bai_tap.readandwritefile;

import ss12.bai_tap.model.Product;

import java.io.Serializable;
import java.util.List;

public class ProductListWrapper implements Serializable {
    private List<Product> productList;

    public ProductListWrapper(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
