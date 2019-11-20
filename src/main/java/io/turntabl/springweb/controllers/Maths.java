package io.turntabl.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Maths {
    public Integer add(int a, int b){
        return a + b;
    }

    public Integer sub(int a, int b){
        return a - b;
    }

}
