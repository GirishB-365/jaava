public class Product {
    private String productName;
    private String productID;
    private double price;
    private int stockQuantity;

    public String getProductName() { return productName; }
    public void setProductName(String name) { this.productName = name; }

    public String getProductID() { return productID; }
    public void setProductID(String id) { this.productID = id; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public void restock(int amount) {
        if (amount > 0) stockQuantity += amount;
    }

    public boolean purchase(int amount) {
        if (amount <= stockQuantity) {
            stockQuantity -= amount;
            return true;
        }
        return false;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}