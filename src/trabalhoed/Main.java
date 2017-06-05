/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoed;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Frog33
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arvore arv = new Arvore();
        try {
            Venda v;
            Scanner s = new Scanner(new File("vendas.txt"));
            
            for (int i = 0; s.hasNext(); i++) {
                v = new Venda(s.nextInt(), s.next(),s.next(),s.nextInt());
                //System.out.println(v);
                arv.incluir(v);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Treta na hora de achar o arquivo");
        }        
        //System.out.println(arv);
        arv.imprime();
        System.out.println(arv.tamanho);
        
    }
    
}
