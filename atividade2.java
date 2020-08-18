package atividades;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class atividade2 extends JFrame {
		private JTextField valorA;
		private JTextField valorB;
		private JButton botao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividade2 frame = new atividade2();
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
	public atividade2() {
		
		//frame principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		//frame valor A
				valorA = new JTextField();
				valorA.setBounds(137, 65, 219, 20);
				painel.add(valorA);
				valorA.setColumns(10);
		
		//frame valor B
		valorB = new JTextField();
		valorB.setBounds(137, 109, 219, 20);
		painel.add(valorB);
		
		//frame confirmar / mostrar os numeros
		botao = new JButton("Mostrar N\u00FAmeros");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				//Texto a ser exibido apos clicar OK
				String txt1 = valorA.getText();
		        String txt2 = valorB.getText();
		        int i = Integer.parseInt(txt1);
		        int j = Integer.parseInt(txt2);
		        String value = "";
		        
		        for(int x = i; x <= j; x++){
		            if (x > i && x < j){
		                value =  value + ", " +x ;
		                
		            }
		            
		        }
		        JOptionPane.showMessageDialog(painel,"Valores entre "+ i + " e " + j +":" + value);
					
			}
		});
		
		
		//frame botao OK
		botao.setFont(new Font("Tahoma", Font.BOLD, 11));
		botao.setBounds(137, 227, 143, 23);
		painel.add(botao);
		
		
		//frame texto de login
		JLabel txtA = new JLabel("A:");
		txtA.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtA.setBounds(106, 65, 21, 18);
		painel.add(txtA);
		
		//frame texto de senha
		JLabel txtB = new JLabel("B:");
		txtB.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtB.setBounds(106, 109, 21, 18);
		painel.add(txtB);
	}
}
