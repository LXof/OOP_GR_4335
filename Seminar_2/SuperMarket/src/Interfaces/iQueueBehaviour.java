package Interfaces;

/**
 * Интерфейс, определяющий поведение очереди.
 */
public interface iQueueBehaviour {

    /**
     * Принимает актера в очередь.
     * 
     * @param actor актер, присоединяющийся к очереди
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Освобождает актеров из очереди.
     */
    void releaseFromQueue();

    /**
     * Принимает заказ от актеров в очереди.
     */
    void takeOrder();

    /**
     * Выдает заказ актерам в очереди.
     */
    void giveOrder();
    
}