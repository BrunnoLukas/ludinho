public class CasaGuarita extends Casa {
    private Tabuleiro tabuleiro;
    public CasaGuarita(Guarita guarita) {
        super(guarita);
    }

    public Casa proximaCasa(Castelo castelo, boolean volta, Dado[] dados) {
        if (dados[0].getValor() == dados[1].getValor())
            return tabuleiro.getCasaInicio(this.getCor());
        return this;
    }
 
    public Casa proximaCasa(Castelo castelo, boolean volta, int CasaAndar) {
        // shall never be reached
        return this;
    }
}
