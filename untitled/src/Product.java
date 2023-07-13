import java.util.Map;

class Product {
    public String productNumber;
    public String productName;



    public double purchasePrice;

    public int quantity;

    public Product(String productNumber, String productName,double purchasePrice, int quantity) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

}

