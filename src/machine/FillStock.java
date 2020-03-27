package machine;

import machine.action.AbstractAction;

import java.util.Scanner;

public class FillStock extends AbstractAction {
    Scanner scanner;

    public FillStock(Stock stock, Scanner scanner) {
        super(stock);
        this.scanner = scanner;
    }

    @Override
    public void execute() {

        System.out.println("Write how many ml of water do you want to add: ");
        stock.changeWaterStock(scanner.nextInt());

        System.out.println("Write how many ml of milk do you want to add: ");
        stock.changeMilkStock(scanner.nextInt());

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        stock.changeCoffeeBeansStock(scanner.nextInt());

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        stock.changeDisposableCupsStock(scanner.nextInt());
    }
}
