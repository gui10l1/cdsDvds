/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class CD extends Midia {
    static Scanner scanner = new Scanner(System.in);
    
    private int nMusicas;
    
    public CD(
        int codigo,
        double preco,
        String nome,
        int nMusicas
    ) {
        super(codigo, preco, nome);
        this.setnMusicas(nMusicas);
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    
    @Override()
    public void printDados() {
        super.printDados();
        System.out.println("Numero de musicas: "+this.getnMusicas());
    }
    
    @Override()
    public void inserirDados() {
        super.inserirDados();
        
        System.out.print("Insira o numero de musicas para "+super.getNome()+": ");
        this.setnMusicas(Integer.parseInt(this.scanner.nextLine()));
    }
}
