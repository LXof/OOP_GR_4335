package Classes;

import Interfaces.iActorBehaviour;

/**
 * Абстрактный класс, представляющий актера.
 * Реализует интерфейс iActorBehaviour.
 */
public abstract class Actor implements iActorBehaviour {
    
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Создает объект актера с заданным именем.
     * 
     * @param name  имя актера
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени актера.
     * 
     * @return  имя актера
     */
    abstract public String getName();
}
