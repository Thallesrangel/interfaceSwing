package View;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

		//Intância dos objetos
	    JTextField txtNome = new JTextField(null,15);
	    JPasswordField txtSenha = new JPasswordField(null,15);
		JButton btnLogin = new JButton("Entrar");
		JButton btnInfo = new JButton();
		JButton btnSuport = new JButton();
		JLabel lblLogo = new JLabel();
		JLabel lblUsuario = new JLabel();
		JLabel lblSenha = new JLabel();

		
		public void iconLogoPrograma(){
			setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/logicon.png")));
		}
		public JButton getbtnInfo() {
			return btnLogin;
			}
	 
		
	public TelaLogin() {
	
		iconLogoPrograma();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(new java.awt.Color(255,255,255));
		//Configuração de tamanhos dos componentes LABEL
	
		lblLogo.setIcon(new ImageIcon(Class.class.getResource("/Img/postoicon.png")));
		lblLogo.setBounds(100, 5, 50, 50);


		lblUsuario.setIcon(new ImageIcon(Class.class.getResource("/Img/usuarioicon.png")));
		lblUsuario.setBounds(30, 70, 32, 32);
		
		lblSenha.setIcon(new ImageIcon(Class.class.getResource("/Img/passicon.png")));
		lblSenha.setBounds(30, 120, 32, 32);

		btnInfo.setIcon(new ImageIcon(Class.class.getResource("/Img/infoicon.png")));
		btnInfo.setBounds(15, 180, 32, 32);
		
		btnSuport.setIcon(new ImageIcon(Class.class.getResource("/Img/suporticon.png")));
		btnSuport.setBounds(50, 180, 32, 32);
		btnSuport.setEnabled(false); 
		
		//Configuração de tamanhos dos componentes INPUT
		txtNome.setBounds(70,75,120,25);
		
		txtSenha.setBounds(70,125,120,25);
		
		//Configuração de tamanhos dos componentes BUTTON
		btnLogin.setBounds(95, 180, 70, 30);//Define o tamanho e posição do btnLogin
			
		//Configuração da página
		setLayout(null);
		setSize(250,260); //x y
		setTitle("SISVEL");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//Adiciona a TelaLogin()
		add(btnInfo);
		add(txtSenha);
		add(lblLogo);
		add(btnLogin);
		add(btnSuport);
		add(txtNome);
		add(lblUsuario);
		add(lblSenha);	

		
		//Começo da ação do btnLogin ao ser clicado
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			       //eventos
			}          
	      });
		//Fim da ação do btnLogin ao ser clicado
		
		//Começo da ação do btnInfo ao ser clicado
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				  
			       //eventos
			}  });
		//Fim da ação do btnInfo ao ser clicado

	}	
}