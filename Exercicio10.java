package Lista1;
import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        double custoCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro: "));
        double porcentagemDistribuidor = custoCarro * 0.28;
        double impostos = custoCarro * 0.45;
        double valorCarro;

        valorCarro = custoCarro + impostos + porcentagemDistribuidor;

        JOptionPane.showMessageDialog(null, "O custo de fábrica do carro é: R$ " + custoCarro + " O custo final ao consumidor é: R$ " + valorCarro);
        

    }
    
}
