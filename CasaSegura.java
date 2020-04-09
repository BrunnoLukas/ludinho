
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

    	public CasaSegura(String cor, Casa anterior) {
            super(cor, anterior);
        }


    	public Casa proximaCasa(Castelo castelo, boolean volta, Dado[] dados) {
            if (castelo.getNivel() == 1)
                movimentos = dados[0].getValor() + dados[1].getValor();
            else
                movimentos = Math.min(dados[0].getValor(), dados[1].getValor());
    
            if (volta) {
                if (super.getCasaAnterior() != null)
                    return super.getCasaAnterior().proximaCasa(castelo, volta, movimentos - 1);
                else {
                    volta = false;
                    return super.getCasaSeguinte().proximaCasa(castelo, volta, movimentos - 1);
                }
            }
    
            if (super.ehCasaFinal()) {
                return this;
            }
    
            return super.getCasaSeguinte().proximaCasa(castelo, volta, movimentos - 1);
        }
    
        public Casa proximaCasa(Castelo castelo, boolean volta, int CasaAndar) {
            if (CasaAndar > 0) {
                if (volta) {
                    if (super.getCasaAnterior() != null)
                        return super.getCasaAnterior().proximaCasa(castelo, volta, CasaAndar - 1);
                    else {
                        volta = false;
                        return super.getCasaSeguinte().proximaCasa(castelo, volta, CasaAndar - 1);
                    }
                }
    
                if (super.ehCasaFinal()) {
                    volta = true;
                    return super.getCasaAnterior().proximaCasa(castelo, volta, CasaAndar - 1);
                }
    
                return super.getCasaSeguinte().proximaCasa(castelo, volta, CasaAndar - 1);
            }
    
            return this;
        }
}
