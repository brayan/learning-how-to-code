//perguntar
//Aluno: Brayan A. Bedritchuk
//Ci�ncia da Computa��o
import javax.swing.JOptionPane;
class aula02Ex05{
	public static void main(String [] args){
		double alt, pi; String sexo;
		sexo = JOptionPane.showInputDialog("Digite o sexo (M/F)");
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		if((sexo == "M") || (sexo == "m")){
			pi = (72.7 * alt) - 58;
			JOptionPane.showMessageDialog(null,"O peso ideal �: "+pi);
		}
		else
			if((sexo == "F") || (sexo == "f")){
				pi = (62.1 * alt) - 44.7;
				JOptionPane.showMessageDialog(null,"O peso ideal �: "+pi);
			}
			else
				JOptionPane.showMessageDialog(null,"Informa��o Inv�lida");
				
		
		
	}
}