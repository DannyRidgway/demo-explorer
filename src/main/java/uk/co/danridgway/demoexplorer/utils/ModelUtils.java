package uk.co.danridgway.demoexplorer.utils;

import org.springframework.ui.Model;

public class ModelUtils {
    private String page;
    private Model model;
    private String[] components;

    public ModelUtils() {}

    public void setModel(Model modelObj){
        model = modelObj;
    }
    public void setPage(String pageID){
        page = pageID;
    }
    public void setComponents(String[] componentList) {
        components = componentList;
    }

    public Model setupModel(){
        // Add the messages to the model for the page.
        MessageUtils messageutils = new MessageUtils(page);
        //Object messages = messageutils.getMessages();
        //model.addAttribute("messages", messages);
        model.addAttribute("page", page);
        model.addAttribute("components", components);

        return model;
    }
}
