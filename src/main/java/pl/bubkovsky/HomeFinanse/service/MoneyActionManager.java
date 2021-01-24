package pl.bubkovsky.HomeFinanse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.bubkovsky.HomeFinanse.model.CreateNewMoneyAction;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;
import java.util.List;

@Service
public class MoneyActionManager {
    private MoneyActionRepository moneyActionRepository;

    @Autowired
    public MoneyActionManager(MoneyActionRepository moneyActionRepository) {
        this.moneyActionRepository = moneyActionRepository;
    }

    public List<MoneyAction> getAllActions(){
        return moneyActionRepository.findAll();
    }
    public void saveMoney(CreateNewMoneyAction createNewMoneyAction){
        MoneyAction moneyAction = MoneyActionMapper.map(createNewMoneyAction);
        moneyActionRepository.save(moneyAction);
    }

    public ResponseEntity<Void> delete(Long id) {
        moneyActionRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateMoneyAction(Long id, CreateNewMoneyAction createNewMoneyAction) {
        MoneyAction existingMoneyaction = moneyActionRepository.findById(id).orElseThrow(NoMoneyActionFoundException::new);
        existingMoneyaction.setName(createNewMoneyAction.getName());
        existingMoneyaction.setStatus(createNewMoneyAction.getStatus());
        existingMoneyaction.setAmountOfMoney(createNewMoneyAction.getAmountOfMoney());
        existingMoneyaction.setDate(createNewMoneyAction.getDate());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
