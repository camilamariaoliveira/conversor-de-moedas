package models;

public class Units {
    private String unitInitial;
    private String unitFinal;

    public Units(String unitInitial, String unitFinal){
        this.unitInitial = unitInitial;
        this.unitFinal = unitFinal;
    }
    public String getUnitInitial(){
        return this.unitInitial;
    }

    public String getUnitFinal(){
        return this.unitFinal;
    }
}
