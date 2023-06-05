package Domen;

public class Product {

    private int productId;
    private String productName;         
    private String productCategory;     
    private Double price;   

    /**
     * Создает объект продукта.
     *
     * @param productId         идентификатор продукта
     * @param productName       название продукта
     * @param productCategory   категория продукта
     * @param price             цена продукта
     */
    public Product(int id, String name, String category, Double price) {
        this.productId = id;
        this.productName = name;
        this.productCategory = category;
        this.price = price;
    }

    /**
     * Возвращает идентификатор продукта.
     *
     * @return идентификатор продукта
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Возвращает название продукта.
     *
     * @return название продукта
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Возвращает категорию продукта.
     *
     * @return категория продукта
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Устанавливает категорию продукта.
     *
     * @param productCategory категория продукта
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;        
    }

    /**
     * Возвращает цену продукта.
     *
     * @return цена продукта
     */
    public double getPrice() {
        return price;
    }

    /**
     * Устанавливает цену продукта.
     *
     * @param price цена продукта
     * @throws IllegalStateException если цена указана некорректно (меньше или равна нулю)
     */
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!"));
        }
        this.price = price;
    }

    /**
     * Возвращает строковое представление объекта Product.
     *
     * @return строковое представление объекта Product
     */
    @Override
    public String toString() {
        return "Product {" +
            "name='" + productName + '\'' +
            ", category='" + productCategory + '\'' +
            ", cost=" + price +
            '}';     
    }

    
}
