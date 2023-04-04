import java.util.ArrayList;

public enum ConversionOptions {
    BRL_TO_USD("De Reais a Dólar"),
    BRL_TO_EUR("De Reais a Euro"),
    BRL_TO_GBP("De Reais a Libras Esterlinas"),
    BRL_TO_ARS("De Reais a Peso argentino"),
    BRL_TO_CLP("De Reais a Peso Chileno"),
    USD_TO_BRL("De Dólar a Reais"),
    EUR_TO_BRL("De Euro a Reais"),
    GBP_TO_BRL("De Libras Esterlinas a Reais"),
    ARS_TO_BRL("De Peso argentino a  Reais"),
    CLP_TO_BRL("De Peso Chileno a Reais");

    public String label;

   ConversionOptions(String label) {
       this.label = label;
   }

    public static String[] getAllLabels() {
       ArrayList<String> list = new ArrayList<>();
       for (ConversionOptions conversionOption : ConversionOptions.values()) {
            list.add(conversionOption.label);
       }
       return list.toArray(new String[list.size()]);
    }
}
