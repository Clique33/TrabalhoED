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
public class ArvoreData {
    private NoData raiz;
    int tamanho;

    public ArvoreData(){
        this.raiz = null;
        this.tamanho = 0;
    }
    
    public int getChave(){
        if(raiz==null) return Integer.MIN_VALUE;
        return raiz.getChave();
    }
    
    public void incluir(Venda v){
        tamanho++;
        if(raiz == null) raiz = new NoData(v);
        else this.incluir(raiz,v);
    }
    
    private void incluir(NoData atual, Venda v){
        if(atual == null) return;
        
        boolean b = atual.cont.getChave(false) > v.getChave(false);
        NoData novo;
        
        if(b){
            if(atual.esq == null){
                novo = new NoData(v);
                atual.esq = novo;
                novo.pai = atual;
            }
            else incluir(atual.esq,v);
        }else{
            
            if(atual.dir == null){
                novo = new NoData(v);
                atual.dir = novo;
                novo.pai = atual;
            }
            else incluir(atual.dir,v);
        }
        atual.altura = Math.max(NoData.altura(atual.dir),NoData.altura(atual.esq))+1;
        int fb = atual.fatorBalanceamento();
        
        if(Math.abs(fb) > 1){
            //balanceia
        }
    }
    
    public void imprime(){
        this.imprime(raiz);
    }
    
    private void imprime(NoData atual){
        if(atual == null) return;
        
        System.out.print("||" + atual + "||\n");
        this.imprime(atual.esq);
        this.imprime(atual.dir);
    }
    
    @Override
    public String toString(){
        return this.toString(raiz,"");
    }
    
    private String toString(NoData atual, String res){
        if(atual == null) return res;
        res += atual;
        this.toString(atual.esq,res);
        this.toString(atual.dir,res);
        return res;
    }
    
}
