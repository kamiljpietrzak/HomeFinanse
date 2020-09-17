package pl.bubkovsky.HomeFinanse.service;

import pl.bubkovsky.HomeFinanse.model.CreateNewMoneyAction;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;

public class MoneyActionMapper {
    public static MoneyAction map(CreateNewMoneyAction createNewMoneyAction) {
        MoneyAction moneyAction = new MoneyAction();
        moneyAction.setActionType(createNewMoneyAction.getActionType());
        moneyAction.setAmountOfMoney(createNewMoneyAction.getAmountOfMoney());
        moneyAction.setName(createNewMoneyAction.getName());
        moneyAction.setDate(createNewMoneyAction.getDate());
        moneyAction.setStatus(createNewMoneyAction.getStatus());
        return moneyAction;
    }
}
