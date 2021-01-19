package com.test.app.calculator;

public class Calculator {

    public Double add(Double x, Double y) {

        if(x == null || y == null){
            if(x == null){
                return y;
            }
            return x;
        }

        return x+y;
    }

    public Double sub(Double x, Double y) {

        if(x == null || y == null){
            if(x == null){
                return -y;
            }
            return x;
        }

        return x-y;
    }

    public Double mul(Double x, Double y) {

        if(x == null || y == null){
            return 0d;
        }

        return x*y;
    }

    public Double div(Double x, Double y) {
        if(null == x || null == y){
            return 0d;
        }
        if(y == 0d){
            return x;
        }

        return x/y;
    }

}
