package zad2;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;


@ManagedBean(name="currencyConverter")
@ApplicationScoped
public class CurrencyConverter {
    private Double amount;
    private String currencyFrom;
    private String currencyTo;
    private CurrencyList currencyList = new CurrencyList();
    private String currencyToAdd;
    private Double result;



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public String getCurrencyToAdd() {
        return currencyToAdd;
    }

    public void setCurrencyToAdd(String currencyToAdd) {
        this.currencyToAdd = currencyToAdd;
    }

    public Double getResult() {
        return result;
    }

    public CurrencyList getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(CurrencyList currencyList) {
        this.currencyList = currencyList;
    }

    public String addCurrency() {
        if(currencyList.addCurrencyWithValue(currencyToAdd))
            return "success.xhtml";
        else
            return "failure.xhtml";
    }

    public String convert() {
        result = amount * (currencyList.getCurrencyWithValue().get(currencyFrom) / currencyList.getCurrencyWithValue().get(currencyTo));
        return "result.xhtml";
    }
}