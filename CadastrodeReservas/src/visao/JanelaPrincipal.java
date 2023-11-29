package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

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

	Nome do Hóspede - Digitado
	CPF - Digitado
	Email - Digitado
	Telefone - Digitado
	Data de Check-in - Digitado
	Data de Check-out - Digitado
	Número do Quarto - Digitado
	Tipo de Quarto - ComboBox
	Número de Hóspedes - Digitado (Máx. 4)
	Necessidades Especiais - ComboBox
	Método de Pagamento - ComboBox
	Total a Pagar - Calculado
	Status da Reserva - Digitado
	Comentários - Digitado
	Código da Reserva - Digitado
	*/
	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));
	}

}
