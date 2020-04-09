public class CasaEntrada extends Casa {

	private String corDaEntrada;
	private int movimentos;

	public CasaEntrada(String corDaZonaSegura) {
		super(corDaZonaSegura);
		corDaEntrada = corDaZonaSegura;
	}

	public Casa proximaCasa(Castelo castelo, boolean volta, Dado[] dados) {
		if (castelo.getNivel() == 1)
			movimentos = dados[0].getValor() + dados[1].getValor();
		else
			movimentos = Math.min(dados[0].getValor(), dados[1].getValor());

		if (castelo.getCor() == corDaEntrada) {
			return super.getCasaSegura().proximaCasa(castelo, volta, movimentos - 1);
		}

		return super.getCasaSeguinte().proximaCasa(castelo, volta, movimentos - 1);
	}

	public Casa proximaCasa(Castelo castelo, boolean volta, int CasaAndar) {

		if (this.possuiPeca()) {
			if (this.getPeca().getNivel() > castelo.getNivel() && this.getPeca().getCor() != castelo.getCor())
				return super.getCasaAnterior();
		}

		if (CasaAndar > 0) {
			if (castelo.getCor() == corDaEntrada) {
				return super.getCasaSegura().proximaCasa(castelo, volta, CasaAndar - 1);
			}

			return super.getCasaSeguinte().proximaCasa(castelo, volta, CasaAndar - 1);
		}

		return this;
	}
}
