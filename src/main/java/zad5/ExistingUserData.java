package zad5;

/**
 * Created by piotrek on 07.04.16.
 */
public class ExistingUserData implements UserType {
    private String lastShopping;
    private String happyShopping;
    private String happyWorker;
    private String comments;

    public String getLastShopping() {
        return lastShopping;
    }

    public void setLastShopping(String lastShopping) {
        this.lastShopping = lastShopping;
    }

    public String getHappyShopping() {
        return happyShopping;
    }

    public void setHappyShopping(String happyShopping) {
        this.happyShopping = happyShopping;
    }

    public String getHappyWorker() {
        return happyWorker;
    }

    public void setHappyWorker(String happyWorker) {
        this.happyWorker = happyWorker;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
