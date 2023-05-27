package Domen;

public class Bottle extends Product {
    private int volume;

    /**
     * Create a product for VM
     * 
     * @param productId
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @throws Exception
     */
    public Bottle (int productId, String productName, String productCategory, double price, int volume) throws Exception {
        super(productId, productName, productCategory, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product {" +
            "name='" + super.getProductName() + '\'' +
            "category='" + getProductCategory() + '\'' +
            ", cost=" + getPrice() +
            ", volune=" + volume +
            '}';     
    }


}
