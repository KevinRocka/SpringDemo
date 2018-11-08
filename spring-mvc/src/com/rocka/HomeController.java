import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/11/3
 */

@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "yuntao");
        return "hello";
    }
}
