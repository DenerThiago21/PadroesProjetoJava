import java.util.Scanner;

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Padrão Strategy
         */
        ////////////////////////////////////////////////////////////////
        /* int cont = 0;

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
    
        Robo robo = new Robo();
    
        while(cont < 15) {
            if (cont < 5) {
                robo.setComportamento(normal);
                robo.mover();
            } else if (cont >= 5 && cont < 10) {
                robo.setComportamento(defensivo);
                robo.mover();
            } else {
                robo.setComportamento(agressivo);
                robo.mover();
            }
            cont ++;
        }*/


        ////////////////////////////////////////////////////////////////
        /**
         * Padrão Singleton
         */
        /*SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder2);*/

        ///////////////////////////////////////////////////////////////////
        /**
         * Padrao Facade
         */
        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "89158720");

    }
}
