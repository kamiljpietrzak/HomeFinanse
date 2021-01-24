package pl.bubkovsky.HomeFinanse.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class CreateNewMoneyAction {

    String name;
    Float amountOfMoney;
    Date date;
    Boolean status;
    String info;


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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    }

