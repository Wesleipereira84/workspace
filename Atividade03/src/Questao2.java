import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int soma;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número."));
		soma = num1+ num2;
		soma = Integer.parseInt(JOptionPane.showInputDialog("O resultado da soma dos numeros digitado e:", soma));
	}

}
