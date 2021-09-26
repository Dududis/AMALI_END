package bean;

public class RepasseBean {
	
	//inserir codxxx
	protected int ano;
	protected String estado;
	protected String municipio;
	protected String esfera_governo;
	protected String modalidade_ensino;
	protected double valor_total_escolas;
	
	public RepasseBean() {};
	
	//inserir codxxx	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	
	public void setEsfera_governo(String esfera_governo) {
		this.esfera_governo = esfera_governo;
	}
	public String getEsfera_governo() {
		return esfera_governo;
	}
	public void setModalidade_ensino(String modalidade_ensino) {
		this.modalidade_ensino = modalidade_ensino;
	}
	public String getModalidade_ensino() {
		return modalidade_ensino;
	}
	public void setValor_total_escolas(double valor_total_escolas) {
		this.valor_total_escolas = valor_total_escolas;
	}
	public double getValor_total_escolas() {
		return valor_total_escolas;
	}
	
}
