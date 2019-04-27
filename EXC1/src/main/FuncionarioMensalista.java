package main;


public class FuncionarioMensalista extends Funcionario{
    
    private Double salarioMensal;    

    public FuncionarioMensalista(){        
    }
    
    public FuncionarioMensalista(Double salarioMensal, String nome, int matricula) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
       public void imprimir(){
           super.imprimir();
           System.out.printf("Salario Mensal:%f", this.salarioMensal);
       }
}
