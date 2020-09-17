package pl.bubkovsky.HomeFinanse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class MoneyAction {
    @Id
    @GeneratedValue
    Long id;
    ActionType actionType;
    String name;
    Float amountOfMoney;
    Date date;
    Boolean status;

    public MoneyAction() {
    }

    public MoneyAction(ActionType actionType, String name, Float amountOfMoney, Date date, Boolean status) {
        this.actionType = actionType;
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.date = date;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
