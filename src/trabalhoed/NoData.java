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
public class NoData {
    Venda cont;
    NoData pai;
    NoData esq;
    NoData dir;
    int altura = 0;

    public NoData(Venda cont) {
        this.cont = cont;
    }
    
    public int getChave(){
        return cont.getChave(false);
    }
    
    @Override
    public String toString(){
        String res = this.cont + " ";
        
        if(this.esq != null) res += this.esq.cont + " ";
        else res += "nil ";
        
        if(this.dir != null) res += this.dir.cont + " ";
        else res += "nil ";
        
        return res += " alt: " + this.altura;
    }
    
    public static int altura(NoData no){
        if(no == null) return -1;
        return no.altura;
    }
    
    int fatorBalanceamento(){
        return altura(this.esq) - altura(this.dir);
    }
    
}
