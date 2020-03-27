package machine.action;

import machine.MoneyCollector;
import machine.Stock;
import machine.recipes.Cappuccino;
import machine.recipes.Espresso;
import machine.recipes.Latte;
import machine.recipes.Recipe;

import java.util.Scanner;

public class Buy extends AbstractAction {

    private Scanner scanner;
    private Espresso espresso;
    private Latte latte;
    private Cappuccino cappuccino;

    public Buy(Stock stock, MoneyCollector moneyCollector, Scanner scanner) {
        super(stock, moneyCollector);
        this.scanner = scanner;
        this.espresso = new Espresso();
        this.latte = new Latte();
        this.cappuccino = new Cappuccino();
    }

    @Override
    public void execute() {
        buy();
    }

    private void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        switch (scanner.next()) {
            case "1":
                if(!isPossible(espresso)) {
                    break;
                }
                System.out.println("\nI have enough resources, making you a coffee!");
                buyProduct(espresso);
                break;

            case "2":
                if(!isPossible(latte)) {
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                buyProduct(latte);
                break;

            case "3":
                if(!isPossible(cappuccino)) {
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                buyProduct(cappuccino);
                break;

            default:
                return;

        }
    }


    private boolean isPossible(Recipe recipe) {

        if(stock.getCoffeeBeans() / recipe.getCOFFEE_BEANS_NEEDED() == 0) {
            System.out.println("Sorry, not enough coffee!");
            return false;
        }

        if(recipe.getMILK_NEEDED() > 0 && stock.getMilk() / recipe.getMILK_NEEDED() == 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }

        if(stock.getWater() / recipe.getWATER_NEEDED() == 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        }

        if(stock.getDisposableCups() == 0) {
            System.out.println("Sorry, not enough Disposable Cups!");
            return false;
        }

        return true;
    }

    private void buyProduct(Recipe recipe) {
        stock.changeMilkStock(-recipe.getMILK_NEEDED());
        stock.changeWaterStock(-recipe.getWATER_NEEDED());
        stock.changeCoffeeBeansStock(-recipe.getCOFFEE_BEANS_NEEDED());
        stock.changeDisposableCupsStock(-1);
        moneyCollector.changeMoney(recipe.getPRICE());
    }





}
