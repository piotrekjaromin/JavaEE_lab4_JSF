package zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by piotrek on 02.04.16.
 */
public class CurrencyList {
    private Map<String, Double> currencyWithValue;

    public CurrencyList() {
        currencyWithValue=new HashMap<String, Double>();
        currencyWithValue.put("PLN", 1.0);
        currencyWithValue.put("EUR", Double.parseDouble(NBPConnector.exchangeRate("EUR").replaceAll(",", ".")));
    }
    public Map<String, Double> getCurrencyWithValue() {
        return currencyWithValue;
    }

    public void setCurrencyWithValue(Map<String, Double> currencyWithValue) {
        this.currencyWithValue = currencyWithValue;
    }


    public boolean addCurrencyWithValue(String currency) {
        if(!currencyWithValue.containsKey(currency)){
            currencyWithValue.put(currency, Double.parseDouble(NBPConnector.exchangeRate(currency).replaceAll(",", ".")));
            return true;
        }
        return false;
    }
}
