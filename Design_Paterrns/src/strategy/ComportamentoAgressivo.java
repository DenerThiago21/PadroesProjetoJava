package strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("movendo-se de forma agressiva!");        
    }
    
}