package Lista1;
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        
        int anos, dias;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        
        dias = anos * 365;

        JOptionPane.showMessageDialog(null, "Você já vivieu: " + dias + " dias. ");
    
    }
    
}
