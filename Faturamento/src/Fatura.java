import java.util.ArrayList;
import java.util.Date;

public class Fatura {
    private ArrayList<ItemVendido> itens;
    private Date data;
    private String nomeCliente;
    
    public Fatura(String nomeCliente) {
        this.itens = new ArrayList<ItemVendido>();
        this.data = new Date();
        this.nomeCliente = nomeCliente;
    }
    
    public void adicionarItem(ItemVendido item) {
        itens.add(item);
    }
    
    public ArrayList<ItemVendido> getItens() {
        return itens;
    }
    
    public Date getData() {
        return data;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public double getTotal() {
        double total = 0;
        for (ItemVendido item : itens) {
            total += item.getTotal();
        }
        return total;
    }
}