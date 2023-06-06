package Classes;

public class SpecialClient extends Actor {
    int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    public int getId() {
        return idVip;
    }

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
