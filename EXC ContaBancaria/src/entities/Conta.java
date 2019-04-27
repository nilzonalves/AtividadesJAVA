
package entities;

public class Conta {
    
    private int numConta;
    private String nome;
    private double valorInicial;
    private double saldo;
    
    public Conta(){
    }

    public Conta(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }
    
    public Conta(int numConta, String nome, double depositoInicial){
        this.numConta = numConta;
        this.nome = nome;
        depositar(depositoInicial);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0 ){
            this.saldo += valor;
        }        
    }
    
    public void sacar(double valor){
        this.saldo -= valor + 5;
    }
    
    @Override
    public String toString(){
        return "Account " + numConta+ ", Holder: " + nome + ", Balance: $" + String.format("%.2f", saldo);
    }

}
