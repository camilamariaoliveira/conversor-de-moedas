import models.Units;
import java.util.ArrayList;

public enum ConversionOptions {
    BRL_TO_USD("De Reais a Dólar","BRL","USD"),
    BRL_TO_EUR("De Reais a Euro", "BRL", "EUR"),
    BRL_TO_GBP("De Reais a Libras Esterlinas","BRL","GBP"),
    BRL_TO_ARS("De Reais a Peso argentino","BRL","ARS"),
    BRL_TO_CLP("De Reais a Peso Chileno","BRL","CLP"),
    USD_TO_BRL("De Dólar a Reais","USD","BRL"),
    EUR_TO_BRL("De Euro a Reais","EUR","BRL"),
    GBP_TO_BRL("De Libras Esterlinas a Reais","GBP","BRL"),
    ARS_TO_BRL("De Peso argentino a  Reais","ARS","BRL"),
    CLP_TO_BRL("De Peso Chileno a Reais","CLP","BRL");

    public String label;
    public String unitInitial;
    public String unitFinal;

   ConversionOptions(String label, String unitInitial, String unitFinal) {
       this.label = label;
       this.unitInitial = unitInitial;
       this.unitFinal = unitFinal;
   }

    public static Units getUnits(String choosenOption){
        for (ConversionOptions option : ConversionOptions.values()) {
            if (choosenOption.equals(option.label)){
               return new Units(option.unitInitial, option.unitFinal);
            }
        }
        return null;
    }

    public static String[] getAllLabels() {
       ArrayList<String> labelList = new ArrayList<>();
       for (ConversionOptions conversionOption : ConversionOptions.values()) {
            labelList.add(conversionOption.label);
       }
       return labelList.toArray(new String[labelList.size()]);
    }
}
