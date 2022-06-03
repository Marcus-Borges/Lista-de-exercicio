package Lista1;
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double precoUnitarioPeca, quantidadeVendida, comissao;

        precoUnitarioPeca = Double.parseDouble(JOptionPane.showInputDialog("O preço da peça é: "));
        quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de peças: "));

        comissao = (precoUnitarioPeca * quantidadeVendida) * 0.05;

        JOptionPane.showMessageDialog(null, "Comissão = " + comissao);

    }
    
}
