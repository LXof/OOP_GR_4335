package Domen;

public class Product {

    private int productId;
    private String productName;         // поле Имя
    private String productCategory;     // поле Цена
    private Double price;   // поле Цена

    public Product(int id, String name, String category, Double price) {
        this.productId = id;
        this.productName = name;
        this.productCategory = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!"));
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
            "name='" + productName + '\'' +
            "category='" + productCategory + '\'' +
            ", cost=" + price +
            '}';     
    }

    
}
