package machine;

import machine.action.AbstractAction;

public class TakeMoney extends AbstractAction {

    public TakeMoney(Stock stock, MoneyCollector moneyCollector) {
        super(stock, moneyCollector);
    }

    @Override
    public void execute() {

        int gaveMoney = moneyCollector.getMoney();

        moneyCollector.changeMoney(-gaveMoney);

        System.out.println("I gave you $" + gaveMoney);
    }

}
