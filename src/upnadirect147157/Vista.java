package upnadirect147157;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Vista {
    private final Scanner scan = new Scanner(System.in);
    
    public String consultarTipo(){
        System.out.println("Introduce el tipo del bien: ");
        String tipo = scan.nextLine();
        return tipo;
    }
    
    public int consultarValor(){
        System.out.println("Introduce el valor del bien: ");
        int valor = scan.nextInt();
        return valor;
    }
    
    public int consultarAnioNacimiento(){
        System.out.println("Introduce el año de nacimiento del cliente: ");
        int anio = scan.nextInt();
        return anio;
    }
    
    public int consultarSalario(){
        System.out.println("Introduce el salario del cliente: ");
        int slario = scan.nextInt();
        return slario;
    }
    
    
    
}
