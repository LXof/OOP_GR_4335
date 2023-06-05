package Domen;

public class HotDrink extends Product {
    
    private int temperature; 

    /**
     * Создает объект горячего напитка.
     *
     * @param productId         идентификатор продукта
     * @param productName       название продукта
     * @param productCategory   категория продукта
     * @param price             цена продукта
     * @param temperature       температура горячего напитка
     */
    public HotDrink(int id, String name, String category, Double price, int temperature) {
        super(id, name, category, price);
        this.temperature = temperature;
    }

    /**
     * Возвращает температуру горячего напитка.
     *
     * @return температура горячего напитка
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Устанавливает температуру горячего напитка.
     *
     * @param temperature температура горячего напитка
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Возвращает строковое представление объекта HotDrink.
     *
     * @return строковое представление объекта HotDrink
     */
    @Override
    public String toString() {
        return "Product {" +
            "name='" + super.getProductName() +'\'' +
            ", category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() + 
            ", temperature=" + temperature + 
            '}';
    }
}
