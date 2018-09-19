package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtributosExtraRecController {

    @RequestMapping("/atributosextrarec")
    public String index() {
        return "Greetings from AtributosExtraRecController!";
    }

}
