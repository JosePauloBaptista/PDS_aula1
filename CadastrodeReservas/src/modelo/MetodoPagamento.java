package modelo;

public enum MetodoPagamento {
	
	PIX(1, "PIX"), BOLETO(2, "Boleto"), CARTAO(3, "Cartão de Crédito (3x)");
	
	private int codigo;
	private String descricao;
	
	private MetodoPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
}
