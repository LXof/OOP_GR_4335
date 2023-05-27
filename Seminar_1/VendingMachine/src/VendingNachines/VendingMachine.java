package VendingNachines;

import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Product> getProduct() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
