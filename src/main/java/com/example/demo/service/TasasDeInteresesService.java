package com.example.demo.service;

import com.example.demo.entity.TasaDeIntereses;

import java.util.List;

public interface TasasDeInteresesService {
    public List<TasaDeIntereses> getTasasDeInteres();
    public TasaDeIntereses getTasaDeInteresPorCodigo(String code);
}
