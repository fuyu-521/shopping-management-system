import java.util.HashMap;
import java.util.Map;

class ShoppingCart {
    public Map<Product, Integer> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        // 将商品加入购物车的逻辑
    }

    public void removeProduct(Product product) {
        // 将商品从购物车中移除的逻辑
    }

    public void updateProductQuantity(Product product, int quantity) {
        // 修改购物车中商品的数量的逻辑
    }

    public void clear() {
        cartItems.clear();
    }

    public Map<Product, Integer> getCartItems() {
        return cartItems;
    }


}
