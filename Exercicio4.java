package Lista1;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        
    String a = " ";
    int num = 0;
    int antecessor = 0;
    String saida = " ";
    
    a = JOptionPane.showInputDialog("Entre com o número: ");
    num = Integer.parseInt(a); /*após digitar o valor através do JOptionPane, obtemos uma String (classe), a qual, através do conversor
   Integer.parseInt (conversor), transformando o valor de "a" em um valor numérico int (variável) */
    
    antecessor = num -1;
       
    saida = " O antecessor de " + num + " é " + antecessor;
        
    JOptionPane.showMessageDialog(null,saida);
    
    }
}

