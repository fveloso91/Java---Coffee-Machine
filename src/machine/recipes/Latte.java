package machine.recipes;

public class Latte implements Recipe {

    private final int WATER_NEEDED = 350;
    private final int MILK_NEEDED = 75;
    private final int COFFEE_BEANS_NEEDED = 20;
    private final int PRICE = 7;

    public int getWATER_NEEDED() {
        return WATER_NEEDED;
    }

    public int getMILK_NEEDED() {
        return MILK_NEEDED;
    }

    public int getCOFFEE_BEANS_NEEDED() {
        return COFFEE_BEANS_NEEDED;
    }

    public int getPRICE() {
        return PRICE;
    }
}
