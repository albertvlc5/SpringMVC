package com.example.springmvc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ControladorInicial {

    @GetMapping("/")
    fun index(model: Model):String {
        model.addAttribute("mensaje", "Hola Mundo");
        return "index"
    }
}