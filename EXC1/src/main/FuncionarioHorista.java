
package main;


public class FuncionarioHorista extends Funcionario{
    private double valorHora;
    private int horasTrab;
    
    public FuncionarioHorista(){}
    
    public FuncionarioHorista(String nome, int matricula, double valorHora, int horasTrab){
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public void setHorasTrab(int horasTrab){
        this.horasTrab = horasTrab;
    }
    
    public int getHorasTrab(){
        return this.horasTrab;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Horas Trabalhadas:%d\n ", this.horasTrab);
        System.out.printf("Valor da Hora: %f\n", this.valorHora);
        System.out.printf("Salario:%.2f \n", (this.horasTrab)*(this.valorHora));
    }
    
}
