import javax.swing.JOptionPane;
public class atm{
	public static void main(String [] args){
		String nome, idade, sexo, cidade, estado, pais, endereco, infCadastro;
		int numConta, numSenha, telefone, numCasa;
		JOptionPane.showMessageDialog(null,"Bem vindo ao Caixa Eletr�nico ITAU");
		do{
			infCadastro = JOptionPane.showInputDialog("Voc� j� tem cadastro em nosso banco?(Sim/N�o)");
			if(infCadastro == "N�o")
				JOptionPane.showMessageDialog(null,"Sua resposta n�o � valida seu babaca");
		}while(infCadastro == "N�o");
	}
}
