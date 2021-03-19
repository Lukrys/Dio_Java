
package model;

public class Atendente extends Funcionario {
    
    public Atendente(double salario) {
        super(salario);
    }
    
    public double calculaImposto(){
        return this.getSalario() *(0.01/100);
    }
}
