package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    
    void setTakeOrder(boolean makeOrder);
    void setMakeOrder(boolean takeOrder);
    boolean isTakeOrder();
    boolean isMakeOrder();
    Actor getActor();
}
