package model;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }
    
    public double calculaImposto(){
        return this.salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
