package Lista1;
import javax.swing.JOptionPane; 

public class Exercicio7 {
    public static void main(String[] args) {

        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos"));
        int idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses"));
        int idadeDias =  Integer.parseInt(JOptionPane.showInputDialog("Digite os dias"));
        int idadeTotalDias;

        idadeTotalDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;

        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + idadeTotalDias + " dias");

        /*int idadeDias;
        idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos")) * 365;
        idadeMeses += Integer.parseInt(JOptionPane.showInputDialog("Digite os meses")) * 30;
        while (idadeMeses < 1 || idadeMeses > 12) {
            JOptionPane.showMessageDialog(null, "Meses precisam ser entre 1 e 11");
            idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses")) * 30;
        }
        idadeDias += idadeMeses * 30;
        idadeDias += Integer.parseInt(JOptionPane.showInputDialog("Digite os dias"));

        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + idadeDias + " dias");*/
    }
    
}
