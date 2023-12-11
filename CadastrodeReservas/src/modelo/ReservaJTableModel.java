package modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ReservaJTableModel extends AbstractTableModel{

	private ArrayList<Reserva> lista;
private String[] colunas ={"Nome", "CPF", "Email", "Telefone", "Data CheckIn", "Data CheckOut", "Num. Quarto", "Tipo Quarto", 
		"Num. Hospedes", "Nec. Especiais", "Método Pagamento", "Total Pagar", "Status Reserva", "Cod. Reserva", "Coment."};
	
	public ReservaJTableModel(ArrayList<Reserva> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		System.out.println(this.lista.size());
		return this.lista.size();
		
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Reserva r = lista.get(rowIndex);
		if(columnIndex == 0) {
			return r.getNome();
		} else if(columnIndex == 1) {
			return r.getCpf();
		} else if(columnIndex == 2) {
			return r.getEmail();
		} else if(columnIndex == 3) {
			return r.getTelefone();
		} else if(columnIndex == 4) {
			return r.getDataCheckin();
		} else if(columnIndex == 5) {
			return r.getDataCheckout();
		} else if(columnIndex == 6) {
			return r.getNumQuarto();
		} else if(columnIndex == 7) {
			return r.getTipoQuarto();
		} else if(columnIndex == 8) {
			return r.getNumHospedes();
		} else if(columnIndex == 9) {
			return r.getNecessiEspec();
		} else if(columnIndex == 10) {
			return r.getMetPag();
		} else if(columnIndex == 11) {
			return r.getTotalPagar();
		} else if(columnIndex == 12) {
			return r.getStatReserva();
		} else if(columnIndex == 13) {
			return r.getCodReserva();
		} else if(columnIndex == 14) {
			return r.getComent();
		} 
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}