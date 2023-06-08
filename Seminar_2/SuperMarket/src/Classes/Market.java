package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс, представляющий магазин.
 */
public class Market implements iMarketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue;

    /**
     * Создает объект магазина с пустой очередью.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод дляпринятия клиента в магазин.
     * 
     * @param actor клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод для добавления клиента в очередь.
     * 
     * @param actor клиент
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * Метод для освобождения клиентов из магазина.
     * 
     * @param actors список клиентов
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    /**
     * Метод для обновления состояния магазина.
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    /**
     * Метод для выдачи заказа клиентам.
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    /**
     * Метод для освобождения клиентов из очереди.
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }


    /**
     * Метод для получения заказа от клиетов в очереди.
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
        
}
