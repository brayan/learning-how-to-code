import javax.swing.JOptionPane;
public class nome{
	public static void main(String [] args){
		String nome;
		nome = JOptionPane.showInputDialog("Digite o nome");
		if(nome == Brayan)
			JOptionPane.showMessageDialog(null,"O nome � Brayan");
		else
			JOptionPane.showMessageDialog(null,"O nome n�o � Brayan");
	}
}