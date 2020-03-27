package machine.recipes;

public class Espresso implements Recipe {

    private final int WATER_NEEDED = 250;
    private final int MILK_NEEDED = 0;
    private final int COFFEE_BEANS_NEEDED = 16;
    private final int PRICE = 4;

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
