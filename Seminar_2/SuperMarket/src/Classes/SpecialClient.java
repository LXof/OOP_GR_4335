package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс, представляющий специального клиента.
 */
public class SpecialClient extends Actor implements iReturnOrder{
    private int idVip;
    private String returnLogEntry;

    /**
     * Создает объект специального клиента с указанным именем и идентификатором VIP.
     * 
     * @param name      имя клиента
     * @param idVip     идентификатор VIP
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    /**
     * Возвращает идентификатор VIP клиента.
     * 
     * @return  идентификатор VIP клиента
     */
    public int getId() {
        return idVip;
    }

    /**
     * Возвращает имя клиента.
     * 
     * @return имя клиента
     */
    public String getName() {
        return super.name;
    }

    /**
     * Возвращает состояние заказа.
     * 
     * @return true, если клиент оформил заказ, false в противном случае
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Возвращает состояние выполнения заказа клиента.
     *
     * @return true, если заказ клиента выполнен, false в противном случае
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает состояние заказа клиента.
     *
     * @param makeOrder состояние заказа клиента
     */
    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    
    /**
     * Устанавливает состояние выполнения заказа клиента.
     *
     * @param takeOrder состояние выполнения заказа клиента
     */
    public void setMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
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
     * Реализация метода возврата товара для специального клиента.
     */
    @Override
    public void returnOrder() {
        // Логика возврата товара для обычного клиента
        returnLogEntry = getActor().getName() + " вернул товар.";
        System.out.println(returnLogEntry);
    }

    /**
     * Реализация метода отмены заказа для специального клиента.
     */
    @Override
    public void cancelOrder() {
        returnLogEntry = getActor().getName() + " отменил заказ.";
        System.out.println(returnLogEntry);
    }

    @Override
    public String getReturnLogEntry() {
        return returnLogEntry;
    }


}
