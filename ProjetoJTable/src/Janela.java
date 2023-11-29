
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField textNome;
	private JLabel lblCPF;
	private JTextField textCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JLabel lblTelefone;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textAltura;
	private JTextField textPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 88, 495, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: " + pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(12, 12, 32, 14);
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(labelNome);
		
		textNome = new JTextField();
		textNome.setBounds(12, 30, 141, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setBounds(167, 12, 20, 14);
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(163, 30, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(12, 54, 141, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome = textNome.getText();
				String Cpf= textCPF.getText();
				String Telefone =  "";
				String Idade =  "";
				Float Peso = (float) 0.00;
				Float Altura = (float) 0.00;
				
				Nome = textNome.getText();
				Cpf = textCPF.getText();
				Telefone = textTelefone.getText();
				Idade = textIdade.getText();
				Peso = Float.parseFloat(textPeso.getText());
				Altura = Float.parseFloat(textAltura.getText());
				
				Pessoa p = new Pessoa();
				p.setNome(Nome);
				p.setCpf(Integer.parseInt(Cpf));
				p.setAltura(Altura);
				p.setPeso(Peso);
				p.setIdade(Integer.parseInt(Idade));
				p.setTelefone(Integer.parseInt(Telefone));
		
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(191, 54, 141, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setBounds(366, 54, 141, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linha = table.getSelectedRow();
				if(linha != -1) {
					Pessoa PSelecionada = listaPessoas.get(linha);

		            PSelecionada.setNome(textNome.getText());
		            PSelecionada.setCpf(Integer.parseInt(textCPF.getText()));
		            PSelecionada.setTelefone(Integer.parseInt(textTelefone.getText()));
		            PSelecionada.setIdade(Integer.parseInt(textIdade.getText()));
		            PSelecionada.setPeso(Float.parseFloat(textPeso.getText()));
		            PSelecionada.setAltura(Float.parseFloat(textAltura.getText()));

		            limparCampos();
		            atualizarJTableModel();
		        } 
				else {
		            JOptionPane.showMessageDialog(null, "Selecione uma pessoa para editar.");
		        }
			}
		});
		contentPane.add(btnNewButton_2);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(259, 12, 73, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(259, 30, 86, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(355, 30, 44, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdade.setBounds(355, 12, 46, 14);
		contentPane.add(lblIdade);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		textAltura.setBounds(409, 30, 44, 20);
		contentPane.add(textAltura);
		
		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(463, 30, 44, 20);
		contentPane.add(textPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAltura.setBounds(411, 12, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeso.setBounds(463, 12, 46, 14);
		contentPane.add(lblPeso);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		textNome.setText("");
		textCPF.setText("");
		textTelefone.setText("");
		textIdade.setText("");
		textPeso.setText("");
		textAltura.setText("");
	}
}










