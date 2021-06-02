import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media;
		float num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1º nota."));
		float num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2º nota."));
		media = num1+ num2;
		media = Integer.parseInt(JOptionPane.showInputDialog("A média das notas e:", media/2));
	}

}