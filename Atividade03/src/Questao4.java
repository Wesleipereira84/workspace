import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total;
		float txgar;
		txgar = (float) 0.10;
		float conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta."));
		
		total = conta* txgar;
		total = Integer.parseInt(JOptionPane.showInputDialog("O total da conta e:", total+conta));
	}

}
