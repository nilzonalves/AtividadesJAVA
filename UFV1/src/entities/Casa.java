
package entities;

public class Casa extends Porta{

    Porta porta1 = new Porta(true, "vermelho", 2.30, 1.20);
    Porta porta2 = new Porta(false, "azul", 2.15, 1.10);
    Porta porta3 = new Porta(true, "cinza", 2.20, 1.15);

    public Casa(){
        super();
    }

    public Casa(boolean aberta, String cor, double altura, double largura) {
        super(aberta, cor, altura, largura);
    }

    @Override
    public String toString() {
        return "Casa{" + "porta1=" + porta1 + ", porta2=" + porta2 + ", porta3=" + porta3 + '}';
    }
    

    
}
