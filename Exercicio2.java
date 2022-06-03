package Lista1;
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String[] args) {
        //1º 4 numeros
        // Atribuir valor a variável
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));
        double q1, q2, q3, q4, soma;


        //2º calcular o quadrado para cada uma das variáveis
        q1 = n1*n1;
        q2 = n2*n2;
        q3 = n3*n3;
        q4 = n4*n4;

        //3º somar todos os quadrados
        
        soma = q1 + q2 + q3 + q4;

        //4º mostrar o resultado
        
        //System.out.println(soma);

        JOptionPane.showMessageDialog(null, "A soma é igual a " + soma);
    }

}
