package pl.bubkovsky.HomeFinanse.service;

import org.springframework.stereotype.Service;
import pl.bubkovsky.HomeFinanse.model.CreateNewMoneyAction;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;
@Service
public class MoneyActionMapper {
    public static MoneyAction map(CreateNewMoneyAction createNewMoneyAction) {
        MoneyAction moneyAction = new MoneyAction();
        moneyAction.setAmountOfMoney(createNewMoneyAction.getAmountOfMoney());
        moneyAction.setName(createNewMoneyAction.getName());
        moneyAction.setDate(createNewMoneyAction.getDate());
        moneyAction.setStatus(createNewMoneyAction.getStatus());
        moneyAction.setInfo(createNewMoneyAction.getInfo());
        return moneyAction;
    }
}
