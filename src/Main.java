import models.Currency;
import models.Units;
import services.Converter;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean restartMenu = true;
        do {
            String[] options = new String[]{"Conversor de Moeda", "Conversor de temperatura"};
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
                if (!Currency.validate(inputValue)) {
                    JOptionPane.showMessageDialog(null, "Insira apenas números divididos por ponto.");
                }
            } while (!Currency.validate(inputValue));

            String[] conversionOptions = ConversionOptions.getAllLabels();
            String choosenConversionOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Para qual moeda você deseja converter o valor informado?",
                    "Moedas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    conversionOptions,
                    conversionOptions[0]
            );

            Converter c = new Converter();
            Units units = ConversionOptions.getUnits(choosenConversionOption);
            Currency oldValue = new Currency(Double.valueOf(inputValue), units.getUnitInitial());
            Currency newCurrency = c.convert(oldValue, units.getUnitFinal());
            JOptionPane.showMessageDialog(null, "O valor equivalente a moeda selecionada é " + newCurrency.getValue());

            Integer userDecision = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma opção", JOptionPane.YES_NO_CANCEL_OPTION);
            if (userDecision == 1) {
                restartMenu = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            } else if (userDecision == 2) {
                restartMenu = false;
                JOptionPane.showMessageDialog(null, "Programa concluído");
            }
        } while (restartMenu);
    }
}