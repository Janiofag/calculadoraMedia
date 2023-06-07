import javax.swing.JOptionPane;

public class CalculadoraMedia2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a nota da prova 1:");
        double notaProva1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite a nota da prova 2:");
        double notaProva2 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double notaTrabalho = Double.parseDouble(input);

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        String resultado;
        if (media >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nResultado: " + resultado);

    }
}

