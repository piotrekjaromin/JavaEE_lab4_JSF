package zad4;

/**
 * Created by piotrek on 03.04.16.
 */
public class AdditionalManData implements AdditionalData {
    private int chest;
    private int waist;
    private int legLength;

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getLegLength() {
        return legLength;
    }

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }
}
