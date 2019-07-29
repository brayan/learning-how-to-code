//Aluno: Brayan A. Bedritchuk
//Ciência da Computação
import javax.swing.JOptionPane;
class aula02Ex04{
	public static void main(String [] args){
		int cod, qt; double total = 0;
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
		switch (cod) {
    		case 100: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Cachorros quentes"));
    					total = qt * 1.30;
    					break;
    		case 101: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Baurus Simples"));
    					total = qt * 1.50;
    					break;
    		case 102: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Baurus com ovo"));
    					total = qt * 1.80;
    					break;
    		case 103: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Hamburguers"));
    					total = qt * 2.00;
    					break;
    		case 104: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de X-Salada"));
    					total = qt * 3.00;
    					break;
    		case 105: qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Refrigerantes"));
    					total = qt * 1.75;
    					break;
    		default :	JOptionPane.showMessageDialog(null,"Código Inválido"); 		
    	
    	}
    	if(total != 0)
    		JOptionPane.showMessageDialog(null,"O valor a ser pago é: R$ "+total);
    }
}