package zad1;

import com.tyrsoft.kursynbp.net.NBPConnector;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name="generateNumber")
@RequestScoped
public class GenerateNumber implements Serializable {
    static int losuj=(int)(Math.random()*5+1);

public String check(int number){
    if(losuj==number){
        losuj = (int)(NBPConnector.excha);
        return "trafiony.xhtml";
    } else
        return number + ".xhtml";
}
}
