/**
 * Implementa as mecânicas e regras do jogo Ludo.
 *
 * @author Alan Moraes / alan@ci.ufpb.br
 * @author Victor Koehler / koehlervictor@cc.ci.ufpb.br
 */

public class Jogo {

    // Tabuleiro do jogo
    private final Tabuleiro tabuleiro;
    
    // Dados do jogo.
    private final Dado[] dados;
    int vez=0;
    /**
     * Construtor padrão do Jogo Ludo.
     * Isto é, um jogo de Ludo convencional com dois dados.
     */
    public Jogo() {
        this(2);
    }
    
    /**
     * Construtor do Jogo Ludo para inserção de um número arbitrário de dados.
     * @param numeroDados Número de dados do jogo.
     */
    public Jogo(int numeroDados) {
        this.tabuleiro = new Tabuleiro();
        this.dados = new Dado[numeroDados];
        
        for (int i = 0; i < this.dados.length; i++) {
            // remover parâmetro do construtor para dado não batizado
            this.dados[i] = new Dado(i);
        }

        inicializaJogo();
    }

    /**
     * Construtor do Jogo Ludo para inserção de dados arbitrários.
     * Útil para inserir dados "batizados" e fazer testes.
     * @param dados Dados
     */
    public Jogo(Dado[] dados) {
        this.tabuleiro = new Tabuleiro();
        this.dados = dados;
        assert dados.length > 0; // TO BE REMOVED

        inicializaJogo();
    }

    
    
    
    private void inicializaJogo() {

        // AQUI SUGERE-SE QUE SE INSIRA A INICIALIZAÇÃO DO JOGO
        // ISTO É, A INSERÇÃO DAS PEÇAS NO TABULEIRO E AS DEFINIÇÕES DOS CAMPOS
        // SE NECESSÁRIO, MODIFIQUE A ASSINATURA DO MÉTODO
        
        
        
        //
        // TRECHO DE EXEMPLO
        //
        
        
        // Vamos inicializar a guarita verde colocando as 4 peças do jogador verde nela.
        //
        // Guarita = espaço onde fica as peças fora do jogo;
        // Consulte a imagem "referencia.png" acompanhada na pasta dessa classe.
        Guarita guarita;
        
        guarita = tabuleiro.getGuarita("VERDE");
        for (Casa casaGuarita : guarita.getTodasAsCasas()) {
            Peca novaPeca = new Peca("VERDE");
            novaPeca.mover(casaGuarita);
        }
        
        guarita = tabuleiro.getGuarita("VERMELHO");
        for (Casa casaGuarita : guarita.getTodasAsCasas()) {
            Peca novaPeca = new Peca("VERMELHO");
            novaPeca.mover(casaGuarita);
        }
        
        guarita = tabuleiro.getGuarita("AMARELO");
        for (Casa casaGuarita : guarita.getTodasAsCasas()) {
            Peca novaPeca = new Peca("AMARELO");
            novaPeca.mover(casaGuarita);
        }
        
        guarita = tabuleiro.getGuarita("AZUL");
        for (Casa casaGuarita : guarita.getTodasAsCasas()) {
            Peca novaPeca = new Peca("AZUL");
            novaPeca.mover(casaGuarita);
        }
        

        // Obtemos uma das peças verdes que inicializamos logo acima para usa-la como exemplo.
        // Movemos ela para a casa de inicio do jogador verde.
       
        Casa casaGuarita;
        Casa casaInicio;
        Peca peca;
                
        

        
        
        // Apenas como um exemplo adicional, colocamos uma peça azul no tabuleiro.
        
       
        
        //
        // TRECHO DE EXEMPLO
        //
    }

    /**
     * Método invocado pelo usuário através da interface gráfica ou da linha de comando para jogar os dados.
     * Aqui deve-se jogar os dados e fazer todas as verificações necessárias.
     */
    public void rolarDados() {
        // AQUI SE IMPLEMENTARÁ AS REGRAS DO JOGO.
        // TODA VEZ QUE O USUÁRIO CLICAR NO DADO DESENHADO NA INTERFACE GRÁFICA,
        // ESTE MÉTODO SERÁ INVOCADO.
        
        
        //
        // TRECHO DE EXEMPLO
        //
        
        // Aqui percorremos cada dado para lançá-lo individualmente.
        for (Dado dado : dados) {
            dado.rolar();
        }
        
    }
    
