package pl.bubkovsky.HomeFinanse.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class CreateNewMoneyAction {

    ActionType actionType;
    String name;
    Float amountOfMoney;
    Date date;
    Boolean status;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }
    @NotEmpty
    public void setDate(Date date) {
        this.date = date;
    }

    }

