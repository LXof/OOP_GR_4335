package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение рынка.
 */
public interface iMarketBehaviour {
    
    /**
     * Принимает актера на рынок.
     * 
     * @param actor актер, присоединяющийся к рынку
     */
    void acceptToMarket(iActorBehaviour actor);
    
    /**
     * Отображает актеров от рынка.
     * 
     * @param actors    список актеров, покидающий рынок
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Обновляет состояние рынка.
     */
    void update();
}
