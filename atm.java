import javax.swing.JOptionPane;
public class atm{
	public static void main(String [] args){
		String nome, idade, sexo, cidade, estado, pais, endereco, infCadastro;
		int numConta, numSenha, telefone, numCasa;
		JOptionPane.showMessageDialog(null,"Bem vindo ao Caixa Eletrônico ITAU");
		do{
			infCadastro = JOptionPane.showInputDialog("Você já tem cadastro em nosso banco?(Sim/Não)");
			if(infCadastro == "Não")
				JOptionPane.showMessageDialog(null,"Sua resposta não é valida seu babaca");
		}while(infCadastro == "Não");
	}
}
