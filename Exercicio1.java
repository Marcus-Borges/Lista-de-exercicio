package Lista1;
import javax.swing.JOptionPane;

public class Exercicio1 {

     public static void main(String[] args){
      // declara variaveis
      String cotacaoTexto, quantidadeTexto; 
      double valorCotacao, quantidadeDolares, valorEmReais;

     //1a etapa: Leitura da cotacao e da quantidade dollar
     // por meio de um quadro realizmos a entrada de dados (classe String)
     // showInputDialog sempre "devolve" uma String (classe)

     cotacaoTexto = JOptionPane.showInputDialog("Digite a cotação"); 
     quantidadeTexto = JOptionPane.showInputDialog("Digite a quantidade"); 
     
     //2a etapa: converter de dollar para real
     //converte texto em numero
     valorCotacao = Double.parseDouble(cotacaoTexto); 
     quantidadeDolares = Double.parseDouble(quantidadeTexto);

     // parseDouble funciona como um coversor, transformando o String (classe) em um valor numérico double (variável)

     valorEmReais = valorCotacao * quantidadeDolares; //processamento
     
     // saída
     //3a etapa: mostra o resultado da conversao
     System.out.println(valorEmReais);
  }
}
