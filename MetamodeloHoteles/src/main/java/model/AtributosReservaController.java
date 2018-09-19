package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AtributosReservaController {

    @RequestMapping("/atributosreserva")
    public String index() {
        return "Greetings from AtributosReservaController!";
    }

}
