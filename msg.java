import javax.swing.*;
class msg{
	public static void main(String [] args){
		aviso manda = new aviso();
		JOptionPane.showMessageDialog(null," "+manda.aa);
	}
}
class aviso{
	int aa = 333;
}