package modelo;

import java.time.LocalDate;

public class Reserva {
	
	private LocalDate dataCheckin;
	private LocalDate dataCheckout;
	private Integer numQuarto;
	private Enum tipoQuarto;
	private Integer numHospedes;
	private Boolean necessiEspec;
	private Enum metPag;
	private Float totalPagar;
	private Enum statReserva;
	private String coment;
	private Float codReserva;
	
	public LocalDate getDataCheckin() {
		return dataCheckin;
	}
	public void setDataCheckin(LocalDate dataCheckin) {
		this.dataCheckin = dataCheckin;
	}
	public LocalDate getDataCheckout() {
		return dataCheckout;
	}
	public void setDataCheckout(LocalDate dataCheckout) {
		this.dataCheckout = dataCheckout;
	}
	public Integer getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}
	public Enum getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(Enum tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public Integer getNumHospedes() {
		return numHospedes;
	}
	public void setNumHospedes(Integer numHospedes) {
		this.numHospedes = numHospedes;
	}
	public Boolean getNecessiEspec() {
		return necessiEspec;
	}
	public void setNecessiEspec(Boolean necessiEspec) {
		this.necessiEspec = necessiEspec;
	}
	public Enum getMetPag() {
		return metPag;
	}
	public void setMetPag(Enum metPag) {
		this.metPag = metPag;
	}
	public Float getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(Float totalPagar) {
		this.totalPagar = totalPagar;
	}
	public Enum getStatReserva() {
		return statReserva;
	}
	public void setStatReserva(Enum statReserva) {
		this.statReserva = statReserva;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}
	public Float getCodReserva() {
		return codReserva;
	}
	public void setCodReserva(Float codReserva) {
		this.codReserva = codReserva;
	}
	
}
