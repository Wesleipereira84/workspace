import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int soma;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero."));
		soma = num1+ num2;
		soma = Integer.parseInt(JOptionPane.showInputDialog("O resultado da soma dos numeros digitado e:", soma));
	}

}
