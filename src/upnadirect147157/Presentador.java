/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect147157;

import com.sun.security.ntlm.Client;

/**
 *
 * @author alumno
 */
public class Presentador {
    private final Vista vista = new Vista();
    
    public Cliente datosCliente(){
        int anioNacimiento = vista.consultarAnioNacimiento();
        int salario = vista.consultarSalario();
        if(!new Cliente(salario, anioNacimiento).clienteValido()){
            vista.falloCliente();
            return datosCliente();
        }
        return new Cliente(salario, anioNacimiento); 
        
    }
    
    public Bien datosBien(){
        String tipo = vista.consultarTipo();
        int valor = vista.consultarValor();
        if(!new Bien(tipo, valor).bienValido()){
            vista.falloBien();
            return datosBien();
        }
        return new Bien(tipo, valor);
    }
}
