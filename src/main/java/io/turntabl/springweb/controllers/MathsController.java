package io.turntabl.springweb.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathsController {
    @Autowired
    private Maths maths;

    @ApiOperation("Get Index page")
    @GetMapping("/")
    public String indexPage(){
        return "Hello Welcome, to Maths Page\nFill the PARAMS to get results";
    }

    @ApiOperation("Add two numbers")
    @GetMapping("/add")
    public Number addition(@RequestParam(value = "x") String x, @RequestParam(value = "y") String y){
        Integer num1 = Integer.parseInt(x);
        Integer num2 = Integer.parseInt(y);
        return new Number(maths.add(num1, num2));
    }

    @ApiOperation("Subtract two numbers")
    @GetMapping("/subtract")
    public Number subtract(@RequestParam(value = "x") String x, @RequestParam(value = "y") String y){
        Integer num1 = Integer.parseInt(x);
        Integer num2 = Integer.parseInt(y);
        return new Number(maths.sub(num1, num2));
    }


}
