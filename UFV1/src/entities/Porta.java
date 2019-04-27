package entities;

public class Porta {
    
    private boolean aberta;
    private String cor;
    private double altura, largura;
    
    public Porta(){
    }

    public Porta(boolean aberta, String cor, double altura, double largura) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public void pinta(String cor){
        System.out.println("Porta pintada de: " + cor);
        this.setCor(cor);
    }
    
    public void abre(){
        this.aberta = true;
    }
    
    public void fecha(){
        this.aberta = false;
    }
    
    public boolean estaAberta(){
        return this.aberta;
    }
    
    @Override
    public String toString() {
        return "Porta{" + "aberta=" + aberta + ", cor=" + cor + ", altura=" + altura + ", largura=" + largura + '}';
    }
    
    
    
}
