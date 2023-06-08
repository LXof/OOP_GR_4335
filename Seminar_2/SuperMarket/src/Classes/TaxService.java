package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс представляющий налоговую службу
 */
public class TaxService implements iActorBehaviour, iReturnOrder  {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private String returnLogEntry;

    /**
     * Создает объект налоговой службы с именем "Tax audit".
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * Возвращает имя налоговой службы.
     * 
     * @return  имя налоговой службы
     */
    public String getName() {        
        return name;
    }

    /**
     * Возвращает состояние выполнения заказа налоговой службы.
     *
     * @return true, если заказ налоговой службы выполнен, false в противном случае
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Возвращает состояние получения заказа налоговой службой.
     *
     * @return true, если налоговая служба получила заказ, false в противном случае
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Устанавливает состояние выполнения заказа налоговой службы.
     *
     * @param makeOrder состояние выполнения заказа
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает состояние получения заказа налоговой службой.
     *
     * @param takeOrder состояние получения заказа
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    /**
     * Возвращает объект клиента налоговой службы.
     *
     * @return объект клиента
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    /**
     * Реализация метода возврата товара для налоговой службы.
     */
    @Override
    public void returnOrder() {
        // Логика возврата товара для обычного клиента
        returnLogEntry = getActor().getName() + " вернул товар.";
        System.out.println(returnLogEntry);
    }

    /**
     * Реализация метода отмены заказа для налоговой службы.
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