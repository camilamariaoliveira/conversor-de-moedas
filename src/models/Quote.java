package models;

import services.Converter;

import java.util.List;

public class Quote {
    private String unitInitial;
    private String unitFinal;
    private double value;

    public Quote(String unitInitial, String unitFinal, double value) {
        this.unitInitial = unitInitial;
        this.unitFinal = unitFinal;
        this.value = value;
    }

    public String getUnitInitial(){
        return this.unitInitial;
    }

    public String getUnitFinal(){
        return this.unitFinal;
    }

    public double getValue(){
        return this.value;
    }

}
