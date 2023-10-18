package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício2 frame = new Exercício2();
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
	public Exercício2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblnome.setBounds(49, 44, 107, 28);
		contentPane.add(lblnome);
		
		JLabel lblsobrenome = new JLabel("Sobrenome");
		lblsobrenome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsobrenome.setBounds(49, 100, 107, 28);
		contentPane.add(lblsobrenome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNome.setBounds(222, 41, 128, 31);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textSobrenome.setBounds(222, 97, 128, 31);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnCombinar = new JButton("Combinar");
		btnCombinar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Combinar os nomes
				String Nome = textNome.getText();
				String Sobrenome = textSobrenome.getText();
				JOptionPane.showMessageDialog(null, "Nome Completo: " + Nome + " " + Sobrenome);
			}
		});
		btnCombinar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCombinar.setBounds(49, 156, 202, 38);
		contentPane.add(btnCombinar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpar os campos de texto
				textNome.setText("");
				textSobrenome.setText("");	
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLimpar.setBounds(261, 156, 89, 38);
		contentPane.add(btnLimpar);
	}

}