    /**
     * Método invocado pelo usuário através da interface gráfica ou da linha de comando quando escolhida uma peça.
     * Aqui deve-se mover a peça e fazer todas as verificações necessárias.
     * @param casa Casa escolhida pelo usuário/jogador.
     */
    public void escolherCasa(Casa casa) {

        // AQUI SE IMPLEMENTARÁ AS REGRAS DO JOGO.
        // TODA VEZ QUE O USUÁRIO CLICAR EM UMA CASA DESENHADA NA INTERFACE GRÁFICA,
        // ESTE MÉTODO SERÁ INVOCADO.
        
        if(this.dados[0].getValor() == this.dados[1].getValor()){
              if (casa.pertenceGuarita()){
                 Guarita guarita;
                 Casa casaGuarita;
                 Casa casaInicio;
                 Peca peca;
                 
                 guarita = tabuleiro.getGuarita(getJogadorDaVez());
                 casaInicio = tabuleiro.getCasaInicio(getJogadorDaVez());
                 casaGuarita = casa;
                 
                 if(casa == guarita.getCasa(0)){
                     guarita = tabuleiro.getGuarita(getJogadorDaVez());
                     casaGuarita = guarita.getCasa(0);
                     peca = casaGuarita.getPeca();
                     casaInicio = tabuleiro.getCasaInicio(getJogadorDaVez());
                     peca.mover(casaInicio);
                 }
                 if(casa == guarita.getCasa(1)){
                     guarita = tabuleiro.getGuarita(getJogadorDaVez());
                     casaGuarita = guarita.getCasa(1);
                     peca = casaGuarita.getPeca();
                     casaInicio = tabuleiro.getCasaInicio(getJogadorDaVez());
                     peca.mover(casaInicio);
                 }
                 if(casa == guarita.getCasa(2)){
                     guarita = tabuleiro.getGuarita(getJogadorDaVez());
                     casaGuarita = guarita.getCasa(2);
                     peca = casaGuarita.getPeca();
                     casaInicio = tabuleiro.getCasaInicio(getJogadorDaVez());
                     peca.mover(casaInicio);
                 }
                 if(casa == guarita.getCasa(3)){
                     guarita = tabuleiro.getGuarita(getJogadorDaVez());
                     casaGuarita = guarita.getCasa(3);
                     peca = casaGuarita.getPeca();
                     casaInicio = tabuleiro.getCasaInicio(getJogadorDaVez());
                     peca.mover(casaInicio);
                 }
                 
                 peca = casa.getPeca();
                 Peca pecab;
                 Casa casaInicioOcupada;
                 casaInicioOcupada = tabuleiro.getCasaInicio(peca.getCor());
                 pecab =  casaInicioOcupada.getPeca();
                  
                 if(casaInicio != null && peca.getCor() != pecab.getCor()){
                    Guarita guaritaduo;
                    Casa Casaguaritaduo;
                    guaritaduo = tabuleiro.getGuarita(pecab.getCor());
                    System.out.println("entrou aqui + " + pecab.getCor());
                    
                    pecab = casaInicio.getPeca();
                    //testando casa casa da guarita para por a peça
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == true){
                            if(guaritaduo.getCasa(2).possuiPeca() == true){
                                if(guaritaduo.getCasa(3).possuiPeca() == false){
                                    pecab.mover(guaritaduo.getCasa(3));
                                }
                            }
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == true){
                            if(guaritaduo.getCasa(2).possuiPeca() == false){
                                pecab.mover(guaritaduo.getCasa(2));
                                
                            }
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == false){
                            pecab.mover(guaritaduo.getCasa(1));
                           
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == false){
                        pecab.mover(guaritaduo.getCasa(0));
                        
                    }
            
            }
                 }
        }
        //
        // TRECHO DE EXEMPLO
        //
        
        // Perguntamos à casa se ela possui uma peça. 
        // Se não possuir, não há nada para se fazer.
        if (!casa.possuiPeca()) {
            return;
        }
        
        // Perguntamos à casa qual é a peça.
        Peca peca = casa.getPeca();
        if(peca.getCor()!=getJogadorDaVez()){
            return;
        }

        // Percorremos cada dado, somando o valor nele à variável somaDados.
        int somaDados = 0;
        for (Dado dado : dados) {
            somaDados += dado.getValor();
        }
        
