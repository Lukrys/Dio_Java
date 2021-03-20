
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        
        nomes.add("Emanuelle");
        nomes.add("Wilson");
        nomes.add("Bruno");
        nomes.add("Abel");
        nomes.add("Daniela");
        nomes.add("Carlos");
        
        System.out.println(nomes);
        
        nomes.set(2, "Larissa");
        System.out.println(nomes);
        
        Collections.sort(nomes);
        nomes.set(2, "Fábio");
        System.out.println(nomes);
        
        int tamanho = nomes.size();
        System.out.println(tamanho);
        
        nomes.remove(4);
        System.out.println(nomes);
        tamanho = nomes.size();
        System.out.println(tamanho);
        
        nomes.remove("Abel");
        System.out.println(nomes);
        
        String nome = nomes.get(1);
        System.out.println(nome + "\n");
        
        Iterator<String> repete = nomes.iterator();
        
        while(repete.hasNext()){
            System.out.println("-->" + repete.next());
        }
        
    }
    
}
