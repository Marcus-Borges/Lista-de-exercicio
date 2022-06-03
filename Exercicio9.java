package Lista1;
import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario atual: "));
        double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Percentual de reajuste: "));
        double salarioFinal;

        reajuste = salario * (reajuste/100);
        salarioFinal = salario + reajuste;

        JOptionPane.showMessageDialog(null, "O valor do reajuste é de: " + reajuste + "%." + " O salário final será de: " + salarioFinal);
    }
    
}
