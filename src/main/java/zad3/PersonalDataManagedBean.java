package zad3;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.util.ArrayList;
import java.util.List;


@ManagedBean(name="personalDataBean")
@ApplicationScoped
public class PersonalDataManagedBean {
    private List<PersonalData> personalsData = new ArrayList<PersonalData>();
    private PersonalData personalData = new PersonalData();
    private HtmlCommandButton confirmButton;


    public List<PersonalData> getPersonalsData() {
        return personalsData;
    }

    public void setPersonalsData(List<PersonalData> personalsData) {
        this.personalsData = personalsData;
    }

    public HtmlCommandButton getConfirmButton() {
        return confirmButton;
    }

    public void setConfirmButton(HtmlCommandButton confirmButton) {
        this.confirmButton = confirmButton;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }


    public String add() {
        personalsData.add(personalData);
        personalData = new PersonalData();
        return "success.xhtml";
    }

    public void activateButton(ValueChangeEvent e)
    {
        confirmButton.setDisabled(false);
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }

    public String confirm() {
        return "confirmedData.xhtml";
    }
}
