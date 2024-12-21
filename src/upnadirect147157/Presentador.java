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
        while(!new Cliente(anioNacimiento, salario).usuarioValido()){
            vista.falloCliente();
            anioNacimiento = vista.consultarAnioNacimiento();
            salario = vista.consultarSalario();
        }
        return new Cliente(anioNacimiento, salario);  
    }
    
    public Bien datosBien(){
        String tipo = vista.consultarTipo();
        int valor = vista.consultarValor();
        while(!new Bien(tipo, valor).bienValido()){
            vista.falloCliente();
            tipo = vista.consultarTipo();
            valor = vista.consultarValor();
        }
        return new Bien(tipo, valor);
    }
}
