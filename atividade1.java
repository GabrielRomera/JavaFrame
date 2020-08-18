package atividades;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class atividade1 extends JFrame {
		private JTextField login;
		private JPasswordField senha;
		private JButton botaoOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividade1 frame = new atividade1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public atividade1() {
		//frame principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		//frame senha
		senha = new JPasswordField();
		senha.setBounds(137, 109, 219, 20);
		painel.add(senha);
		
		//frame confirmar
		botaoOK = new JButton("OK");
		botaoOK.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
			
				//Texto a ser exibido apos clicar OK
				
				if ("admin".equals(login.getText()) && "swordfish".equals(senha.getText()))
				{JOptionPane.showMessageDialog(painel, "Logado com sucesso");}
				
				else {JOptionPane.showMessageDialog(painel, "Login ou senha incorreto");}
					
			}
		});
		
		
		//frame botao OK
		botaoOK.setFont(new Font("Tahoma", Font.BOLD, 11));
		botaoOK.setBounds(175, 227, 89, 23);
		painel.add(botaoOK);
		
		//frame login
		login = new JTextField();
		login.setBounds(137, 65, 219, 20);
		painel.add(login);
		login.setColumns(10);
		
		//frame texto de login
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(81, 65, 46, 18);
		painel.add(lblNewLabel);
		
		//frame texto de senha
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSenha.setBounds(81, 109, 46, 18);
		painel.add(lblSenha);
	}
}
