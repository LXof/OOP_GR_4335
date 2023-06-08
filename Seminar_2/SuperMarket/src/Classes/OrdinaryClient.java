package Classes;

import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder {

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    
    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    
    public Actor getActor() {
        return this;
    }

    @Override
    public void returnOrder() {
        // Логика возврата товара для обычного клиента
        System.out.println(getName() + " вернул товар.");
    }

    @Override
    public void cancelOrder() {
        System.out.println(getName() + " отменил заказ.");
    }

}