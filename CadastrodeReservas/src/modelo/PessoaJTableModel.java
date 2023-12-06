package modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaJTableModel extends AbstractTableModel{

	private ArrayList<Pessoa> lista;
	private String[] colunas ={"Nome", "CPF", "Email", "Telefone"};
	
	public PessoaJTableModel(ArrayList<Pessoa> lista) {
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
		Pessoa p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} else if(columnIndex == 1) {
			return p.getCpf();
		} else if(columnIndex == 2) {
			return p.getEmail();
		} else if(columnIndex == 3) {
			return p.getTelefone();
		}
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}