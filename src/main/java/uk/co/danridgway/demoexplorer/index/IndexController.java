package uk.co.danridgway.demoexplorer.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uk.co.danridgway.demoexplorer.utils.ModelUtils;


@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        ModelUtils modelutils = new ModelUtils();
        modelutils.setPage("index");
        modelutils.setModel(model);
        model = modelutils.setupModel();


        // TODO Idea is to have multiple components per page e.g. demodetails/demodetails, demodetails/scoreboardComponent
        return "index/index";
    }

}
