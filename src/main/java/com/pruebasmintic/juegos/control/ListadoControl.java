package com.pruebasmintic.juegos.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoControl {

    @RequestMapping("/")
    public String listar(){
        
        return"lista";
    }
    
}
