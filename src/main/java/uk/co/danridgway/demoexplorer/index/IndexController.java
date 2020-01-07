package uk.co.danridgway.demoexplorer.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uk.co.danridgway.demoexplorer.utils.ModelUtils;


@Controller
public class IndexController {

    @GetMapping(value={"/index", "/index.html"})
    public String index(Model model) {
        ModelUtils modelutils = new ModelUtils();
        modelutils.setPage("index");
        modelutils.setComponents(new String[]{"index"});
        modelutils.setModel(model);
        model = modelutils.setupModel();

        String test = "World";
        model.addAttribute("test", test);

        // TODO Idea is to have multiple components per page e.g. demodetails/demodetails, demodetails/scoreboardComponent
        // TODO Pass back the main page which will then include all components.
        // TODO This controller will need to get all the data needed for all components on first load.
        return "index/index";
    }

}
