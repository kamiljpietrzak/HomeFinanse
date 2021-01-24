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
    String name;
    Float amountOfMoney;
    Date date;
    Boolean status;
    String info;

    public MoneyAction() {
    }

    public MoneyAction(String name, Float amountOfMoney, Date date, Boolean status, String info) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.date = date;
        this.status = status;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
