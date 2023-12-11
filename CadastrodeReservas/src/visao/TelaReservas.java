package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Reserva;
import modelo.ReservaJTableModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaReservas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaReservas frame = new TelaReservas(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param listaReservas 
	 */
	public TelaReservas(ArrayList<Reserva> listaReservas) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(252, 252, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][grow][]"));
		
		JLabel lblReservas = new JLabel("Reservas");
		lblReservas.setForeground(new Color(53, 53, 53));
		lblReservas.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblReservas, "cell 1 0");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 2,grow");
		
		table = new JTable();
		table.setBackground(new Color(252, 252, 252));
		scrollPane.setViewportView(table);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(new Color(255, 140, 69));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlterar.setForeground(new Color(240, 240, 240));
		contentPane.add(btnAlterar, "flowx,cell 1 3,growx");
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				//listaReservas.remove(idx_linha);
				atualizarJTableModel(listaReservas);
			}
		});
		btnExcluir.setBackground(new Color(255, 140, 69));
		btnExcluir.setForeground(new Color(240, 240, 240));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnExcluir, "cell 1 3,growx");
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(255, 140, 69));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setForeground(new Color(240, 240, 240));
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnFechar, "cell 1 3,growx");
	}
	public void atualizarJTableModel(ArrayList<Reserva> listaReservas) {
		table.setModel(new ReservaJTableModel(listaReservas));
	}
}
