
/**
 * Escreva a descrição da classe Castelo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Castelo extends Peca
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    
    // Casa na qual a peça se encontra
    private Casa casa;
    
    private final String Cor;
    
    private int nivel;
    
    
    /**
     * Construtor padrão para peças.
     * @param cor Cor da peça
     */
    
    public Castelo(String cor) {
        super(cor);
        this.Cor = cor;
        this.casa = null;
        
    }
    
    /**
     * Cor da peça.
     * @return Cor da peça.
     */
    public String getCor() {
        return Cor;
    }
    
    /**
     * Casa na qual a peça se encontra.
     * @return Casa na qual a peça se encontra.
     */
    public Casa getCasa() {
        return casa;
    }
    
    public int getNivel(){
        nivel = 0;
        casa.getPeca();
        casa.getQuantidadePecas();
        return nivel;
    }
    
    /**
     * Retira a peça da casa atual e coloca-a na casa de destino.
     * @param casaDestino 
     */
    public void mover(Casa casaDestino) {
        if (casa != null) {
            casa.setCastelo(null);
        }
        casaDestino.setCastelo(this);
        casa = casaDestino;
    }
}
