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

        String [] conversionOptions = ConversionOptions.getAllLabels();
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