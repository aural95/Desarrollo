package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExtraRecursoController {

    @RequestMapping("/extrarecurso")
    public String index() {
        return "Greetings from ExtraRecursoController!";
    }

}
