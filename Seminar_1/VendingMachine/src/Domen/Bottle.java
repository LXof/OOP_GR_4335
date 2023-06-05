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

    /**
     * Возвращает объем горячего напитка.
     *
     * @return объем горячего напитка
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Устанавливает объем горячего напитка.
     *
     * @param volume объем горячего напитка
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Возвращает строковое представление объекта ГорячийНапиток.
     * 
     * @return строковое представление объекта ГорячийНапиток
     */
    @Override
    public String toString() {
        return "Product {" +
            "name='" + super.getProductName() + '\'' +
            ", category='" + getProductCategory() + '\'' +
            ", cost=" + getPrice() +
            ", volune=" + volume +
            '}';     
    }
}
