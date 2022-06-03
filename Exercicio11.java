package Lista1;
import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        
        int salarioFixo = Integer.parseInt(JOptionPane.showInputDialog("Salário do vendedor: R$ "));
        int numeroCarrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Número de carros vendidos: "));
        double valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("O valor total de vendas é: R$ "));
        int comissao = 1000 * numeroCarrosVendidos;
        double bonus = valorTotalVendas * 0.05;
        double salarioFinal;

        salarioFinal = salarioFixo + comissao + bonus;

        System.out.println("O salário final do vendedor será de: R$ " + salarioFinal);

        JOptionPane.showMessageDialog(null, "O salário final do vendedor será de: R$ " + salarioFinal);

        /*int numeroCarros = Integer.parseInt(JOptionPane.showInputDialog("digite o número de carros vendidos"));
        int salarioFixo = Integer.parseInt(JOptionPane.showInputDialog("digite o salário fixo"));
        double valorTotalVendas= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de vendas"));
        int valorPorCarroVend =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por carro vendido"));
        double valorCincoPorcento = valorTotalVendas *0.05;
        double total;
        total =salarioFixo+ (numeroCarros*valorPorCarroVend)+ valorCincoPorcento;
        JOptionPane.showMessageDialog(null,"O salário total é: " + total);*/

    }
    
}
