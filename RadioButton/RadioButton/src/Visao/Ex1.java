package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Calcular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBase.setBounds(43, 35, 46, 14);
		contentPane.add(lblBase);
		
		textBase = new JTextField();
		textBase.setBounds(43, 60, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltura.setBounds(241, 35, 46, 14);
		contentPane.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setBounds(241, 60, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setBounds(58, 109, 86, 23);
		contentPane.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setBounds(220, 109, 86, 23);
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(75, 156, 46, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BaseDig = textBase.getText();
				String AlturaDig = textAltura.getText();
				
				if(BaseDig.isEmpty() || (AlturaDig.isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				}
				
				Float Base = Float.valueOf(BaseDig);
				Float Altura = Float.valueOf(AlturaDig);
				
				if(rdbtnArea.isSelected()) {
					Calcular Area = new Calcular();
					Float AreaCalc = Area.calcArea(Base, Altura);
					String AreaCalcStr = String.valueOf(AreaCalc);
					lblResultado.setText(AreaCalcStr);
					
				}else if(rdbtnPerimetro.isSelected()) {
					Calcular Perimetro = new Calcular();
					Float PerimetroCalc = Perimetro.calcPerimetro(Base, Altura);
					String PerimetroCalcStr = String.valueOf(PerimetroCalc);
					lblResultado.setText(PerimetroCalcStr);
				}
				
			}
		});
		btnCalcular.setBounds(43, 199, 86, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBase.setText("");
				textAltura.setText("");
				lblResultado.setText("");
				
			}
		});
		btnLimpar.setBounds(144, 199, 86, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnFechar.setBounds(244, 199, 86, 23);
		contentPane.add(btnFechar);
	}
}
