package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ReservaController {

    @RequestMapping("/reserva")
    public String index() {
        return "Greetings from ReservaController!";
    }

}
