import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media;
		float num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1� nota."));
		float num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2� nota."));
		media = num1+ num2;
		media = Integer.parseInt(JOptionPane.showInputDialog("A m�dia das notas e:", media/2));
	}

}