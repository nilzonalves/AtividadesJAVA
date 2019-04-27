
package main;

public class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setMatricula(int mat){
        this.matricula = mat;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void imprimir(){
        System.out.printf("Nome:%s\n", this.nome);
        System.out.printf("Matricula:%d\n", this.matricula);
    }
    
}
