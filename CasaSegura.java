
/**
 * Escreva a descrição da classe CasaSegura aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CasaSegura extends Casa
{
    private String corDaCasa;
	private int movimentos;

	public CasaSegura(String corDaZonaSegura,Casa casa) {
		super();
		corDaCasa = corDaZonaSegura;
	}

	public Casa proximaCasa(Castelo castelo, boolean curupira, Dado[] dados) {
		if (castelo.getNivel() == 1)
			movimentos = dados[0].getValor() + dados[1].getValor();
		else
			movimentos = Math.min(dados[0].getValor(), dados[1].getValor());

		if (castelo.getCor() == corDaCasa) {
			return super.getCasaSegura().proximaCasa(castelo, curupira, movimentos - 1);
		}

		return super.getCasaSeguinte().proximaCasa(castelo, curupira, movimentos - 1);
	}

	public Casa proximaCasa(Castelo castelo, boolean curupira, int casasAAndar) {

		if (this.possuiPeca()) {
			if (this.getPeca().getNivel() > castelo.getNivel() && this.getPeca().getCor() != castelo.getCor())
				return super.getCasaAnterior();
		}

		if (casasAAndar > 0) {
			if (castelo.getCor() == corDaCasa) {
				return super.getCasaSegura().proximaCasa(castelo, curupira, casasAAndar - 1);
			}

			return super.getCasaSeguinte().proximaCasa(castelo, curupira, casasAAndar - 1);
		}

		return this;
	}
}
