package model;

public enum Combustiveis {
	
	OLEO_DIESEL(1, "Óleo Diesel"), GASOLINA_COMUM(2, "Gasolina Comum"), GASOLINA_ADITIVADA(3, "Gasolina Aditivada"), ETANOL(4, "Etanol");
	
	private int codigo;
	private String descricao;
	
	private Combustiveis(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
}
