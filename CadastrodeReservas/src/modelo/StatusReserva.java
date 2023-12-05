package modelo;

public enum StatusReserva {
	
	FINALIZADA(1, "Finalizada"), ANDAMENTO(2, "Em Andamento"), CANCELADA(3, "Cancelada");
	
	private int codigo;
	private String descricao;
	
	private StatusReserva(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
}
