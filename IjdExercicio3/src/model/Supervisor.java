package model;

public class Supervisor extends Funcionario {
    
    public Supervisor(double salario) {
        super(salario);
    }
    
    public double calculaImposto(){
        return this.getSalario() *(0.05/100);
    }
}
