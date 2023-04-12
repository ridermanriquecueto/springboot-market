package com.rider.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class PruebaController {
    @GetMapping("/hola")
    public String saludar() {
        return "Bienvenidos al Valhalla";
    }
}
