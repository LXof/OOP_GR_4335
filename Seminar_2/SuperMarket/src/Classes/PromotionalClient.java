package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс, представляющий клиента-участника промо-акции.
 */
public class PromotionalClient extends Actor implements iReturnOrder {
    private String promotionName;
    private int clientId;
    private static int participantsCount;
    
    /**
     * Создает объект клиента-участника промо-акции с заданным именем и названием акции
     * 
     * @param name          имя клиента
     * @param promotionName название промо-акции
     */
    public PromotionalClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = ++participantsCount;  
    }

    /**
     * Возвращает название промо-акции.
     * 
     * @return  название промо-акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Возвращает идентификатор клиента.
     * 
     * @return  идентификатор клиента
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Возващает количество участников промо-акции.
     * 
     * @return  количество участников промо-акции
     */
    public static int getParticipantsCount() {
        return participantsCount;
    }

    /**
     * Устанавливает состояние получения заказа клиентом.
     *
     * @param makeOrder состояние получения заказа
     */
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает состояние выполнения заказа клиентом.
     *
     * @param takeOrder состояние выполнения заказа
     */
    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * Возвращает состояние получения заказа клиентом.
     *
     * @return true, если клиент получил заказ, false в противном случае
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    
    /**
     * Возвращает состояние выполнения заказа клиентом.
     *
     * @return true, если клиент выполнил заказ, false в противном случае
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Возвращает объект клиента.
     *
     * @return объект клиента
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Возвращает имя клиента.
     *
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Реализация метода возврата товара для клиента.
     */
    @Override
    public void returnOrder() {
        // Логика возврата товара для обычного клиента
        System.out.println(getName() + " вернул товар.");
    }

    /**
     * Реализация метода отмены заказа для клиента.
     */
    @Override
    public void cancelOrder() {
        System.out.println(getName() + " отменил заказ.");
    }

}
