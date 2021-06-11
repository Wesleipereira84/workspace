import javax.swing.JOptionPane;
public class PalavraDeAcesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra = JOptionPane.showInputDialog(null, "Digite a palavra de acesso: ");
		String mensagem = "";
		 if (palavra.equals("Java-2021")) {
			mensagem = "Permissão Aprovada";
		}  else{
			for (int i = 1; i <= 5; i++) {
			JOptionPane.showInputDialog(null, "Tente novamente "+ i +" tentativas");
			}
		}
		 if(!mensagem.isEmpty()) {
			 JOptionPane.showMessageDialog(null, mensagem);
		 }else {
			 mensagem = "Permissão Negada";
			 JOptionPane.showMessageDialog(null, mensagem);
		 }
	
	}

}
