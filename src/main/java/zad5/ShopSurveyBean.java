package zad5;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;


@ManagedBean(name="shopSurvey")
@ApplicationScoped

public class ShopSurveyBean {
    private List<SurveyData> surveyDatas = new ArrayList<SurveyData>();
    private SurveyData currentSurvey = new SurveyData();


    public List<SurveyData> getSurveyDatas() {
        return surveyDatas;
    }

    public void setSurveyDatas(List<SurveyData> surveyDatas) {
        this.surveyDatas = surveyDatas;
    }

    public SurveyData getCurrentSurvey() {
        return currentSurvey;
    }

    public void setCurrentSurvey(SurveyData currentSurvey) {
        this.currentSurvey = currentSurvey;
    }


    public String nextPage() {
        if(currentSurvey.getCustomerType().equals("newCustomer")){
            currentSurvey.setUserType(new NewUserData());
            return "secondPageSurveyNewClient.xhtml";
        }
        else {

            currentSurvey.setUserType(new ExistingUserData());
            return "secondPageSurveyExistingClient.xhtml";
        }

    }


    public String firstPage(String type) {
        currentSurvey.setCustomerType(type);
        return "firstPageSurvey.xhtml";
    }

    public String summary() {
        return "summary.xhtml";
    }

    public String send() {
        surveyDatas.add(currentSurvey);
        currentSurvey = new SurveyData();
        return "success.xhtml";
    }
}
