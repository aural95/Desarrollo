package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtributosFacturaController {

    @RequestMapping("/atributosfactura")
    public String index() {
        return "Greetings from AtributosFacturaController!";
    }

}
