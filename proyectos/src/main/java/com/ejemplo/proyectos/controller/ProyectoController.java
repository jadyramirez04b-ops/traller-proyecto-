package com.ejemplo.proyectos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplo.proyectos.model.Proyecto;

@Controller
@RequestMapping("/proyectos")
public class ProyectoController { 

    private List<Proyecto> lista = new ArrayList<>();

    public ProyectoController() {
        lista.add(new Proyecto(1L, "Sistema de ventas", "Ana, Luis", "5"));
        lista.add(new Proyecto(2L, "App móvil", "Carlos, Maria", "6"));
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("proyectos", lista);
        return "lista";
    }
}
