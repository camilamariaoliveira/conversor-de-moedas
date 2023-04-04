import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String [] options = new String[]{"Conversor de Moeda","Conversor de temperatura"};
        String inputMenu = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        String inputValue;
        do {
            inputValue = JOptionPane.showInputDialog("Insira o valor:");
            System.out.println(Currency.validate(inputValue));
            if (!Currency.validate(inputValue)){
                JOptionPane.showMessageDialog(null,"Insira apenas números divididos por ponto.");
            }
        }while (!Currency.validate(inputValue));

        String [] conversionOptions = new String[] {
                "De Reais a Dólar",
                "De Reais a Euro",
                "De Reais a Libras Esterlinas",
                "De Reais a Peso argentino",
                "De Reais a Peso Chileno",
                "De Dólar a Reais",
                "De Euro a Reais",
                "De Libras Esterlinas a Reais",
                "De Peso argentino a  Reais",
                "De Peso Chileno a Reais"
        };
        String choosenConversionOption = (String) JOptionPane.showInputDialog(
                null,
                "Para qual moeda você deseja converter o valor informado?",
                "Moedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                conversionOptions,
                conversionOptions[0]
        );
    }
}