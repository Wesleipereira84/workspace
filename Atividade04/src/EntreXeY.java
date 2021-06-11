import javax.swing.JOptionPane;

public class EntreXeY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro número."));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número."));

		String numeros = "";
		for (int i = (numero1+1); i < numero2; i++) {
			numeros = numeros + i + ",";
		}
		JOptionPane.showMessageDialog(null, "Os número entre: " + numero1 + " e " + numero2 + " são:" + numeros);
	}
}
