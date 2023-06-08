import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
        String logFilePath = "./LogFile.log";
        Market market = new Market(logFilePath);
        iActorBehaviour client1 = new OrdinaryClient("Egor");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("President", 1);
        iActorBehaviour client4 = new PromotionalClient("John", "Summer Sale");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());
        market.acceptToMarket(client4);


        market.update();

        if (client4 instanceof iReturnOrder) {
            ((iReturnOrder) client4).returnOrder();
            ((iReturnOrder) client4).cancelOrder();
        }

    }
}
