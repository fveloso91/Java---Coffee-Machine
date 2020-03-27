package machine;

public class Stock {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;

    public Stock(int water, int milk, int coffeeBeans, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
    }


    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    public void changeWaterStock(int quantity) {
        this.water += quantity;
    }

    public void changeMilkStock(int quantity) {
        this.milk += quantity;
    }

    public void changeCoffeeBeansStock(int quantity) {
        this.coffeeBeans += quantity;
    }

    public void changeDisposableCupsStock(int quantity) {
        this.disposableCups += quantity;
    }

    @Override
    public String toString() {
        return "\nThe coffee machine has:\n" +
                +getWater() + " of water\n" +
                +getMilk() + " of milk\n" +
                +getCoffeeBeans() + " of coffee beans\n" +
                +getDisposableCups() + " of disposable cups";
    }
}
