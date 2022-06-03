package Lista1;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        
        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));

        area = (base * altura) / 2;

        //System.out.println(area);

        JOptionPane.showMessageDialog(null, "A área do triuângulo é: " + area);
    }
    
}
