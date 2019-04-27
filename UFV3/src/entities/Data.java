
package entities;


public class Data {
    
    private int dia, mes, ano;
    private boolean trintaE1;
    
    public Data(){        
    }
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {   
        this.dia = dia;
        if(dia == 31){
            this.trintaE1 = true;
        }        
    }

    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {

        System.out.println("MES QUE CE FALOU PORRA"+ mes);
        if(trintaE1 == true){
            if(this.getMes() == 1 || this.getMes()== 3 || this.getMes()== 5 || this.getMes()== 7 || 
                    this.getMes()== 8 || this.getMes() == 10){
                this.mes = mes;
            }else{
                System.out.println("Mes informado é inválido: " + mes );
            }
        }else if(this.getMes() == 4 || this.getMes() == 6 || this.getMes() == 9 || this.getMes() == 11) {
            this.mes = mes;
        }else{
            System.out.println("Mes informado é inválido: " + mes);
        }
        

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 0){
            this.ano = ano;
        }else{
            System.out.println("Ano inválido. Menor que ZERO.");
        }
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", trintaE1=" + trintaE1 + '}';
    }
    
    
    
    
}
