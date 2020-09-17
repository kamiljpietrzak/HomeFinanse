package pl.bubkovsky.HomeFinanse.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.bubkovsky.HomeFinanse.model.CreateNewMoneyAction;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;

import java.util.List;

public class MoneyActionManager {
    private MoneyActionRepository moneyActionRepository;
    @Autowired
    public MoneyActionManager(MoneyActionRepository moneyActionRepository) {
        this.moneyActionRepository = moneyActionRepository;
    }

    public List getAllActions(){
        return moneyActionRepository.findAll();
    }
    public void saveMoney(CreateNewMoneyAction createNewMoneyAction){
        MoneyAction moneyAction = MoneyActionMapper.map(createNewMoneyAction);
        moneyActionRepository.save(moneyAction);
    }
}
