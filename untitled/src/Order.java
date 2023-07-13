import java.util.Date;
import java.util.Map;

class Order {
    public Date purchaseTime;
    public Map<Product, Integer> productList;

    public Order(Map<Product, Integer> productList) {
        this.purchaseTime = new Date();
        this.productList = productList;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }
}