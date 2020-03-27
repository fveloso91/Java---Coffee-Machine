package machine;

public class CoffeeMachine {
    public static void main(String[] args) {

        Stock stock = new Stock(400, 540, 120, 9);
        MoneyCollector moneyCollector = new MoneyCollector(550);

        new VendingMachine(stock, moneyCollector).init();

    }
}
