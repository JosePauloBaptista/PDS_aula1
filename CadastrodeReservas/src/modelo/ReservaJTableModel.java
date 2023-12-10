package modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ReservaJTableModel extends AbstractTableModel{

	private ArrayList<Reserva> lista;
	private String[] colunas ={"Nome", "CPF", "Email", "Telefone", };
	
	public ReservaJTableModel(ArrayList<Reserva> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Reserva p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} else if(columnIndex == 1) {
			return p.getCpf();
		} else if(columnIndex == 2) {
			return p.getEmail();
		} else if(columnIndex == 3) {
			return p.getTelefone();
		} else if(columnIndex == 4) {
			return p.getDataCheckin();
		} else if(columnIndex == 5) {
			return p.getDataCheckout();
		} else if(columnIndex == 6) {
			return p.getTelefone();
		} else if(columnIndex == 7) {
			return p.getTelefone();
		} else if(columnIndex == 8) {
			return p.getTelefone();
		} else if(columnIndex == 9) {
			return p.getTelefone();
		} else if(columnIndex == 10) {
			return p.getTelefone();
		} else if(columnIndex == 11) {
			return p.getTelefone();
		} 
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}