package VendingNachines;

import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    
    /**
     * Создает автомат с заданным объемом.
     *
     * @param volume объем автомата
     */
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }

    /**
     * Возвращает объем автомата.
     *
     * @return объем автомата
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Устанавливает объем автомата.
     *
     * @param volume объем автомата
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Возвращает список продуктов в автомате.
     *
     * @return список продуктов в автомате
     */
    public List<Product> getProduct() {
        return products;
    }

    /**
     * Устанавливает список продуктов в автомате.
     *
     * @param products список продуктов
     */
    public void setProduct(List<Product> products) {
        this.products = products;
    }

    /**
     * Добавляет продукт в автомат.
     *
     * @param product продукт
     */
    public void addProduct(Product prod) {
        products.add(prod);
    }

    /**
     * Инициализирует список продуктов в автомате.
     *
     * @param productList список продуктов
     */
    public void initProducts(List<Product> productList) {
        products.addAll(productList);
    }
}
