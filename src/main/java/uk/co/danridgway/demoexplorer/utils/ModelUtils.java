package uk.co.danridgway.demoexplorer.utils;

import org.springframework.ui.Model;

public class ModelUtils {
    private String page;
    private Model model;

    public ModelUtils() {}

    public void setModel(Model modelObj){
        model = modelObj;
    }

    public void setPage(String pageID){
        page = pageID;
    }

    public Model setupModel(){
        return model;
    }

}
