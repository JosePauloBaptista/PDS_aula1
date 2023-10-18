package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValorKg;
	private JTextField textPesoPrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício5 frame = new Exercício5();
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
	public Exercício5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FOMELÂNDIA");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 28));
		lblNewLabel.setBounds(84, 11, 169, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorKg = new JLabel("Valor do Kg");
		lblValorKg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorKg.setBounds(46, 101, 85, 29);
		contentPane.add(lblValorKg);
		
		JLabel lblPesoPrato = new JLabel("Peso do Prato (Kg)");
		lblPesoPrato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoPrato.setBounds(46, 141, 133, 29);
		contentPane.add(lblPesoPrato);
		
		textValorKg = new JTextField();
		textValorKg.setBounds(213, 101, 101, 26);
		contentPane.add(textValorKg);
		textValorKg.setColumns(10);
		
		textPesoPrato = new JTextField();
		textPesoPrato.setBounds(213, 141, 101, 26);
		contentPane.add(textPesoPrato);
		textPesoPrato.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorKgDigi = textValorKg.getText();
				String PesoPratoDigi = textPesoPrato.getText();
				
				Float ValorKg = Float.valueOf(ValorKgDigi);
				Float PesoPrato = Float.valueOf(PesoPratoDigi);
				
				Calcular calc = new Calcular();
				Float TotalPagar = calc.CalculoKg(ValorKg, PesoPrato);
				
				JOptionPane.showMessageDialog(null, "O Total a Pagar é R$" + TotalPagar);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(46, 181, 101, 29);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorKg.setText("");
				textPesoPrato.setText("");
			}
		});
		btnLimpar.setBounds(213, 178, 101, 29);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel_1 = new JLabel("R$9,95 o Kg");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(129, 50, 77, 29);
		contentPane.add(lblNewLabel_1);
	}

}
