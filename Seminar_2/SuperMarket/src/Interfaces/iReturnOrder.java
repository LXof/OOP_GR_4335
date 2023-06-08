package Interfaces;

/**
 * Интерфейс, определяющий поведение возврата заказа.
 */
public interface iReturnOrder {

    /**
     * Возвращает заказ.
     */
    void returnOrder();

    /**
     * Отменяет заказ.
     */
    void cancelOrder();
}
