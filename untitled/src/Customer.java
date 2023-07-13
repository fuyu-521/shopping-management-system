import java.util.*;
class Customer extends User {
    public ShoppingCart shoppingCart;//购物车
    public List<Order> orderHistory;//购物历史

    public Customer(String username, String password) {
        super(username, password);
        this.shoppingCart = new ShoppingCart();
        this.orderHistory = new ArrayList<>();
    }




    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void checkout() {
        // 结账的逻辑
        Order order = new Order(shoppingCart.getCartItems());
        orderHistory.add(order);
        shoppingCart.clear();
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
}