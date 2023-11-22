package vision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import model.Calculo;
import model.Combustiveis;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class TelaPosto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textOleoDiesel;
	private JTextField textGasComum;
	private JTextField textGasAditiv;
	private JTextField textEtanol;
	private JTextField textFrasco500;
	private JTextField textFrasco1;
	private JTextField textQtdFrascos500;
	private JTextField textQtdFrascos1;
	private Calculo calc = new Calculo();
	/**
	 * @wbp.nonvisual location=661,-31
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField textQtdLitros;
	private JTextField textDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPosto frame = new TelaPosto();
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
	public TelaPosto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow]"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Pre\u00E7o do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1, "cell 0 0,grow");
		panel_1.setLayout(null);
		
		textOleoDiesel = new JTextField();
		textOleoDiesel.setBounds(173, 29, 86, 20);
		panel_1.add(textOleoDiesel);
		textOleoDiesel.setColumns(10);
		
		textGasComum = new JTextField();
		textGasComum.setBounds(173, 60, 86, 20);
		panel_1.add(textGasComum);
		textGasComum.setColumns(10);
		
		textGasAditiv = new JTextField();
		textGasAditiv.setBounds(173, 91, 86, 20);
		panel_1.add(textGasAditiv);
		textGasAditiv.setColumns(10);
		
		textEtanol = new JTextField();
		textEtanol.setBounds(173, 122, 86, 20);
		panel_1.add(textEtanol);
		textEtanol.setColumns(10);
		
		JLabel lblOleoDiesel = new JLabel("Óleo Diesel:");
		lblOleoDiesel.setBounds(44, 32, 86, 14);
		panel_1.add(lblOleoDiesel);
		
		JLabel lblGasComum = new JLabel("Gas. Comum:");
		lblGasComum.setBounds(39, 63, 91, 14);
		panel_1.add(lblGasComum);
		
		JLabel lblGasAditiv = new JLabel("Gas. Aditivada:");
		lblGasAditiv.setBounds(36, 94, 103, 14);
		panel_1.add(lblGasAditiv);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		lblEtanol.setBounds(55, 125, 75, 14);
		panel_1.add(lblEtanol);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do \u00D3leo do Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2, "cell 1 0,grow");
		panel_2.setLayout(null);
		
		JLabel lblFrasco500 = new JLabel("Frasco 500mL");
		lblFrasco500.setBounds(40, 36, 95, 14);
		panel_2.add(lblFrasco500);
		
		JLabel lblFraso1 = new JLabel("Fraco 1L");
		lblFraso1.setBounds(53, 73, 69, 14);
		panel_2.add(lblFraso1);
		
		textFrasco500 = new JTextField();
		textFrasco500.setBounds(162, 33, 86, 20);
		panel_2.add(textFrasco500);
		textFrasco500.setColumns(10);
		
		textFrasco1 = new JTextField();
		textFrasco1.setBounds(162, 70, 86, 20);
		panel_2.add(textFrasco1);
		textFrasco1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u00D3leo do Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3, "cell 0 1 2 1,grow");
		panel_3.setLayout(null);
		
		JLabel lblFrascoDe500 = new JLabel("Frasco(s) de 500mL");
		lblFrascoDe500.setBounds(62, 68, 123, 14);
		panel_3.add(lblFrascoDe500);
		
		textQtdFrascos500 = new JTextField();
		textQtdFrascos500.setBounds(217, 65, 65, 20);
		panel_3.add(textQtdFrascos500);
		textQtdFrascos500.setColumns(10);
		
		textQtdFrascos1 = new JTextField();
		textQtdFrascos1.setBounds(217, 112, 65, 20);
		panel_3.add(textQtdFrascos1);
		textQtdFrascos1.setColumns(10);
		
		JLabel lblFrascoDe1 = new JLabel("Frasco(s) de 1L");
		lblFrascoDe1.setBounds(73, 115, 112, 14);
		panel_3.add(lblFrascoDe1);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(221, 23, 86, 14);
		panel_3.add(lblQuantidade);
		
		JLabel lblValorPagar = new JLabel("Valor a Pagar");
		lblValorPagar.setBounds(353, 23, 79, 14);
		panel_3.add(lblValorPagar);
		
		JLabel lblNewLabel_4 = new JLabel("Total de Óleo");
		lblNewLabel_4.setBounds(489, 23, 91, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblValorF500 = new JLabel("  -  ");
		lblValorF500.setBounds(377, 68, 72, 14);
		panel_3.add(lblValorF500);
		
		JLabel lblTotalOleo = new JLabel("  -  ");
		lblTotalOleo.setBounds(513, 68, 67, 14);
		panel_3.add(lblTotalOleo);
		
		JLabel lblValorF1 = new JLabel("  -  ");
		lblValorF1.setBounds(377, 115, 72, 14);
		panel_3.add(lblValorF1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4, "cell 0 2,grow");
		panel_4.setLayout(null);
		
		JLabel lblCombustivel = new JLabel("Combustível:");
		lblCombustivel.setBounds(52, 29, 96, 14);
		panel_4.add(lblCombustivel);
		
		JLabel lblQtdLitros = new JLabel("Quantidade de Litros:");
		lblQtdLitros.setBounds(31, 72, 145, 14);
		panel_4.add(lblQtdLitros);
		
		JLabel lblTotalComb = new JLabel("Total de Combustível:");
		lblTotalComb.setBounds(31, 115, 145, 14);
		panel_4.add(lblTotalComb);
		
		JComboBox comboBoxCombustivel = new JComboBox();
		comboBoxCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBoxCombustivel.setBounds(170, 25, 119, 22);
		panel_4.add(comboBoxCombustivel);
		comboBoxCombustivel.addItem(Combustiveis.OLEO_DIESEL);
		comboBoxCombustivel.addItem(Combustiveis.GASOLINA_COMUM);
		comboBoxCombustivel.addItem(Combustiveis.GASOLINA_ADITIVADA);
		comboBoxCombustivel.addItem(Combustiveis.ETANOL);
		
		textQtdLitros = new JTextField();
		textQtdLitros.setBounds(186, 69, 86, 20);
		panel_4.add(textQtdLitros);
		textQtdLitros.setColumns(10);
		
		JLabel lblTotalCombResult = new JLabel("  -  ");
		lblTotalCombResult.setBounds(221, 115, 77, 14);
		panel_4.add(lblTotalCombResult);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_5, "cell 1 2,grow");
		panel_5.setLayout(null);
		
		JRadioButton rdbtnVista = new JRadioButton("À Vista");
		rdbtnVista.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textDias.setEditable(false);
			}
		});
		buttonGroup.add(rdbtnVista);
		rdbtnVista.setBounds(32, 36, 125, 23);
		panel_5.add(rdbtnVista);
		
		JRadioButton rdbtnPrazo = new JRadioButton("À Prazo");
		rdbtnPrazo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textDias.setEditable(true);
			}
		});
		buttonGroup.add(rdbtnPrazo);
		rdbtnPrazo.setBounds(32, 72, 125, 23);
		panel_5.add(rdbtnPrazo);
		
		JLabel lblTotalPagar = new JLabel("Total a Pagar:");
		lblTotalPagar.setBounds(76, 113, 91, 14);
		panel_5.add(lblTotalPagar);
		
		JLabel lblTotalPagarResult = new JLabel("  -  ");
		lblTotalPagarResult.setBounds(177, 113, 83, 14);
		panel_5.add(lblTotalPagarResult);
		
		JLabel lblDias = new JLabel("Dias:");
		lblDias.setBounds(164, 57, 59, 14);
		panel_5.add(lblDias);
		
		textDias = new JTextField();
		textDias.setBounds(198, 54, 52, 20);
		panel_5.add(textDias);
		textDias.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][]", "[]"));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String OleoDiesel = textOleoDiesel.getText();
				String GasComum = textGasComum.getText();
				String GasAditiv = textGasAditiv.getText();
				String Etanol = textEtanol.getText();
				String Frasco500 = textFrasco500.getText();
				String Frasco1 = textFrasco1.getText();
				String QtdFrascos500 = textQtdFrascos500.getText();
				String QtdFrascos1 = textQtdFrascos1.getText();
				String QtdLitros = textQtdLitros.getText();
				
				Float OleoDieselConv = Float.valueOf(OleoDiesel);
				Float GasComumConv = Float.valueOf(GasComum);
				Float GasAditivConv = Float.valueOf(GasAditiv);
				Float EtanolConv = Float.valueOf(Etanol);
				Float Frasco500Conv = Float.valueOf(Frasco500);
				Float Frasco1Conv = Float.valueOf(Frasco1);
				Float QtdFrascos500Conv = Float.valueOf(QtdFrascos500);
				Float QtdFrascos1Conv = Float.valueOf(QtdFrascos1);
				Float QtdLitrosConv = Float.valueOf(QtdLitros);
				
				Calculo Calcular = new Calculo();
				Float calcOleo500 = Calcular.calcularOleo500(Frasco500Conv, QtdFrascos500Conv);
				Float calcOleo1 = Calcular.calcularOleo1(Frasco1Conv, QtdFrascos1Conv);
				Float calcTotalOleo = Calcular.calcularTotalOleo(calcOleo500, calcOleo1);
				Combustiveis CombSelecionado = (Combustiveis) comboBoxCombustivel.getSelectedItem();
				Float calcCombustivel = null;
				if(CombSelecionado == Combustiveis.OLEO_DIESEL) {
					calcCombustivel = Calcular.calcularOleoDiesel(OleoDieselConv, QtdLitrosConv);
				}
				if(CombSelecionado == Combustiveis.GASOLINA_COMUM) {
					calcCombustivel = Calcular.calcularGasComum(GasComumConv, QtdLitrosConv);
				}
				if(CombSelecionado == Combustiveis.GASOLINA_ADITIVADA) {
					calcCombustivel = Calcular.calcularGasAditiv(GasAditivConv, QtdLitrosConv);
				}
				if(CombSelecionado == Combustiveis.ETANOL) {
					calcCombustivel = Calcular.calcularEtanol(EtanolConv, QtdLitrosConv);
				}
				String TotalCombustivel = String.valueOf(calcCombustivel);
				lblTotalCombResult.setText(TotalCombustivel);
				
				String TotalOleo500 = String.valueOf(calcOleo500);
				String TotalOleo1 = String.valueOf(calcOleo1);
				String TotalOleo = String.valueOf(calcTotalOleo);
				lblValorF500.setText(TotalOleo500);
				lblValorF1.setText(TotalOleo1);
				lblTotalOleo.setText(TotalOleo);
				Double ValorTotal = (double) (calcTotalOleo + calcCombustivel);
				if(rdbtnVista.isSelected()) {
					ValorTotal = ValorTotal - (ValorTotal * 0.1);
					String StringValorTotal = String.valueOf(ValorTotal);
					lblTotalPagarResult.setText(StringValorTotal);
				}
				if(rdbtnPrazo.isSelected()) {
					String StringDias = textDias.getText();
					Integer dias = Integer.valueOf(StringDias);
					if((dias > 0) && (dias <= 30)) {
						String StringValorTotal = String.valueOf(ValorTotal);
						lblTotalPagarResult.setText(StringValorTotal);
					}
					if(dias > 30) {
						ValorTotal = ValorTotal + (ValorTotal * 0.1);
						String StringValorTotal = String.valueOf(ValorTotal);
						lblTotalPagarResult.setText(StringValorTotal);
					}
				}
				
			}
		});
		panel_6.add(btnCalcular, "cell 2 0");
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textOleoDiesel.setText("");
				textGasComum.setText("");
				textGasAditiv.setText("");
				textEtanol.setText("");
				textFrasco500.setText("");
				textFrasco1.setText("");
				textQtdFrascos500.setText("");
				textQtdFrascos1.setText("");
				textQtdLitros.setText("");
				textDias.setText("");
				lblValorF500.setText("  -  ");
				lblValorF1.setText("  -  ");
				lblTotalOleo.setText("  -  ");
				lblTotalCombResult.setText("  -  ");
				lblTotalPagarResult.setText("  -  ");
				
			}
		});
		panel_6.add(btnNovoCalculo, "cell 8 0");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		panel_6.add(btnFechar, "cell 14 0");
	}
}
