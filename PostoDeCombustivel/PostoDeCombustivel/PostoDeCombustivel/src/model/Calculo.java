package model;

public class Calculo {

	private Float OleoDiesel;
	private Float GasolinaComum;
	private Float GasolinaAditivada;
	private Float Etanol;
	private Float Frascos500;
	private Float Frascos1;
	
	
	public Float getOleoDiesel() {
		return OleoDiesel;
	}

	public void setOleoDiesel(Float oleoDiesel) {
		OleoDiesel = oleoDiesel;
	}

	public Float getGasolinaComum() {
		return GasolinaComum;
	}

	public void setGasolinaComum(Float gasolinaComum) {
		GasolinaComum = gasolinaComum;
	}

	public Float getGasolinaAditivada() {
		return GasolinaAditivada;
	}

	public void setGasolinaAditivada(Float gasolinaAditivada) {
		GasolinaAditivada = gasolinaAditivada;
	}

	public Float getEtanol() {
		return Etanol;
	}

	public void setEtanol(Float etanol) {
		Etanol = etanol;
	}

	public Float getFrascos500() {
		return Frascos500;
	}

	public void setFrascos500(Float frascos500) {
		Frascos500 = frascos500;
	}

	public Float getFrascos1() {
		return Frascos1;
	}

	public void setFrascos1(Float frascos1) {
		Frascos1 = frascos1;
	}
	
	

	public Float calcularOleo500(Float frasco500Conv, Float qtdFrascos500Conv) {
		Float calc500 = frasco500Conv * qtdFrascos500Conv;
		return calc500;
	}

	public Float calcularOleo1(Float frasco1Conv, Float qtdFrascos1Conv) {
		Float calc1 = frasco1Conv * qtdFrascos1Conv;
		return calc1;
	}

	public Float calcularTotalOleo(Float calcOleo500, Float calcOleo1) {
		Float TotalOleo = calcOleo500 + calcOleo1;
		return TotalOleo;
	}

	public Float calcularOleoDiesel(Float oleoDieselConv, Float qtdLitrosConv) {
		Float valorComb = oleoDieselConv * qtdLitrosConv;
		return valorComb;
	}

	public Float calcularGasComum(Float gasComumConv, Float qtdLitrosConv) {
		Float valorComb = gasComumConv * qtdLitrosConv;
		return valorComb;
	}

	public Float calcularGasAditiv(Float gasAditivConv, Float qtdLitrosConv) {
		Float valorComb = gasAditivConv * qtdLitrosConv;
		return valorComb;
	}

	public Float calcularEtanol(Float etanolConv, Float qtdLitrosConv) {
		Float valorComb = etanolConv * qtdLitrosConv;
		return valorComb;
	}

	
	
	
}
