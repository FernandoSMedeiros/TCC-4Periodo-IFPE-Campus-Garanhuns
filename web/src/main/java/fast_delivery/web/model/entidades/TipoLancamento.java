package fast_delivery.web.model.entidades;

public enum TipoLancamento {

	DEBITO("Debito"), CREDITO("Credito");

	private String tipoLanc;

	TipoLancamento(String tipoLanc) {
		this.tipoLanc = tipoLanc;
	}

	public String getTipoLanc() {
		return this.tipoLanc;
	}

}
