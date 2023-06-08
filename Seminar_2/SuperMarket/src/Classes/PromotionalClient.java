package Classes;

import Interfaces.iReturnOrder;

public class PromotionalClient extends Actor implements iReturnOrder {
    private String promotionName;
    private int clientId;
    private static int participantsCount;
    
    public PromotionalClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = ++participantsCount;  
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

    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
          


    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
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
