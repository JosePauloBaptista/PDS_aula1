import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNmeses;
	private JTextField textDepMen;
	private JTextField textJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 260);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("Sobre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormSobre frame = new FormSobre();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(btnNewButton);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepMen = new JLabel("Depósito Mensal R$:");
		contentPane.add(lblDepMen);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textDepMen = new JTextField();
		panel_2.add(textDepMen);
		textDepMen.setColumns(10);
		
		JLabel lblNmeses = new JLabel("Num. de meses:");
		contentPane.add(lblNmeses);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textNmeses = new JTextField();
		panel_3.add(textNmeses);
		textNmeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		contentPane.add(lblJurosMes);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textJurosMes = new JTextField();
		panel_4.add(textJurosMes);
		textJurosMes.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total investido + juros R$:");
		contentPane.add(lblNewLabel);
		
		JLabel lblTotal = new JLabel("");
		contentPane.add(lblTotal);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnCalcular = new JButton("Calcular");
		panel.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Depos = textDepMen.getText();
				String Meses = textNmeses.getText();
				String Juros = textJurosMes.getText();
				
				Double DepMen = Double.valueOf(Depos);
				Integer Nmeses = Integer.valueOf(Meses);
				Double JurosMes = Double.valueOf(Juros);
				
				Investimento calc = new Investimento(Nmeses, JurosMes, DepMen);
				Double InvEJuros = calc.calculaTotal();
				
				String Total = String.valueOf(InvEJuros);
				
				lblTotal.setText(Total);
				
			}
		});
	}

}
