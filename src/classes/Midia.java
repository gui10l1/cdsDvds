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
public class Midia {
    static Scanner scanner = new Scanner(System.in);
    
    private int codigo;
    
    private double preco;
    
    private String nome;
    
    public Midia(
        int codigo,
        double preco,
        String nome
    ) {
        this.setCodigo(codigo);
        this.setPreco(preco);
        this.setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void printDados() {
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Preco: "+this.getPreco());
        System.out.println("Nome: "+this.getNome());
    }
    
    public void inserirDados() {
        System.out.print("Insira o nome da midia: ");
        this.setNome(this.scanner.nextLine());
        
        System.out.print("Digite o preco da midia: ");
        this.setPreco(Integer.parseInt(this.scanner.nextLine()));
        
        System.out.print("Insira o codigo da midia: ");
        this.setCodigo(Integer.parseInt(this.scanner.nextLine()));
    }
}
