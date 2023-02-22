
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        
        Fatura fatura = new Fatura(cliente.getNome());
        
        while (true) {
            System.out.print("Informe o nome do item (ou digite 'sair' para finalizar): ");
            String nomeItem = scanner.nextLine();
            
            if (nomeItem.equals("sair")) {
                break;
            }
            
            System.out.print("Informe o preço por unidade: ");
            double preco = scanner.nextDouble();
            
            System.out.print("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            
            scanner.nextLine();
            
            ItemVendido item = new ItemVendido(nomeItem, preco, quantidade);
            fatura.adicionarItem(item);
        }
        
        System.out.println("Fatura para " + fatura.getNomeCliente());
        System.out.println("Data: " + fatura.getData());
        System.out.println("Item\t\tPreço por unidade\tQuantidade\tTotal");
        
        for (ItemVendido item : fatura.getItens()) {
            System.out.println(item.getNome() + "\t\t" + item.getPreco() + "\t\t" + item.getQuantidade() + "\t\t" + item.getTotal());
        }
        
        System.out.println("\t\t\t\t\tTotal: " + fatura.getTotal());
        
    }}