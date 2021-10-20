package za.ca.cput.Controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home()
    {
        return "Hlombekazi Mbelu welcomes you ";
    }
}
