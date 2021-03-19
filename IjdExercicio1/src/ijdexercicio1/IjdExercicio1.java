package ijdexercicio1;

import classes.Carro;
import java.util.Scanner;

public class IjdExercicio1 {

    public static void main(String[] args) {
       Carro objCarro = new Carro();
       Scanner entrada = new Scanner(System.in);
       
       int qtde = objCarro.getQuantidade();
       int opcao;
       
       do{
           System.out.println("\nDigite 1 para adicionar");
           System.out.println("Digite 2 para remover");
           System.out.println("Digite 3 para sair");
           opcao = entrada.nextInt();
           switch(opcao){
               case 1:
                    System.out.println("Quantas pessoas deseja adicionar?");
                    qtde += entrada.nextInt();
                    break;
               case 2:
                    System.out.println("Quantas pessoas deseja remover");
                    qtde -= entrada.nextInt();
                    break;
               case 3:
                    break;
           }
           System.out.println("\nO carro tem " + qtde + " pessoas");
       }while (opcao < 3);
    }
    
}
