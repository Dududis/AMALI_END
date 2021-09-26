package bean;

public class AlunosBean {
	
	protected int cod_alunos_atendidos;
	protected int ano;
	protected String estado;
	protected String municipio;
	protected String regiao;
	protected String esfera_governo;
	protected String etapa_ensino;
	protected int qt_alunos;
	
	public AlunosBean() {};
	
	public void setCod_alunos_atendidos(int cod_alunos_atendidos) {
		this.cod_alunos_atendidos = cod_alunos_atendidos;
	}
	public int getCod_alunos_atendidos() {
		return cod_alunos_atendidos;
	}
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
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setEsfera_governo(String esfera_governo) {
		this.esfera_governo = esfera_governo;
	}
	public String getEsfera_governo() {
		return esfera_governo;
	}
	public void setEtapa_ensino(String etapa_ensino) {
		this.etapa_ensino = etapa_ensino;
	}
	public String getEtapa_ensino() {
		return etapa_ensino;
	}
	public void setQt_alunos(int qt_alunos) {
		this.qt_alunos = qt_alunos;
	}
	public int getQt_alunos() {
		return qt_alunos;
	}
	
}
