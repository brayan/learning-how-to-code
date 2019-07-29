import javax.swing.JOptionPane;
class cadastro{
	public static void main(String [] args){
		cliente cad = new cliente();
		cad.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
		cad.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente"));
		cad.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do cliente"));
		JOptionPane.showMessageDialog(null,"Nome: "+cad.nome+"\nIdade: "+cad.idade+"\nSalário: "+cad.salario);
	}
}
class cliente{
	String nome;
	int idade;
	float salario;
}