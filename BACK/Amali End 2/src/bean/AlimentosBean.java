package bean;

public class AlimentosBean {
	
	//inserir codxxx
	protected int ano;
	protected String estado;
	protected String municipio;
	protected String entidade_executora;
	protected boolean agricultura_familiar;
	protected boolean organico;
	protected String nome_produto;
	protected int documento_despesa;
	protected String u_medida;
	protected double qt_comprada;
	protected double valor_unitario;
	protected double valor_total;
	
	public AlimentosBean() {};
	
	
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
	public void setEntidade_executora(String entidade_executora) {
		this.entidade_executora = entidade_executora;
	}
	public String getEntidade_executora() {
		return entidade_executora;
	}
	public void setOrganico(boolean organico) {
		this.organico = organico;
	}
	public boolean getOrganico() {
		return organico;
	}
	public void setAgricultura_familiar(boolean agricultura_familiar) {
		this.agricultura_familiar = agricultura_familiar;
	}
	public boolean getAgricultura_familiar() {
		return agricultura_familiar;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setDocumento_despesa(int documento_despesa) {
		this.documento_despesa = documento_despesa;
	}
	public int getDocumento_despesa() {
		return documento_despesa;
	}
	public void setU_medida(String u_medida) {
		this.u_medida = u_medida;
	}
	public String getU_medida() {
		return u_medida;
	}
	public void setQt_comprada(double qt_comprada) {
		this.qt_comprada = qt_comprada;
	}
	public double getQt_comprada() {
		return qt_comprada;
	}
	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	public double getValor_unitario() {
		return valor_unitario;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public double getValor_total() {
		return valor_total;
	}
	
}
