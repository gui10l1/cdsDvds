/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class DVD extends Midia {
    private int nFaixas;
    
    public DVD(
        int codigo,
        double preco,
        String nome,
        int nFaixas
    ) {
        super(codigo, preco, nome);
        this.setnFaixas(nFaixas);
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    @Override()
    public void printDados() {
        super.printDados();
        System.out.println("Numero de faixas: "+this.getnFaixas());
    }
    
    @Override()
    public void inserirDados() {
        super.inserirDados();
        
        System.out.print("Insira o numero de faixas para "+super.getNome()+": ");
        this.setnFaixas(Integer.parseInt(this.scanner.nextLine()));
    }
}
