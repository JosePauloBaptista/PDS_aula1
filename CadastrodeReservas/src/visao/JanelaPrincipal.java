package visao;

import java.awt.EventQueue;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.MetodoPagamento;
import modelo.StatusReserva;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeHospede;
	private JLabel lblCPF;
	private JTextField textCPF;
	private JTextField textEmail;
	private JLabel lblNewLabel_4;
	private JTextField textTelefone;
	private JLabel lblCheckIn;
	private JLabel lblCheckOut;
	private JLabel lblNumQuarto;
	private JLabel lblTipoQuarto;
	private JTextField textNumQuarto;
	private JLabel lblNumHospedes;
	private JLabel lblNewLabel_1;
	private JLabel lblMetodoPag;
	private JLabel lblTotalPagamento;
	private JLabel lblStatusReserva;
	private JLabel lblCodReserva;
	private JLabel lblComent;
	private JTextField textTipoQuarto;
	private JComboBox<MetodoPagamento> comboBoxMetPagamento;
	private JComboBox<StatusReserva> comboBoxStatusReserva;
	private JLabel lblTotalPagar;
	private JTextField textFieldCodReserva;
	private JRadioButton rdbtnPCDSim;
	private JRadioButton rdbtnPCDNao;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextPane textPaneComent;
	private JTextField textNumHospedes;
	private JFormattedTextField formattedTextCheckIn;
	private JFormattedTextField formattedTextCheckOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
		
	Cadastro de reservas/quartos de hotel para um sistema de turismo

	Nome do Hóspede - Digitado X
	CPF - Digitado X
	Email - Digitado X
	Telefone - Digitado X
	
	Data de Check-in - Digitado X
	Data de Check-out - Digitado X
	Número do Quarto - Digitado (Máx. 4) X
	Tipo de Quarto - ComboBox X
	Número de Hóspedes - Digitado (Máx. 6) X
	Necessidades Especiais - Boolean X
	Método de Pagamento - ComboBox X
	Total a Pagar - Calculado X
	Status da Reserva - ComboBox X
	Comentários - Digitado 
	Código da Reserva - Digitado 
	
	*/
	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][99.00][grow]", "[][][][][][][grow][][][][][][grow]"));
		contentPane.setLayout(new MigLayout("", "[91px][86px][143px]", "[17px][20px][20px][20px][14px][20px]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Reserva");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "cell 1 0");
		
		JLabel lblNome = new JLabel("Nome do Hóspede:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblNome, "cell 0 2");
		
		textNomeHospede = new JTextField();
		contentPane.add(textNomeHospede, "cell 1 2");
		textNomeHospede.setColumns(10);
		
		lblCheckIn = new JLabel("Check-In:");
		contentPane.add(lblCheckIn, "cell 2 2,alignx left");
		
		formattedTextCheckIn = new JFormattedTextField(setMascara("##/##/####"));
		contentPane.add(formattedTextCheckIn, "cell 3 2,growx");
		
		lblCPF = new JLabel("CPF:");
		contentPane.add(lblCPF, "cell 0 3");
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 1 3");
		textCPF.setColumns(10);
		
		lblCheckOut = new JLabel("Check-Out:");
		contentPane.add(lblCheckOut, "cell 2 3,alignx left");
		
		formattedTextCheckOut = new JFormattedTextField(setMascara("##/##/####"));
		contentPane.add(formattedTextCheckOut, "cell 3 3,growx");
		
		JLabel lblEmail = new JLabel("Email:");
		contentPane.add(lblEmail, "cell 0 4");
		
		textEmail = new JTextField();
		contentPane.add(textEmail, "cell 1 4");
		textEmail.setColumns(10);
		
		lblNumQuarto = new JLabel("Num. do Quarto:");
		contentPane.add(lblNumQuarto, "cell 2 4");
		
		textNumQuarto = new JTextField();
		contentPane.add(textNumQuarto, "cell 3 4");
		textNumQuarto.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_4, "cell 0 5");
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone, "cell 1 5");
		textTelefone.setColumns(10);
		
		lblTipoQuarto = new JLabel("Tipo do Quarto:");
		contentPane.add(lblTipoQuarto, "cell 2 5");
		
		textTipoQuarto = new JTextField();
		contentPane.add(textTipoQuarto, "cell 3 5");
		textTipoQuarto.setColumns(10);
		
		lblNumHospedes = new JLabel("Num. de Hóspedes:");
		contentPane.add(lblNumHospedes, "cell 2 6");
		
		textNumHospedes = new JTextField();
		textNumHospedes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(textNumHospedes, "cell 3 6");
		textNumHospedes.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Necessidades Especiais:");
		contentPane.add(lblNewLabel_1, "cell 2 7");
		
		rdbtnPCDSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnPCDSim);
		contentPane.add(rdbtnPCDSim, "cell 3 7");
		
		lblMetodoPag = new JLabel("Método de Pagamento:");
		contentPane.add(lblMetodoPag, "cell 2 8");
		
		comboBoxMetPagamento = new JComboBox();
		contentPane.add(comboBoxMetPagamento, "cell 3 8");
		comboBoxMetPagamento.addItem(MetodoPagamento.PIX);
		comboBoxMetPagamento.addItem(MetodoPagamento.BOLETO);
		comboBoxMetPagamento.addItem(MetodoPagamento.CARTAO);
		
		lblTotalPagamento = new JLabel("Total à Pagar:");
		contentPane.add(lblTotalPagamento, "cell 2 9");
		
		lblTotalPagar = new JLabel("  -  ");
		contentPane.add(lblTotalPagar, "cell 3 9");
		
		lblStatusReserva = new JLabel("Status da Reserva:");
		contentPane.add(lblStatusReserva, "cell 2 10");
		
		comboBoxStatusReserva = new JComboBox();
		contentPane.add(comboBoxStatusReserva, "cell 3 10");
		comboBoxStatusReserva.addItem(StatusReserva.FINALIZADA);
		comboBoxStatusReserva.addItem(StatusReserva.ANDAMENTO);
		comboBoxStatusReserva.addItem(StatusReserva.CANCELADA);
		
		lblCodReserva = new JLabel("Código da Reserva:");
		contentPane.add(lblCodReserva, "cell 2 11");
		
		textFieldCodReserva = new JTextField();
		contentPane.add(textFieldCodReserva, "cell 3 11");
		textFieldCodReserva.setColumns(10);
		
		lblComent = new JLabel("Comentários:");
		contentPane.add(lblComent, "cell 2 12");
		
		rdbtnPCDNao = new JRadioButton("Não");
		buttonGroup.add(rdbtnPCDNao);
		contentPane.add(rdbtnPCDNao, "cell 3 7");
		
		textPaneComent = new JTextPane();
		contentPane.add(textPaneComent, "cell 3 12");
	}
	private MaskFormatter setMascara(String mascara){
	    MaskFormatter mask = null;
	    try{
	        mask = new MaskFormatter(mascara);
	        }catch(java.text.ParseException ex){}
	    return mask;
	}
}
