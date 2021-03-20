
package model;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    Queue clientes = new LinkedList<>();

    public Queue getClientes() {
        return clientes;
    }

    public void setClientes(Queue clientes) {
        this.clientes = clientes;
    }
    
    public void addClientes(String c){
        clientes.add(c);
    }
}
