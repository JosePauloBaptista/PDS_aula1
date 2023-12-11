package modelo;

import java.time.LocalDate;

public class Reserva {
	
	private String nome;
	private int cpf;
	private String email;
	private int telefone;
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
	private Integer codReserva;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
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
	public Integer getCodReserva() {
		return codReserva;
	}
	public void setCodReserva(int codReservaConv) {
		this.codReserva = codReservaConv;
	}
	
}
