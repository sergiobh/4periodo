
package Compra;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Compra {

    public  enum TipoDePagamento {
        A_VISTA, PARCELADO
    }

    private TipoDePagamento tipoDePagamento;
    private List<ItemDeCompra> itensDeCompra;

    public Compra() {
        itensDeCompra = new LinkedList<ItemDeCompra>();
        tipoDePagamento = TipoDePagamento.A_VISTA;
    }

    public boolean AdicionarItemNaCompra(ItemDeCompra novoItem) {
        return this.itensDeCompra.add(novoItem);
    }

    public double ValorDoDesconto() {
        double valorDoDesconto = 0;
        ListIterator<ItemDeCompra> litr = this.itensDeCompra.listIterator();
        while (litr.hasNext()) {
            ItemDeCompra  itemDeCompra = (ItemDeCompra) litr.next();

            switch (tipoDePagamento) {
                case A_VISTA:
                    valorDoDesconto =+ 0.15 * (itemDeCompra.getQuantidade() * itemDeCompra.getValorUnitario());
                    break;
                case PARCELADO:
                    break;
            }
        }
        return valorDoDesconto;
    }

    public void setTipoDePagamento(TipoDePagamento tipoDePagamento){
        this.tipoDePagamento = tipoDePagamento;
    }

}
