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
public class No {
    private final int chave;
    ArvoreData cont = new ArvoreData();
    No pai;
    No esq;
    No dir;
    int altura = 0;

    public No(int chave) {
        this.chave = chave;
    }
    
    public int getChave(){
        return this.chave;
    }
    
    public static int altura(No no){
        if(no == null) return -1;
        return no.altura;
    }
          
    int fatorBalanceamento(){
        return altura(this.esq) - altura(this.dir);
    }
    
    void incluir(Venda v){
        this.cont.incluir(v);
    }
    
    
}
