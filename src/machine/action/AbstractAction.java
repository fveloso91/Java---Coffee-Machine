package machine.action;

import machine.MoneyCollector;
import machine.Stock;

public abstract class AbstractAction {

    protected Stock stock;
    protected MoneyCollector moneyCollector;

    public AbstractAction(Stock stock, MoneyCollector moneyCollector) {
        this.stock = stock;
        this.moneyCollector = moneyCollector;
    }

    public AbstractAction(Stock stock) {
        this.stock = stock;
    }

    public abstract void execute();
}
