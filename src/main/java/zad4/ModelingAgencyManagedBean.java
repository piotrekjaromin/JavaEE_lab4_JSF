package zad4;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotrek on 03.04.16.
 */

@ManagedBean(name="modelingAgencyBean")
@ApplicationScoped
public class ModelingAgencyManagedBean {
    private List<ModelingAgencyData> modelingAgencyDatas = new ArrayList<ModelingAgencyData>();
    private ModelingAgencyData currentModel = new ModelingAgencyData();

    public List<ModelingAgencyData> getModelingAgencyDatas() {
        return modelingAgencyDatas;
    }

    public void setModelingAgencyDatas(List<ModelingAgencyData> modelingAgencyDatas) {
        this.modelingAgencyDatas = modelingAgencyDatas;
    }

    public ModelingAgencyData getCurrentModel() {
        return currentModel;
    }

    public void setCurrentModel(ModelingAgencyData currentModel) {
        this.currentModel = currentModel;
    }

    public String add() {
        modelingAgencyDatas.add(currentModel);
        currentModel = new ModelingAgencyData();
        return "success.xhtml";
    }

    public String nextPage() {

        if(currentModel.getSex().equals("male")) {
            currentModel.setAdditionalData(new AdditionalManData());
            return "maleForm.xhtml";
        }
        else {
            currentModel.setAdditionalData(new AdditionalWomanData());
            return "femaleForm.xhtml";
        }
    }

    public String send() {
        modelingAgencyDatas.add(currentModel);
        currentModel = new ModelingAgencyData();
        return "success.xhtml";
    }
}
