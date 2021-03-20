
import java.util.Collections;
import moldel.ListNomes;


public class Main {

    public static void main(String[] args) {
        ListNomes lista = new ListNomes();//instancia um objeto ListaNomes
        
        //adiciona 5 nomes a lista
        lista.addNome("Juliana");
        lista.addNome("Pedro");
        lista.addNome("Carlos");
        lista.addNome("Larissa");
        lista.addNome("João");
        
        //Imprime os nomes adicionados
        System.out.println(lista.getNomes());
        
        //Substitui "Carlos" por "Roberto"
        lista.getNomes().set(2, "Roberto");
        System.out.println("\n" + lista.getNomes());
        
        //Imprime o elemento que está na posição 1
        System.out.println("\n" + lista.getNomes().get(1));
        
        //Remove o nome da posião 4
        lista.getNomes().remove(4);//forma de remover pelo índice
        //Remove "João"
        lista.getNomes().remove("João");//forma de remover pelo nome
        System.out.println("\n" + lista.getNomes());
        
        //Imprime a quantidade de itens da lista
        System.out.println("\n" + lista.getNomes().size());
        
        //Verifica se "Juliano" existe na lista
        boolean temIsso = lista.getNomes().contains("Juliano");
        System.out.println("\n" + temIsso);
        //Cria uma nova lista
        ListNomes lista2 = new ListNomes();
        lista2.addNome("Ismael");
        lista2.addNome("Rodrigo");
        //Adiciona os itens da nova lista à primeira
        for(int i = 0; i < lista2.getNomes().size(); i++){
        lista.addNome(lista2.getNomes().get(i));
        }
        System.out.println("\n" + lista.getNomes());
        // Ordena os itens por ordem alfabética
        Collections.sort(lista.getNomes());
        System.out.println("\n" + lista.getNomes());
        //Verifica se a lista está vazia
        boolean vazia = lista.getNomes().isEmpty();
        System.out.println("\n" + vazia);
    }
    
}
