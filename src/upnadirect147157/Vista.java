package upnadirect147157;

import java.time.LocalDate;
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
    
    
    public void falloCliente(){
        System.err.println("El año de nacimiento debe estar entre 1910 y " +  LocalDate.now().getYear());
    }
    
    public void falloBien(){
        System.err.println("El tipo del bien debe ser una vivienda o un vehículo");
        System.err.println("El valor máximo del vehículo es de 50.000€");
        System.err.println("El valor mínimo de la vivienda es de 50.000€");
    }
    
    
}
