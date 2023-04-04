import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String [] opcoes = new String[]{"Conversor de Moeda","Conversor de temperatura"};
        String inputMenu = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        String inputValue;
        do {
            inputValue = JOptionPane.showInputDialog("Insira o valor:");
            System.out.println(Currency.validate(inputValue));
            if (!Currency.validate(inputValue)){
                JOptionPane.showMessageDialog(null,"Insira apenas números divididos por ponto.");
            }
        }while (!Currency.validate(inputValue));
    }
}