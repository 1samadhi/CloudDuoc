package cl.duoc.cloud.clouduoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1Controller {

    @GetMapping
    public String holaMundo() {
        return "Hola mundo v1.0.0";
    }

    @PostMapping("/despedida")
    public String despedida() {
        return "despedida v1.1.0";
    }
}
