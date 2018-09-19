package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RecursoController {

    @RequestMapping("/recurso")
    public String index() {
        return "Greetings from RecursoController!";
    }

}
