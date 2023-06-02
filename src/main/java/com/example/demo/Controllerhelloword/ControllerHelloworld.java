package com.example.demo.Controllerhelloword;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloworld {
    @GetMapping("/")
    public String holaMundo() {
        return "Hola mundo desde la segunda instancia";
    }
}



