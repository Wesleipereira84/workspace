import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro n�mero."));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo n�mero."));
		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O n�mero maior �: " + numero1);
		} else if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais:");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero maior �: " + numero2);

		}
	}
}
