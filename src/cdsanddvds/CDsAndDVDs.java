/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cdsanddvds;

import classes.CD;
import classes.DVD;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class CDsAndDVDs {
    
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean running = true;
        String option;
        
        ArrayList<CD> cds = new ArrayList();
        ArrayList<DVD> dvds = new ArrayList();
        
        do {
            System.out.println("* * * * * * * * * * * * * * * ");
            System.out.println(" Selecione o que deseja fazer ");
            System.out.println("* * * * * * * * * * * * * * * ");
            System.out.println("[1] Cadastrar novo CD");
            System.out.println("[2] Cadastrar novo DVD");
            System.out.println("[3] Listar todas as midias");
            System.out.println("[4] Finalizar programa");
            option = scanner.nextLine();
            
            switch (option) {
                case "1":
                    CD cd = new CD(0, 0, "", 0);
                    
                    cd.inserirDados();
                    
                    cds.add(cd);
                    break;
                    
                case "2":
                    DVD dvd = new DVD(0, 0, "", 0);
                    
                    dvd.inserirDados();
                    
                    dvds.add(dvd);
                    break;
                    
                case "3":
                    System.out.println("* * * * * * * * ");
                    System.out.println("Listagem de DVDs");
                    System.out.println("* * * * * * * * ");
                    
                    for (int i = 0; i < dvds.size(); i++) {
                        DVD selectedDvd = dvds.get(i);
                        
                        selectedDvd.printDados();
                    }
                    
                    System.out.println("* * * * * * * *");
                    System.out.println("Listagem de CDs");
                    System.out.println("* * * * * * * *");
                    
                    for (int i = 0; i < dvds.size(); i++) {
                        CD selectedCd = cds.get(i);
                        
                        selectedCd.printDados();
                    }
                    break;
                    
                case "4":
                    running = false;
                    break;
                    
                default:
                    break;
            }
        } while (running);   
    }
    
}
