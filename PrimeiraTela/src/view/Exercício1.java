package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTempF;
	private JButton btnConverter;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício1 frame = new Exercício1();
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
	public Exercício1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Temperatura F°");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setBounds(57, 29, 97, 24);
		contentPane.add(lblTexto);
		
		textTempF = new JTextField();
		textTempF.setBounds(195, 31, 86, 24);
		contentPane.add(textTempF);
		textTempF.setColumns(10);
		
		btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pegar a temperatura digitada no componente de texto
				String tempDigitada = textTempF.getText();
				
				// Converter a temperatura de String pra Float
				float tempConvertidaF = Float.valueOf(tempDigitada);
				
				// Criar o objeto da classe ConversaoTemperatura
				ConversaoTemperatura conv = new ConversaoTemperatura();
				
				// Chamar o método de conversão
				float TempC = conv.convFtoC(tempConvertidaF);
				
				// Mostrar a temperatura convertida
				JOptionPane.showMessageDialog(null, "Temperatura Convertida: " + TempC);
			}
		});
		btnConverter.setBounds(57, 72, 97, 31);
		contentPane.add(btnConverter);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTempF.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLimpar.setBounds(184, 73, 97, 31);
		contentPane.add(btnLimpar);
	}

}
