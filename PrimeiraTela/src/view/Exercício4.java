package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercício4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValorLitro;
	private JTextField textValorPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício4 frame = new Exercício4();
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
	public Exercício4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorLitro = new JLabel("Valor do Litro");
		lblValorLitro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorLitro.setBounds(47, 48, 100, 14);
		contentPane.add(lblValorLitro);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorPago.setBounds(47, 95, 77, 23);
		contentPane.add(lblValorPago);
		
		textValorLitro = new JTextField();
		textValorLitro.setBounds(204, 46, 86, 23);
		contentPane.add(textValorLitro);
		textValorLitro.setColumns(10);
		
		textValorPago = new JTextField();
		textValorPago.setBounds(204, 93, 86, 23);
		contentPane.add(textValorPago);
		textValorPago.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String VLitroDigitado = textValorLitro.getText();
				String VPagoDigitado = textValorPago.getText();
				
				Float ValorLitro = Float.valueOf(VLitroDigitado);
				Float ValorPago = Float.valueOf(VPagoDigitado);
				
				Calcular calc = new Calcular();
				Float QLitros = calc.CalculoGasolina(ValorLitro, ValorPago);
				JOptionPane.showMessageDialog(null, "A Quantidade de Litros que pode ser colocada é " + QLitros);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(47, 144, 89, 30);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorLitro.setText("");
				textValorPago.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(201, 144, 89, 30);
		contentPane.add(btnLimpar);
	}

}
