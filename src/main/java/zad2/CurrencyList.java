package zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by piotrek on 02.04.16.
 */
public class CurrencyList {
    private List<String> currencyList = new ArrayList<String>();
    private Map<String, Double> currencyWithValue = new HashMap<String, Double>();


    public CurrencyList() {
        currencyList.add("PLN");
        currencyList.add("EUR");
    }

    public List<String> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<String> currencyList) {
        this.currencyList = currencyList;
    }

    public Map<String, Double> getCurrencyWithValue() {
        return currencyWithValue;
    }

    public void setCurrencyWithValue(Map<String, Double> currencyWithValue) {
        this.currencyWithValue = currencyWithValue;
    }

    public boolean addCurrency(String currency) {
        if(!currencyList.contains(currency)){
            currencyList.add(currency);
            return true;
        }
        return false;
    }

    public void addCurrencyWithValue(String currency) {
        if(!currencyWithValue.containsKey(currency)){
            currencyWithValue.put(currency, (Double)Math.random()*100+1);
        }

    }
}
