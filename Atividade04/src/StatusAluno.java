import javax.swing.JOptionPane;

public class StatusAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota final:"));
		if (nota >=7) {
			JOptionPane.showMessageDialog(null, nome +"  APROVADO!!!" );
		}else if (nota < 4) {
			JOptionPane.showMessageDialog(null, nome +"  REPROVADO !!!", "Alerta" ,0);
		}else 
			JOptionPane.showMessageDialog(null, nome +"  RECUPERAÇÂO !!!", "Alerta" ,0);
		}
	}

