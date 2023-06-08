package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс, представляющий обычного клиента.
 */
public class OrdinaryClient extends Actor implements iReturnOrder {

    private String returnLogEntry;

    /**
     * Создает объект обычноо клиента с указанным именем.
     * @param name  имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
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
     * Возвращает состояние заказа клиента.
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
     * @param makeOrder состояние заказа киента
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
     * Возвращает объект клиент.
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Реаизация метода возврата товара для обычного клиента.
     */
    @Override
    public void returnOrder() {
        // Логика возврата товара для обычного клиента
        returnLogEntry = getActor().getName() + " вернул товар.";
        System.out.println(getName() + " вернул товар.");

    }

    /**
     * Реализация метода отмены заказа для обычного клиента.
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