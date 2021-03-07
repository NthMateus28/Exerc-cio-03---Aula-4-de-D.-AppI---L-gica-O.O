
package exercício.pkg03.aula.pkg4.de.d.appi.lógica.o.o;

import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       Cliente nl = new Cliente();
       
        System.out.println("Digite seu nome:");
        nl.nome = ler.nextLine();
        
        
        System.out.println("Digite sua Idade:");
        nl.setIdade (ler.nextInt());
        
        System.out.println(nl.verificarNumero());
        
        
        
        
        System.out.println("Digite sua Renda:");
        nl.setRenda ((int) ler.nextDouble());
        
        System.out.println(nl.verificarNumero());
    }
    
}
