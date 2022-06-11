package br.com.coup;

public class Acoes {
	
	private int codigo;
	private String descricao;
	private Boolean reacao;
	
	public Acoes(int codigo, String descricao, Boolean reacao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.reacao = reacao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getReacao() {
		return reacao;
	}
	public void setReacao(Boolean reacao) {
		this.reacao = reacao;
	}
	@Override
	public String toString() {
		return "Acoes [descricao=" + descricao + "]";
	}
}