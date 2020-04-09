public class CasaComum extends Casa {

	private int movimentos;

	public CasaComum() {
		super();
	}

	public CasaComum(String cor) {
		super(cor);
	}

	public Casa proximaCasa(Castelo castelo, boolean volta, Dado[] dados) {
		if (castelo.getNivel() == 1)
			movimentos = dados[0].getValor() + dados[1].getValor();
		else
			movimentos = Math.min(dados[0].getValor(), dados[1].getValor());

		return super.getCasaSeguinte().proximaCasa(castelo, volta, movimentos - 1);
	}

	public Casa proximaCasa(Castelo castelo, boolean volta, int CasaAndar) {

		if (this.possuiPeca()) {
			if (this.getPeca().getNivel() > castelo.getNivel() && this.getPeca().getCor() != castelo.getCor())
				return super.getCasaAnterior();
		}

		if (CasaAndar > 0)
			return super.getCasaSeguinte().proximaCasa(castelo, volta, CasaAndar - 1);

		return this;

	}
}
