package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Calculadora;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField textPrimeiroN = new JTextField();
	private final JTextField textSegundoN = new JTextField();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 2, 0, 0));
		
		JLabel lblPrimeiroN = new JLabel("Primeiro Número Inserido:");
		lblPrimeiroN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblPrimeiroN);
		textPrimeiroN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(textPrimeiroN);
		textPrimeiroN.setColumns(10);
		
		JLabel lblSegundoN = new JLabel("Segundo Número Inserido:");
		lblSegundoN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblSegundoN);
		textSegundoN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(textSegundoN);
		textSegundoN.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnAdicao);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnSubtracao);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("x Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnMultiplicacao);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnDivisao);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(127, 11, 75, 15);
		panel_3.add(lblResultado);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String N1dig = textPrimeiroN.getText();
				String N2dig = textSegundoN.getText();
				
				if((N1dig.isEmpty()) || (N2dig.isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				}
				
				Float N1 = Float.valueOf(N1dig);
				Float N2 = Float.valueOf(N2dig);
				
				if(rdbtnAdicao.isSelected()) {
					Calculadora Adicao = new Calculadora();
					Float calcAd = Adicao.calcAdicao(N1, N2);
					String Somados = String.valueOf(calcAd);
					lblResultado.setText(Somados);
				}
				else if(rdbtnSubtracao.isSelected()) {
					Calculadora Subtracao = new Calculadora();
					Float calcSub = Subtracao.calcSubtracao(N1, N2);
					String Subtraidos = String.valueOf(calcSub);
					lblResultado.setText(Subtraidos);
				}
				else if(rdbtnMultiplicacao.isSelected()) {
					Calculadora Multiplicacao = new Calculadora();
					Float calcMul = Multiplicacao.calcMultiplicacao(N1, N2);
					String Multiplicados = String.valueOf(calcMul);
					lblResultado.setText(Multiplicados);
				}
				else if(rdbtnDivisao.isSelected()) {
					Calculadora Divisao = new Calculadora();
					Float calcDiv = Divisao.calcDivisao(N1, N2);
					String Divididos = String.valueOf(calcDiv);
					lblResultado.setText(Divididos);
				}
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(7, 3, 89, 29);
		panel_4.add(btnCalcular);
		
	}

}
