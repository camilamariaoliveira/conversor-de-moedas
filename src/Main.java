import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] opcoes = new String[]{"Conversor de Moeda","Conversor de temperatura"};
        String input = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
    }
}