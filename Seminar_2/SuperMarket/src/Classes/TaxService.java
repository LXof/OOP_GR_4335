package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class TaxService implements iActorBehaviour, iReturnOrder  {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

    public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
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