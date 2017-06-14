/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed;

/**
 *
 * @author Frog33
 */
public class MesAno {
    private static final String[] CONVERSOR = {"Jan","Fev","Mar","Abr","Mai","Jun",
                                         "Jul","Ago","Set","Out","Nov","Dez"};
    public static String MAX = "Dez/99";
    public static String MIN = "Jan/00";
    private int mes;
    private int ano;

    public MesAno(String mesAno) {
        this.mes = MesAno.find(mesAno.substring(0, 3));
        this.ano = Integer.parseInt(mesAno.substring(4));
    }
        
    private static int find(String s){
        for (int i = 0; i < MesAno.CONVERSOR.length; i++) {
            if(MesAno.CONVERSOR[i].equals(s)) return i;
        }
        return -1;
    }
    
    public int getChave(){
        return this.ano*12 + this.mes;
    }

    public int distancia(MesAno ma){
        return this.getChave()-ma.getChave();
    }
    
    public boolean ehMaior(MesAno ma){
        return this.distancia(ma) > 0;
    }
    
    //inútil aparentemente
    private void plusplus(){
        this.mes = (this.mes + 1)%12;
        if(this.mes == 0) this.ano++;
    }
    
    @Override
    public boolean equals(Object ma){
        return this.hashCode() == ((MesAno)ma).hashCode();
    }

    @Override
    public int hashCode() {
        int hash = this.getChave();
        return hash;
    }
    
    @Override
    public String toString(){
        String s;
        if(ano < 10) s = "0" + ano;
        else s = ano+"";
        return MesAno.CONVERSOR[this.mes] + "/" + s;
    }
}
