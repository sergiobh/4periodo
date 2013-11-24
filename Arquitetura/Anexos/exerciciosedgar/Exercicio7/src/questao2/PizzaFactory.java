/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author edgard.cardoso
 */
public class PizzaFactory {
    public enum TipoPizza{
        QUATROQUEIJOS, AMODA, PORTUGUESA;
    }
    public Pizza criarPizza(TipoPizza tipoPizza){
        switch (tipoPizza){
            case QUATROQUEIJOS:
                return new QuatroQueijos();
            case AMODA:
                return new AModa();
            case PORTUGUESA:
                return new Portuguesa();
            default:
                return null;
        }
    }
    
}
