package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtributosRecursoController {

    @RequestMapping("/atributosrecurso")
    public String index() {
        return "Greetings from AtributosRecursoController!";
    }

}
