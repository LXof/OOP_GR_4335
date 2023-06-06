package Classes;


public class OrdinaryClient extends Actor {

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
}