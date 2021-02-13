package com.example.demo.controller;

import com.example.demo.entity.TasaDeIntereses;
import com.example.demo.service.TasasDeInteresesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private TasasDeInteresesService tasaDeInteresesService;

    @RequestMapping("/")
    public String home(){
        return "Hello Luis";
    }

    @RequestMapping("/obtenerTasasDeInteres")
    public List<TasaDeIntereses> obtenerTasasDeInteres(){
        return tasaDeInteresesService.getTasasDeInteres();
    }
    //localhost:8081/obtenerTasaDeInteresPorCodigo/
    @GetMapping("/obtenerTasaDeInteresPorCodigo/{codigo}")
    public TasaDeIntereses obtenerTasaDeInteresPorCodigo(@PathVariable String codigo) throws Exception{

        TasaDeIntereses tasaDeInteres = tasaDeInteresesService.getTasaDeInteresPorCodigo(codigo);
        return tasaDeInteres;
    }
}
