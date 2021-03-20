
import model.FilaBanco;


public class Main {

    public static void main(String[] args) {
        FilaBanco fila = new FilaBanco();//instancia um objeto FilaBanco
        
        //Adiciona 5 nomes
        fila.addClientes("Juliana");
        fila.addClientes("Pedro");
        fila.addClientes("Carlos");
        fila.addClientes("Larissa");
        fila.addClientes("João");
        
        //Imprime os nomes adicionados
        System.out.println("\n"  + fila.getClientes());
        
        //Imprime o primeiro item sem removê-lo
        System.out.println("\n"  + fila.getClientes().peek());
        System.out.println(fila.getClientes());
        
        //Imprime o primeiro item removendo-o
        System.out.println("\n"  + fila.getClientes().poll());
        System.out.println(fila.getClientes());
        
        //Adiciona Daniel e verifica sua posição
        fila.addClientes("Daniel");
        System.out.println("\n"  + fila.getClientes());
        
        //Imprime o tamanho da fila
        System.out.println("\n"  + fila.getClientes().size());
        
        //Verifica se a lista está vazia
        boolean taVazio = fila.getClientes().isEmpty();
        System.out.println("\n"  + taVazio);
        
        //Verifica se "Carlos" está na fila
        boolean temIsso = fila.getClientes().contains("Carlos");
        System.out.println("\n"  + temIsso);
    }
    
}
