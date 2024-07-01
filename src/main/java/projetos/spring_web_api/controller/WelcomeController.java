package projetos.spring_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(value = "/welcome")
    public String welcome(){
     return "Welcome to a my Spring Web REST API";

    }
}
