package visao;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.MetodoPagamento;
import modelo.Reserva;
import modelo.ReservaJTableModel;
import modelo.StatusReserva;
import modelo.TipoQuarto;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeHospede;
	private JLabel lblCPF;
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
	private JTable table;
	private JComboBox<MetodoPagamento> comboBoxMetPagamento;
	private JComboBox<StatusReserva> comboBoxStatusReserva;
	private JTextField textCodReserva;
	private JRadioButton rdbtnPCDSim;
	private JRadioButton rdbtnPCDNao;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textNumHospedes;
	private JFormattedTextField formattedTextCheckIn;
	private JFormattedTextField formattedTextCheckOut;
	private JButton btnFechar;
	ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
	private JButton btnCadastrar;
	private JComboBox<TipoQuarto> comboBoxTipoQuarto;
	private JTextField textTotalPagar;
	private JTextField textComent;
	private JFormattedTextField formattedTextCPF;
	private JButton btnNewButton;
	private JButton btnReservas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
		
	Cadastro de reservas/quartos de hotel para um sistema de turismo

	Nome do Hóspede - Digitado 
	CPF - Digitado 
	Email - Digitado 
	Telefone - Digitado 
	
	Data de Check-in - Digitado 
	Data de Check-out - Digitado 
	Número do Quarto - Digitado 
	Tipo de Quarto - ComboBox 
	Número de Hóspedes - Digitado 
	Necessidades Especiais - Boolean 
	Método de Pagamento - ComboBox 
	Total a Pagar - Digitado
	Status da Reserva - ComboBox 
	Comentários - Digitado 
	Código da Reserva - Digitado 
	
	*/
	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 325);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(252, 252, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//contentPane.setLayout(new MigLayout("", "[grow][grow][99.00][117.00,grow]", "[][][][][][][grow][][][][][][]"));
		contentPane.setLayout(new MigLayout("", "[91px][86px][143px]", "[17px][20px][20px][20px][14px][20px]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Reserva");
		lblNewLabel.setForeground(new Color(53, 53, 53));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "alignx center");
		
		JLabel lblNome = new JLabel("Nome do Hóspede:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblNome, "cell 0 2");
		
		textNomeHospede = new JTextField();
		contentPane.add(textNomeHospede, "cell 1 2");
		textNomeHospede.setColumns(10);
		
		lblTipoQuarto = new JLabel("Tipo do Quarto:");
		contentPane.add(lblTipoQuarto, "cell 2 2");
		
		comboBoxTipoQuarto = new JComboBox();
		contentPane.add(comboBoxTipoQuarto, "alignx left");
		comboBoxTipoQuarto.addItem(TipoQuarto.SIMPLES);
		comboBoxTipoQuarto.addItem(TipoQuarto.SUÍTE);
		comboBoxTipoQuarto.addItem(TipoQuarto.DELUXE);
		comboBoxTipoQuarto.addItem(TipoQuarto.PREMIUM);
		
		lblCPF = new JLabel("CPF:");
		contentPane.add(lblCPF, "cell 0 3");
		
		formattedTextCPF = new JFormattedTextField(setMascara("###.###.###-##"));
		contentPane.add(formattedTextCPF, "cell 1 3,growx");
		
		lblNumHospedes = new JLabel("Num. de Hóspedes:");
		contentPane.add(lblNumHospedes, "cell 2 3");
		
		textNumHospedes = new JTextField();
		textNumHospedes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(textNumHospedes, "cell 3 3");
		textNumHospedes.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		contentPane.add(lblEmail, "cell 0 4");
		
		textEmail = new JTextField();
		contentPane.add(textEmail, "cell 1 4");
		textEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Necessidades Especiais:");
		contentPane.add(lblNewLabel_1, "cell 2 4");
		
		rdbtnPCDSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnPCDSim);
		contentPane.add(rdbtnPCDSim, "cell 3 4");
		
		lblNewLabel_4 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_4, "cell 0 5");
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone, "cell 1 5");
		textTelefone.setColumns(10);
		
		lblMetodoPag = new JLabel("Método de Pagamento:");
		contentPane.add(lblMetodoPag, "cell 2 5");
		
		comboBoxMetPagamento = new JComboBox();
		contentPane.add(comboBoxMetPagamento, "cell 3 5");
		comboBoxMetPagamento.addItem(MetodoPagamento.PIX);
		comboBoxMetPagamento.addItem(MetodoPagamento.BOLETO);
		comboBoxMetPagamento.addItem(MetodoPagamento.CARTAO);
		
		lblTotalPagamento = new JLabel("Total à Pagar:");
		contentPane.add(lblTotalPagamento, "cell 2 6");
		
		textTotalPagar = new JTextField();
		contentPane.add(textTotalPagar, "cell 3 6");
		textTotalPagar.setColumns(10);
		
		lblCheckIn = new JLabel("Check-In:");
		contentPane.add(lblCheckIn, "cell 0 7");
		
		formattedTextCheckIn = new JFormattedTextField(setMascara("##/##/####"));
		contentPane.add(formattedTextCheckIn, "cell 1 7,growx");
		
		lblStatusReserva = new JLabel("Status da Reserva:");
		contentPane.add(lblStatusReserva, "cell 2 7");
		
		comboBoxStatusReserva = new JComboBox();
		contentPane.add(comboBoxStatusReserva, "cell 3 7");
		comboBoxStatusReserva.addItem(StatusReserva.FINALIZADA);
		comboBoxStatusReserva.addItem(StatusReserva.ANDAMENTO);
		comboBoxStatusReserva.addItem(StatusReserva.CANCELADA);
		
		lblCheckOut = new JLabel("Check-Out:");
		contentPane.add(lblCheckOut, "cell 0 8");
		
		formattedTextCheckOut = new JFormattedTextField(setMascara("##/##/####"));
		contentPane.add(formattedTextCheckOut, "cell 1 8,growx");
		
		lblCodReserva = new JLabel("Código da Reserva:");
		contentPane.add(lblCodReserva, "cell 2 8");
		
		textCodReserva = new JTextField();
		contentPane.add(textCodReserva, "cell 3 8");
		textCodReserva.setColumns(10);
		
		lblNumQuarto = new JLabel("Num. do Quarto:");
		contentPane.add(lblNumQuarto, "cell 0 9");
		
		textNumQuarto = new JTextField();
		contentPane.add(textNumQuarto, "cell 1 9");
		textNumQuarto.setColumns(10);
		
		lblComent = new JLabel("Comentários:");
		contentPane.add(lblComent, "cell 2 9");
		
		textComent = new JTextField();
		contentPane.add(textComent, "cell 3 9");
		textComent.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(255, 140, 69));
		btnCadastrar.setForeground(new Color(240, 240, 240));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Nome = textNomeHospede.getText();
				String CPF = formattedTextCPF.getText();
				String Email = textEmail.getText();
				String Telefone = textTelefone.getText();
				String CheckIn = formattedTextCheckIn.getText();
				String CheckOut = formattedTextCheckIn.getText();
				String NumQuarto = textNumQuarto.getText();
				Enum TipoQuarto = (Enum) comboBoxTipoQuarto.getSelectedItem();
				String NumHospedes = textNumHospedes.getText();
				Enum MetPag = (Enum) comboBoxTipoQuarto.getSelectedItem();
				String TotalPagar = textTotalPagar.getText();
				Enum StatusReserva = (Enum) comboBoxStatusReserva.getSelectedItem();
				String CodReserva = textCodReserva.getText();
				String Comentarios = textComent.getText();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				LocalDate CheckInConv = LocalDate.parse(CheckIn, formatter);
				LocalDate CheckOutConv = LocalDate.parse(CheckOut, formatter);
				
				int TelefoneConv = Integer.parseInt(Telefone);
				int NumQuartoConv = Integer.parseInt(NumQuarto);
				int NumHospedesConv = Integer.parseInt(NumHospedes);
				float TotalPagarConv = Float.parseFloat(TotalPagar);
				int CodReservaConv = Integer.parseInt(CodReserva);
				
				
				Reserva r = new Reserva();
				r.setNome(Nome);
				r.setCpf(CPF);
				r.setEmail(Email);
				r.setTelefone(TelefoneConv);
				r.setDataCheckin(CheckInConv);
				r.setDataCheckout(CheckOutConv);;
				r.setNumQuarto(NumQuartoConv);
				r.setTipoQuarto(TipoQuarto);
				r.setNumHospedes(NumHospedesConv);
				r.setMetPag(MetPag);
				r.setTotalPagar(TotalPagarConv);;
				r.setStatReserva(StatusReserva);;
				r.setCodReserva(CodReservaConv);;
				r.setComent(Comentarios);
				
				listaReservas.add(r);
				
				limparCampos();
				
			}
			
		});
		contentPane.add(btnCadastrar, "cell 1 10");
		
		btnReservas = new JButton("Reservas");
		TelaPrincipal estaTela = this;
		btnReservas.setBackground(new Color(255, 140, 69));
		btnReservas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaReservas TelaTabelaReservas = new TelaReservas(listaReservas);
				System.out.println(listaReservas);
				TelaTabelaReservas.setVisible(true);
			}
		});
		btnReservas.setForeground(new Color(240, 240, 240));
		btnReservas.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnReservas, "cell 2 10");
		
		rdbtnPCDNao = new JRadioButton("Não");
		buttonGroup.add(rdbtnPCDNao);
		contentPane.add(rdbtnPCDNao, "cell 3 4");
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(255, 140, 69));
		btnFechar.setForeground(new Color(240, 240, 240));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnFechar, "cell 3 10");
	}
	
	protected void limparCampos() {
		textNomeHospede.setText("");
		formattedTextCPF.setText("");
		textEmail.setText("");
		textTelefone.setText("");
		formattedTextCheckIn.setText("");
		formattedTextCheckOut.setText("");
		textNumQuarto.setText("");
		textNumHospedes.setText("");
		textTotalPagar.setText("");
		textCodReserva.setText("");
		textComent.setText("");
		
	}

	private MaskFormatter setMascara(String mascara){
	    MaskFormatter mask = null;
	    try{
	        mask = new MaskFormatter(mascara);
	        }catch(java.text.ParseException ex){}
	    return mask;
	}

}









