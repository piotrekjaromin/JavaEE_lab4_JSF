package zad5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotrek on 05.04.16.
 */
public class NewUserData implements UserType {
    private String monthlyCost;
    private List<String> generallyShopping = new ArrayList<String>();
    private String howOften;
    private String color;
    private List<String> clothesMostlyBuying;

    public String getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(String monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public List<String> getGenerallyShopping() {
        return generallyShopping;
    }

    public void setGenerallyShopping(List<String> generallyShopping) {
        this.generallyShopping = generallyShopping;
    }

    public String getHowOften() {
        return howOften;
    }

    public void setHowOften(String howOften) {
        this.howOften = howOften;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getClothesMostlyBuying() {
        return clothesMostlyBuying;
    }

    public void setClothesMostlyBuying(List<String> clothesMostlyBuying) {
        this.clothesMostlyBuying = clothesMostlyBuying;
    }
}
