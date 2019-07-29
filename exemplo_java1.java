//Entrada de dados pelo JOptionPane
import javax.swing.*;
class exemplo_java1
{
	public static void main(String args[])
	{	
		String nome; 
		nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		JOptionPane.showMessageDialog(null,"O nome digitado foi "+nome);
		JOptionPane.showMessageDialog(null,"by bRayan ;)");
	}
}