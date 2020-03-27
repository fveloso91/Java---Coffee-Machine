package machine;

import machine.action.ActionsType;
import machine.action.Buy;

import java.util.Scanner;

public class VendingMachine {

    private Stock stock;
    private MoneyCollector moneyCollector;


    public VendingMachine(Stock stock, MoneyCollector moneyCollector) {
        this.stock = stock;
        this.moneyCollector = moneyCollector;
    }
    
    public void init() {
        execute();
    }
    
    public void execute() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");

            switch (ActionsType.valueOf(scanner.next().toUpperCase())) {
                case BUY:
                    new Buy(stock, moneyCollector, scanner).execute();
                    break;
                case FILL:
                    new FillStock(stock, scanner).execute();
                    break;
                case TAKE:
                    new TakeMoney(stock, moneyCollector).execute();
                    break;
                case REMAINING:
                    System.out.println(stock);
                    System.out.println(moneyCollector);
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Unknown Option");
                    break;
            }
        }
    }
}
