package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício3 frame = new Exercício3();
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
	public Exercício3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBase.setBounds(58, 70, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAltura.setBounds(58, 113, 46, 14);
		contentPane.add(lblAltura);
		
		textBase = new JTextField();
		textBase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textBase.setBounds(169, 68, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textAltura.setBounds(169, 111, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira a Base e a Altura do Retângulo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(46, 22, 223, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Puxar os valores da base e altura
				String Base = textBase.getText();
				String Altura = textAltura.getText();
				Float BaseC = Float.valueOf(Base);
				Float AlturaC = Float.valueOf(Altura);
				
				// Criar e chamar o método pra calcular
				Calculo calc = new Calculo();
				float PerimetroCalculado = calc.calcPerimetro(BaseC, AlturaC);
				float AreaCalculada = calc.calcArea(BaseC, AlturaC);
				
				// Escrever os textos
				JOptionPane.showMessageDialog(null, "Perímetro: " + PerimetroCalculado + "\nÁrea: " + AreaCalculada);
			}
		});
		btnCalcular.setBounds(58, 159, 86, 31);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpar as Áreas
				textBase.setText("");
				textAltura.setText("");
			}
		});
		btnLimpar.setBounds(169, 159, 86, 31);
		contentPane.add(btnLimpar);
	}
}
