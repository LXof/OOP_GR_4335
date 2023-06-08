package Interfaces;

import Classes.Actor;
/**
 * Интерфейс, определяющий поведение актера.
 */
public interface iActorBehaviour {
    
    /**
     * Устанавливает состояние получения заказа актерром.
     * 
     * @param makeOrder состояние получения заказа
     */
    void setTakeOrder(boolean makeOrder);

    /**
     * Устанавливает состояние выполнения заказа актром.
     * 
     * @param takeOrder состояние выполнения заказа
     */
    void setMakeOrder(boolean takeOrder);

    /**
     * Проверяет состояние получения заказа актером.
     * 
     * @return  true, если актер получил заказ, иначе false
     */
    boolean isTakeOrder();

    /**
     * Проверяет состояние выполнения заказа актером.
     * 
     * @return  true, если актер выполнил заказ, иначе false
     */
    boolean isMakeOrder();

    /**
     * Возвращает объект актера.
     * 
     * @return  объект актера4
     */
    Actor getActor();
}
