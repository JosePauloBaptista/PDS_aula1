package visao;

import java.awt.EventQueue;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

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
	private JComboBox comboBoxNumHospedes;
	private JLabel lblNumHospedes;
	private JLabel lblNewLabel_1;
	private JLabel lblMetodoPag;
	private JLabel lblTotalPagamento;
	private JLabel lblStatusReserva;
	private JLabel lblCodReserva;
	private JLabel lblComent;
	private JTextField textTipoQuarto;
	private JComboBox comboBoxMetPagamento;
	private JComboBox comboBoxStatusReserva;
	private JLabel lblTotalPagar;
	private JComboBox comboBoxNecesEspeciais;
	private JTextField textFieldCodReserva;
	private JTextField textComent;
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
	Número de Hóspedes - Digitado (Máx. 4) X
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
		setBounds(100, 100, 745, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][99.00][][grow]", "[][][][][][][][][][][][][]"));
		contentPane.setLayout(new MigLayout("", "[91px][86px][143px]", "[17px][20px][20px][20px][14px][20px]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Reserva");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "cell 2 0");
		
		JLabel lblNome = new JLabel("Nome do Hóspede:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblNome, "cell 1 2");
		
		textNomeHospede = new JTextField();
		contentPane.add(textNomeHospede, "cell 2 2");
		textNomeHospede.setColumns(10);
		
		lblCheckIn = new JLabel("Check-In:");
		contentPane.add(lblCheckIn, "cell 3 2,alignx left");
		
		formattedTextCheckIn = new JFormattedTextField();
		contentPane.add(formattedTextCheckIn, "cell 4 2,growx");
		
		lblCPF = new JLabel("CPF:");
		contentPane.add(lblCPF, "cell 1 3");
		
		textCPF = new JTextField();
		contentPane.add(textCPF, "cell 2 3");
		textCPF.setColumns(10);
		
		lblCheckOut = new JLabel("Check-Out:");
		contentPane.add(lblCheckOut, "cell 3 3,alignx left");
		
		formattedTextCheckOut = new JFormattedTextField();
		contentPane.add(formattedTextCheckOut, "cell 4 3,growx");
		
		JLabel lblEmail = new JLabel("Email:");
		contentPane.add(lblEmail, "cell 1 4");
		
		textEmail = new JTextField();
		contentPane.add(textEmail, "cell 2 4");
		textEmail.setColumns(10);
		
		lblNumQuarto = new JLabel("Num. do Quarto:");
		contentPane.add(lblNumQuarto, "cell 3 4");
		
		textNumQuarto = new JTextField();
		contentPane.add(textNumQuarto, "cell 4 4");
		textNumQuarto.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_4, "cell 1 5");
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone, "cell 2 5");
		textTelefone.setColumns(10);
		
		lblTipoQuarto = new JLabel("Tipo do Quarto:");
		contentPane.add(lblTipoQuarto, "cell 3 5");
		
		textTipoQuarto = new JTextField();
		contentPane.add(textTipoQuarto, "cell 4 5");
		textTipoQuarto.setColumns(10);
		
		comboBoxNumHospedes = new JComboBox();
		contentPane.add(comboBoxNumHospedes, "cell 4 6");
		
		lblNumHospedes = new JLabel("Num. de Hóspedes:");
		contentPane.add(lblNumHospedes, "cell 3 6");
		
		lblNewLabel_1 = new JLabel("Necessidades Especiais:");
		contentPane.add(lblNewLabel_1, "cell 3 7");
		
		comboBoxNecesEspeciais = new JComboBox();
		contentPane.add(comboBoxNecesEspeciais, "cell 4 7");
		
		lblMetodoPag = new JLabel("Método de Pagamento:");
		contentPane.add(lblMetodoPag, "cell 3 8");
		
		comboBoxMetPagamento = new JComboBox();
		contentPane.add(comboBoxMetPagamento, "cell 4 8");
		
		lblTotalPagamento = new JLabel("Total à Pagar:");
		contentPane.add(lblTotalPagamento, "cell 3 9");
		
		lblTotalPagar = new JLabel("  -  ");
		contentPane.add(lblTotalPagar, "cell 4 9");
		
		lblStatusReserva = new JLabel("Status da Reserva:");
		contentPane.add(lblStatusReserva, "cell 3 10");
		
		comboBoxStatusReserva = new JComboBox();
		contentPane.add(comboBoxStatusReserva, "cell 4 10");
		
		lblCodReserva = new JLabel("Código da Reserva:");
		contentPane.add(lblCodReserva, "cell 3 11");
		
		textFieldCodReserva = new JTextField();
		contentPane.add(textFieldCodReserva, "cell 4 11");
		textFieldCodReserva.setColumns(10);
		
		lblComent = new JLabel("Comentários:");
		contentPane.add(lblComent, "cell 3 12");
		
		textComent = new JTextField();
		contentPane.add(textComent, "cell 4 12");
		textComent.setColumns(10);
	}

}
