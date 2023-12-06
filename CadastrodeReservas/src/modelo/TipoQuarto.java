package modelo;

public enum TipoQuarto {
	
	SIMPLES(1, "Simples"), SUÍTE(2, "Suíte"), DELUXE(3, "Deluxe"), PREMIUM(4, "Premium");
	
	private int codigo;
	private String descricao;
	
	private TipoQuarto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
}
