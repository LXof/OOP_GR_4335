package Classes;

public class PromotionalClient extends Actor {
    private String promotionName;
    private int clientId;
    private static int participantsCount;
    
    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantsCount++;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public int getClientId() {
        return clientId;
    }

    public static int getParticipantsCount() {
        return participantsCount;
    }

    @Override
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
          

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
