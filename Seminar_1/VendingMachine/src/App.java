import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingNachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product item1 = new Product(1, "Lays", "Чипсы", 59.0); // Создали продукт
        // item1.setPrice(-100);   // Exception in thread "main" java.lang.IllegalStateException: Цена указана некорректно! 
        item1.setPrice(98);  
        System.out.println(item1.toString());   
        
        Product item2 = new Bottle(2, "Cola", "Water", 50, 500);
        System.out.println(item2.toString());
        System.out.println();

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59.0));
        iMachine.addProduct(new Bottle(4, "Вода", "Вода", 170, 1500));

        for (Product prod: iMachine.getProduct()) {
            System.out.println(prod.toString());
        }
        System.out.println();



        //ДЗ
        // Создаются объекты tea и coffee класса HotDrink
        HotDrink tea = new HotDrink(1, "Чай черный", "Грячий напиток", 50.0, 80);
        HotDrink coffee = new HotDrink(2, "Кофе", "Грячий напиток", 70.0, 90);
        
        // Добавляются в список productList
        List<Product> productList = new ArrayList<>();
        productList.add(tea);
        productList.add(coffee);

        // Создается объект vendingMachine класса VendingMachine
        VendingMachine vendingMachine = new VendingMachine(1000);

        // Инициализируются продукты в автомате с помощью метода initProducts().
        vendingMachine.initProducts(productList);

        // вывод информации о горячих напитках, которые находятся в автомате.
        System.out.println("В автомате есть следующие горячие напитки:");
        for (Product product : vendingMachine.getProduct()) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                System.out.println(hotDrink);
            }
        }

    }
}
