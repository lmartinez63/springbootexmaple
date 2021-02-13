package com.example.demo.service;

import com.example.demo.entity.TasaDeIntereses;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TasaDeInteresesServiceImpl implements TasasDeInteresesService{

    public List<TasaDeIntereses> getTasasDeInteres() {
        List<TasaDeIntereses> tasasDeIntereses = new ArrayList<TasaDeIntereses>();
        tasasDeIntereses.add(new TasaDeIntereses(Long.valueOf(1),"A",new BigDecimal(0.18)));
        tasasDeIntereses.add(new TasaDeIntereses(Long.valueOf(2),"B",new BigDecimal(0.17)));
        return tasasDeIntereses;
    }

    public TasaDeIntereses getTasaDeInteresPorCodigo(String code) {
        List<TasaDeIntereses> tasasDeIntereses = new ArrayList<TasaDeIntereses>();
        tasasDeIntereses.add(new TasaDeIntereses(Long.valueOf(1),"A",new BigDecimal(0.18)));
        tasasDeIntereses.add(new TasaDeIntereses(Long.valueOf(2),"B",new BigDecimal(0.17)));
        List<TasaDeIntereses> tasaDeInteres = tasasDeIntereses.stream().filter((tasaDeIntereses -> {
            System.out.println(tasaDeIntereses);
            return tasaDeIntereses.getInteresCode().compareTo(code) == 0;
        })).collect(Collectors.toList());
        return tasaDeInteres.size() > 0 ? tasaDeInteres.get(0) : null;
    }
}
