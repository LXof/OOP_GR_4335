import Domen.Bottle;
import Domen.Product;
import VendingNachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product item1 = new Product(1, "Lays", "Чипсы", 59.0); // Создали продукт
        
        // item1.setPrice(-100);   // Exception in thread "main" java.lang.IllegalStateException: Цена указана некорректно! 
        
        item1.setPrice(98);   // Exception in thread "main" java.lang.IllegalStateException: Цена указана некорректно! 
        Product item2 = new Bottle(2, "Cola", "Water", 50, 500);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59.0));
        iMachine.addProduct(new Bottle(4, "Вода", "Вода", 170, 500));

        for (Product prod: iMachine.getProduct()) {
            System.out.println(prod.toString());
        }

        System.out.println(item1.toString());
        System.out.println(item2.toString());
    }
}
