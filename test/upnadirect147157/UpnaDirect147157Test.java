/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect147157;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class UpnaDirect147157Test {
    
    public UpnaDirect147157Test() {
    }
    
    
     @Test
    public void testVehiculoValido() {
        // Vehículo con valor dentro del rango permitido
        Bien vehiculo = new Bien("vehiculo", 50000);
        assertTrue(vehiculo.bienValido());
    }
    
    
    @Test
    public void testVehiculoNoValido() {
        // Vehículo con valor fuera del rango permitido
        Bien vehiculo = new Bien("vehiculo", 60000);
        assertFalse(vehiculo.bienValido());
    }
    
    @Test
    public void testViviendaValida() {
        // Vehículo con valor fuera del rango permitido
        Bien vivienda = new Bien("vivienda", 120000);
        assertTrue(vivienda.bienValido());
    }
    
    @Test
    public void testViviendaNoValida() {
        // Vehículo con valor fuera del rango permitido
        Bien vivienda = new Bien("vivienda", 30000);
        assertFalse(vivienda.bienValido());
    }
    
    @Test
    public void testBienNoValida() {
        // Vehículo con valor fuera del rango permitido
        Bien bien = new Bien("armario", 30000);
        assertFalse(bien.bienValido());
    }
    
    
    
    
}
