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
        Bien vehiculo = new Bien("vehiculo", 50000);
        assertTrue(vehiculo.bienValido());
    }
    
    
    @Test
    public void testVehiculoNoValido() {
        Bien vehiculo = new Bien("vehiculo", 60000);
        assertFalse(vehiculo.bienValido());
    }
    
    @Test
    public void testViviendaValida() {
        Bien vivienda = new Bien("vivienda", 120000);
        assertTrue(vivienda.bienValido());
    }
    
    @Test
    public void testViviendaNoValida() {
        Bien vivienda = new Bien("vivienda", 30000);
        assertFalse(vivienda.bienValido());
    }
    
    @Test
    public void testBienNoValido() {
        Bien bien = new Bien("armario", 30000);
        assertFalse(bien.bienValido());
    }
    
    
    @Test
    public void testClienteValido() {
        Cliente cliente = new Cliente(35000, 1970);
        assertTrue(cliente.clienteValido());
    }
    
    @Test
    public void testClienteNoValidoEdadMenor() {
        Cliente cliente = new Cliente(35000, 1500);
        assertFalse(cliente.clienteValido());
    }
    
    @Test
    public void testClienteNoValidoEdadMayor() {
        Cliente cliente = new Cliente(35000, 2100);
        assertFalse(cliente.clienteValido());
    }
    
    
    @Test
    public void testCalcularOfertaAdasles() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        Adasles adasles = new Adasles(bien, cliente);

        assertEquals(2400.0, adasles.calcularOferta(), 0.001);
    }
    
    @Test
    public void testCalcularComisionAdasles() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        Adasles adasles = new Adasles(bien, cliente);
        double oferta = adasles.calcularOferta();
        
        assertEquals(120,adasles.calcularComision() , 0.001);
    }
    
    
    @Test
    public void testCalcularOfertaMafro() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        Mafro mafro = new Mafro(bien, cliente);

        assertEquals(3600.0, mafro.calcularOferta(), 0.001);
    }
    
    @Test
    public void testCalcularComisionMafro() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        Mafro mafro = new Mafro(bien, cliente);
        double oferta = mafro.calcularOferta();
        
        assertEquals(108,mafro.calcularComision() , 0.001);
    }
    
    @Test
    public void testCalcularOfertaLineaIndirecta() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        LineaIndirecta lineaIndirecta = new LineaIndirecta(bien, cliente);

        assertEquals(4800.0, lineaIndirecta.calcularOferta(), 0.001);
    }
    
    @Test
    public void testCalcularComisionLineaIndirecta() {
        Bien bien = new Bien("vivienda", 120000);
        Cliente cliente = new Cliente(1970, 35000);
        LineaIndirecta lineaIndirecta = new LineaIndirecta(bien, cliente);
        double oferta = lineaIndirecta.calcularOferta();
        
        assertEquals(192,lineaIndirecta.calcularComision() , 0.001);
    }
    
    @Test
    public void testAutomatizado() {
        Bien bien = new Bien("vehiculo", 30000);
        Cliente cliente = new Cliente(15000, 2005);
        TecnicoComercial tecnico = new TecnicoComercial();
        Aseguradora[] aseguradoras = new Aseguradora[3];
        aseguradoras[0] = new LineaIndirecta(bien, cliente);
        aseguradoras[1] = new Mafro(bien, cliente);
        aseguradoras[2] = new Adasles(bien, cliente);
        
        
        assertEquals("LineaIndirecta | 900.0 | 9", tecnico.ofertaMasVentajosa(aseguradoras));
    }
    
}
