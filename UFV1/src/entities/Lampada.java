
package entities;


public class Lampada {
    
    private boolean estadoDaLampada;
    
    public void acender(){
        this.estadoDaLampada = true;
    }
    
    public void apagar(){
        this.estadoDaLampada = false;
    }
    
    public boolean exibirEstado(){
        return this.estadoDaLampada;
    }
    
}
