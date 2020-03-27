package machine.recipes;

public class Cappuccino implements Recipe {

    private final int WATER_NEEDED = 200;
    private final int MILK_NEEDED = 100;
    private final int COFFEE_BEANS_NEEDED = 12;
    private final int PRICE = 6;

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
