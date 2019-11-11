package oca.enums;

public enum ClasseEnum2 {
	
	COD001("COD001", "Descricao da mensagem 001", "Motivo da mensagem 001"),
	COD002("COD002","Descricao da mensagem","Motivo da mensagem");
	
	private String codigo;
	private String descricao;
	private String motivo;
	
	ClasseEnum2(String codigo, String descricao, String motivo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.motivo = motivo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
