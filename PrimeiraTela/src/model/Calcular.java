package model;

public class Calcular {

	public Float CalculoGasolina(float ValorLitro, float ValorPago) {
		Float QtdLitros = ValorPago / ValorLitro;
		return QtdLitros;
	}
	
	public Float CalculoKg(float ValorKg, float PesoPrato) {
		Float TotalPagar = ValorKg * PesoPrato;
		return TotalPagar;
	}
}
