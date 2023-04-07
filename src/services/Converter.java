package services;
import models.Money;
import models.Quote;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private List<Quote> quoteList;
    public Converter(){
        quoteList = new ArrayList<>();
        quoteList.add(new Quote("BRL","USD",0.20));
        quoteList.add(new Quote("BRL","EUR",0.18));
        quoteList.add(new Quote("BRL","GBP",0.16));
        quoteList.add(new Quote("BRL","ARS",41.76));
        quoteList.add(new Quote("BRL","CLP",160.63));
        quoteList.add(new Quote("USD","BRL",5.06));
        quoteList.add(new Quote("EUR","BRL",5.51));
        quoteList.add(new Quote("GBP","BRL",6.30));
        quoteList.add(new Quote("ARS","BRL",0.024));
        quoteList.add(new Quote("CLP","BRL",0.0062));
    }

    public double getQuote (String unitInitial, String unitFinal){
        for (Quote quote: quoteList) {
            if (unitInitial.equals(quote.getUnitInitial()) && unitFinal.equals(quote.getUnitFinal())){
                return quote.getValue();
            }
        }
        return -1;
    }

    public Money convert (Money oldCurrency, String unit){
        double quote = getQuote(oldCurrency.getUnit(), unit);
        return new Money((quote*oldCurrency.getValue()), unit);
    }
}
