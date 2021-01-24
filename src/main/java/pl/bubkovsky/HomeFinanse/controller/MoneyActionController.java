package pl.bubkovsky.HomeFinanse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.bubkovsky.HomeFinanse.model.CreateNewMoneyAction;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;
import pl.bubkovsky.HomeFinanse.service.MoneyActionManager;
import pl.bubkovsky.HomeFinanse.service.MoneyActionMapper;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/money")
public class MoneyActionController {
    private MoneyActionManager moneyActionManager;

    @Autowired
    public MoneyActionController(MoneyActionManager moneyActionManager) {
        this.moneyActionManager = moneyActionManager;
    }

    @GetMapping
    public List<MoneyAction> getAllMoneyActions() {
        return moneyActionManager.getAllActions();
    }
    

    @PostMapping
    public ResponseEntity<Void> addMoney(@RequestBody @Valid CreateNewMoneyAction createNewMoneyAction) {
        moneyActionManager.saveMoney(createNewMoneyAction);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoneyAction(@PathVariable Long id) {
        moneyActionManager.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> editMoneyAction(@PathVariable Long id,@RequestBody CreateNewMoneyAction createNewMoneyAction){
        moneyActionManager.updateMoneyAction(id, createNewMoneyAction);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}