        // Percorreremos N casas.
        Casa proximaCasa = casa;
        Casa casaSegura = casa;
        Casa anterior  = casa;
        int i = 0;
        for (int count = i ; i < somaDados && proximaCasa != null; i++) {
            proximaCasa = proximaCasa.getCasaSeguinte(); 
            casaSegura = proximaCasa.getCasaSegura();
            anterior = proximaCasa.getCasaAnterior();
            
            if(proximaCasa.ehEntradaZonaSegura() == true && casaSegura.getCor() == peca.getCor()){
                proximaCasa = proximaCasa.getCasaSeguinte();;
                    for (count = i; i < somaDados && proximaCasa != null; i++){
                        proximaCasa = casaSegura;
                        i++;
                }
                i++;
            } 
            if(proximaCasa.ehCasaFinal() == true && proximaCasa == proximaCasa.getCasaSegura()){
                for (count = i; i < somaDados; i++){
                    proximaCasa = proximaCasa.getCasaAnterior();
                
                    i++;
                    if(anterior.ehEntradaZonaSegura() == true && casaSegura.getCor() == peca.getCor()){
                        proximaCasa = proximaCasa.getCasaSegura();
                        for (count = i; i < somaDados && proximaCasa != null; i++){
                            proximaCasa = proximaCasa.getCasaSegura();
                            i++;
                        }
                        i++;
                    }
                }   
            if(i == somaDados && proximaCasa.ehCasaFinal() == true){
                    for (count = i ; i < somaDados && proximaCasa != null; i++) {
                        proximaCasa = proximaCasa.getCasaSegura();
                    }
            }
            }
            
        }
        
        // casaSegura.getCor() == peca.getCor() && somaDados < i
           Peca pecab = proximaCasa.getPeca();
     
        
            if (proximaCasa != null && proximaCasa.possuiPeca() == false){
                peca.mover(proximaCasa);
                vez++;
               if (vez==4){
                    vez = 0;
                }
                
                System.err.println(vez);
               
               
            }
            
             //"Comendo" a peça quando ela for de cor diferente.
            else if(peca.getCor() != pecab.getCor()){
                    peca.mover(proximaCasa);
                    vez++;
                    Guarita guaritaduo;
                    Casa Casaguaritaduo;
                    guaritaduo = tabuleiro.getGuarita(pecab.getCor());
                    //testando casa casa da guarita para por a peça
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == true){
                            if(guaritaduo.getCasa(2).possuiPeca() == true){
                                if(guaritaduo.getCasa(3).possuiPeca() == false){
                                    pecab.mover(guaritaduo.getCasa(3));
                                    peca.mover(proximaCasa);
                                }
                            }
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == true){
                            if(guaritaduo.getCasa(2).possuiPeca() == false){
                                pecab.mover(guaritaduo.getCasa(2));
                                peca.mover(proximaCasa);
                            }
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == true){
                        if(guaritaduo.getCasa(1).possuiPeca() == false){
                            pecab.mover(guaritaduo.getCasa(1));
                            peca.mover(proximaCasa);
                        }
                    }
                    if(guaritaduo.getCasa(0).possuiPeca() == false){
                        pecab.mover(guaritaduo.getCasa(0));
                        peca.mover(proximaCasa);
                    }
                }
                
             
                
            
            else {
                // // NÃO HÁ PRÓXIMA CASA!
                // // FIM DO JOGO? A PEÇA ESTÁ NA GUARITA?
                // // Descomente a próxima linha para ser notificado quando isso acontecer:
                System.err.println("Não há próxima casa!");
                // // Descomente as duas próximas linhas para verificar se a peça está na guarita:
                if (casa.pertenceGuarita())
                   System.out.println("A peça está na guarita");
            }
            
            
            
            
        
    }
    
    /**
     * Retorna o jogador que deve jogar os dados ou escolher uma peça.
     * @return Cor do jogador.
     */
    public String getJogadorDaVez() {
        String retorno = "123456789";
        if (vez == 0)
        {
            retorno = "VERDE";
        }
        else if (vez == 1)
        {
            retorno = "VERMELHO";
        }
        else if (vez == 2)
        {
            retorno = "AZUL";
        }
        else if (vez == 3)
        {
            retorno = "AMARELO";         
        }
        return retorno;
    }
    
    /**
     * O tabuleiro deste jogo.
     * @return O tabuleiro deste jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    /**
     * Retorna o i-ésimo dado deste jogo entre 0 (inclusivo) e N (exclusivo).
     * Consulte getQuantidadeDeDados() para verificar o valor de N
     * (isto é, a quantidade de dados presentes).
     * @param i Indice do dado.
     * @return O i-ésimo dado deste jogo.
     */
    public Dado getDado(int i) {
        return dados[i];
    }
    
    /**
     * Obtém a quantidade de dados sendo usados neste jogo.
     * @return Quantidade de dados.
     */
    public int getQuantidadeDados() {
        return dados.length;
    }
}
