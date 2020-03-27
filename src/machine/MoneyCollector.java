package machine;

public class MoneyCollector {
    private int money;

    public MoneyCollector(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void changeMoney(int value) {
        this.money += value;
    }

    @Override
    public String toString() {
        return getMoney() + " of money";
    }
}
