package Classes;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс, представляющий магазин.
 */
public class Market implements iMarketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue;
    private static final int MAX_PARTICIPANTS = 10;
    private String logFilePath;                     //Путь к файлу лога

    /**
     * Создает объект магазина с пустой очередью.
     */
    public Market(String logFilePath) {
        this.queue = new ArrayList<iActorBehaviour>();
        this.logFilePath = logFilePath;
    }

    /**
     * Метод для принятия клиента в магазин.
     * 
     * @param actor клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor instanceof PromotionalClient) {
            if (PromotionalClient.getParticipantsCount() > MAX_PARTICIPANTS) {
                System.out.println(actor.getActor().getName() + " не может быть допущен к продаже. Превышено максимальное количество участников.");
                return;
            }
        }

        System.out.println(actor.getActor().getName() + " клиент вышел на рынок ");
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
        String logEntry = actor.getActor().getName() + " клиент добавлен в очередь ";
        saveLogEntry(logEntry);
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
            String logEntry = actor.getName() + " клиент ушел из магазина";
            saveLogEntry(logEntry);
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);

            if (actor instanceof iReturnOrder) {
                String returnLogEntry = ((iReturnOrder) actor).getReturnLogEntry();
                if (returnLogEntry != null) {
                    saveLogEntry(returnLogEntry);
                }
            }
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

       for (iActorBehaviour actor : queue) {
        if (actor instanceof iReturnOrder) {
            iReturnOrder returnOrderClient = (iReturnOrder) actor;
            returnOrderClient.returnOrder();
            returnOrderClient.cancelOrder();

            String returnLogEntry = returnOrderClient.getReturnLogEntry();
            if (returnLogEntry != null) {
                saveLogEntry(returnLogEntry);
            }
        }
    }
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
                String logEntry = actor.getActor().getName() + " клиент получил свой заказ";
                saveLogEntry(logEntry);
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
            String logEntry = actor.getActor().getName() + " клиент получил свой заказ";
            saveLogEntry(logEntry);
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
                String logEntry = actor.getActor().getName() + " клиент сделал заказ";
                saveLogEntry(logEntry);
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }

    private void saveLogEntry(String logEntry) {

        DateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm:ss");
        Date date = new Date();
        String formattedDateTime = DateFormat.format(date);

        String logEntryWithDateTime = formattedDateTime + " - " + logEntry;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            writer.write(logEntryWithDateTime);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении лога: " + e.getMessage());
        }
    }
        
}
