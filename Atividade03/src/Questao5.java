import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salario;
		int hora1 = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas."));
		int horavalor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora trabalhada."));
		salario = Integer.parseInt(JOptionPane.showInputDialog("O salário do funcionário é:", hora1*horavalor));
	}

}