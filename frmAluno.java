package pjAula3;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmAluno extends JFrame {
	
	JButton btCadastrar, btLimpar;
	JTextField txtNome, txtTeleFone;
	JLabel lbNome, lbTeleFone;
	
	public frmAluno() {
		super ("Exemplo");
		setSize (300, 300);
		setLayout(new FlowLayout());
			
		
		btCadastrar = new JButton("Cadastrar " );
		btLimpar = new JButton ("Limpar");
		txtNome = new JTextField(20);
		txtTeleFone = new JTextField(20);
		lbNome = new JLabel("Nome");
		lbTeleFone = new JLabel ("TeleFone");
		
		add (txtNome);
		add (btCadastrar);
		add (btLimpar);
		add (txtTeleFone);
		add (lbNome);
		add (lbTeleFone);
			
		setVisible (true);
	}
	public static void main(String[] args) {
		frmAluno form = new frmAluno();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
