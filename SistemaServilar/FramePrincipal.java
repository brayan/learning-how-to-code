import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FramePrincipal extends JFrame {
	
	private JMenuBar barraMenu = new JMenuBar();
	
	private JMenu mCadastros = new JMenu("Cadastros");
	private JMenu mConsultas = new JMenu("Consultas");
	
	private JMenuItem miProdutos = new JMenuItem("Produtos");
	private JMenuItem miPrecos = new JMenuItem("Preços");
	
	public FramePrincipal()	{
		
		temaNinbus();
		
		configuracoesFrame();
		configuracoesMenu();
		JOptionPane.showMessageDialog(null, "Testeeeeeeee");
		
		setVisible(true);
	}
	
	public void configuracoesFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setSize(800, 600);
		setTitle("Sistema Servilar");
		
	}
	
	public void configuracoesMenu() {
		
		setJMenuBar(barraMenu);
		
		barraMenu.add(mCadastros);
		barraMenu.add(mConsultas);
	}
	
	public void configuracoesCores() {
		
	}
	
	public void configuracoesFontes() {
		
	}
	
	public void temaNinbus() {
		 
		 try {
            
            	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            	SwingUtilities.updateComponentTreeUI(this);
         
         } catch (Exception e) {
            e.printStackTrace();
        }
	}
}