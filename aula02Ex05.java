//perguntar
//Aluno: Brayan A. Bedritchuk
//Ciência da Computação
import javax.swing.JOptionPane;
class aula02Ex05{
	public static void main(String [] args){
		double alt, pi; String sexo;
		sexo = JOptionPane.showInputDialog("Digite o sexo (M/F)");
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		if((sexo == "M") || (sexo == "m")){
			pi = (72.7 * alt) - 58;
			JOptionPane.showMessageDialog(null,"O peso ideal é: "+pi);
		}
		else
			if((sexo == "F") || (sexo == "f")){
				pi = (62.1 * alt) - 44.7;
				JOptionPane.showMessageDialog(null,"O peso ideal é: "+pi);
			}
			else
				JOptionPane.showMessageDialog(null,"Informação Inválida");
				
		
		
	}
}