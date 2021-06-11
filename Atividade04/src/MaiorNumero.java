import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro número."));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número."));
		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O número maior é: " + numero1);
		} else if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "Os números são iguais:");
		} else {
			JOptionPane.showMessageDialog(null, "O número maior é: " + numero2);

		}
	}
}
