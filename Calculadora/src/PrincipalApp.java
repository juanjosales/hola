import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class PrincipalApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel pantalla;
	private int operando=0;
	private double numero1=0, numero2=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalApp frame = new PrincipalApp();
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
	public PrincipalApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("1");
			}
		});
		btnNewButton.setBounds(29, 124, 47, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("5");

			}
		});
		btnNewButton_1.setBounds(86, 164, 47, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("2");

			}
		});
		btnNewButton_2.setBounds(86, 124, 47, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("6");

			}
		});
		btnNewButton_3.setBounds(143, 164, 47, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("3");

			}
		});
		btnNewButton_4.setBounds(143, 124, 47, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("7");

			}
		});
		btnNewButton_5.setBounds(29, 210, 47, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("9");

			}
		});
		btnNewButton_6.setBounds(143, 210, 47, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("8");

			}
		});
		btnNewButton_7.setBounds(86, 210, 47, 29);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("4");

			}
		});
		btnNewButton_8.setBounds(29, 164, 47, 29);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_6_1 = new JButton("=");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(pantalla.getText());
			
				switch(operando) {
				case 1:
					pantalla.setText(String.valueOf(sumar(numero1,numero2)));
					
					break;
				case 2:
					pantalla.setText(String.valueOf(restar(numero1,numero2)));
					
					break;
				case 3:
					pantalla.setText(String.valueOf(multiplicar(numero1,numero2)));
					
					break;
				case 4:
					pantalla.setText(String.valueOf(dividir(numero1,numero2)));
					
					break;
				}
			}
		});
		btnNewButton_6_1.setBounds(143, 250, 47, 29);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton(".");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pantalla.getText().length()<1) {
					escribirNumero("0.");

				}else {
					escribirNumero(".");
				}			}
		});
		btnNewButton_6_2.setBounds(86, 250, 47, 29);
		contentPane.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("0");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribirNumero("0.");
			}
		});
		btnNewButton_6_3.setBounds(29, 250, 47, 29);
		contentPane.add(btnNewButton_6_3);
		
		JButton btnNewButton_6_4 = new JButton("/");
		btnNewButton_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(pantalla.getText());
				pantalla.setText("");
				operando = 4;
			}
		});
		btnNewButton_6_4.setBounds(200, 124, 47, 29);
		contentPane.add(btnNewButton_6_4);
		
		JButton btnNewButton_6_5 = new JButton("*");
		btnNewButton_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(pantalla.getText());
				pantalla.setText("");
				operando = 3;
			}
		});
		btnNewButton_6_5.setBounds(200, 164, 47, 29);
		contentPane.add(btnNewButton_6_5);
		
		JButton btnNewButton_6_6 = new JButton("+");
		btnNewButton_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(pantalla.getText());
				pantalla.setText("");
				operando = 1;
				
			}
		});
		btnNewButton_6_6.setBounds(200, 210, 47, 29);
		contentPane.add(btnNewButton_6_6);
		
		JButton btnNewButton_6_7 = new JButton("-");
		btnNewButton_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(pantalla.getText());
				pantalla.setText("");
				operando = 2;
			}
		});
		btnNewButton_6_7.setBounds(200, 250, 47, 29);
		contentPane.add(btnNewButton_6_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(32, 87, 140, 29);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pantalla = new JLabel("");
		pantalla.setBackground(Color.WHITE);
		pantalla.setBounds(0, 0, 140, 29);
		panel.add(pantalla);
		
		JButton btnNewButton_4_1 = new JButton("Borrar");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(" ");
			}
		});
		btnNewButton_4_1.setBounds(182, 87, 65, 29);
		contentPane.add(btnNewButton_4_1);
	}
	
	public void escribirNumero ( String nm) {
		pantalla.setText(pantalla.getText()+nm);
	}
	public double sumar ( double n1, double n2) {
		double resultado = 0;
		resultado = n1 + n2;
		
		return  resultado;
	}
	public double restar ( double n1, double n2) {
		double resultado = 0;
		resultado = n1 - n2;
		
		return  resultado;
	}
	public double multiplicar ( double n1, double n2) {
		double resultado = 0;
		resultado = n1 * n2;
		
		return  resultado;
	}
	public double dividir ( double n1, double n2) {
		double resultado = 0;
		resultado = n1 / n2;
		
		return  resultado;
	}
}
