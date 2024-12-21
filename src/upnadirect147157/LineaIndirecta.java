package upnadirect147157;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class LineaIndirecta implements Aseguradora{
    private TecnicoComercial tecnico;
    double oferta;

    public LineaIndirecta(TecnicoComercial tecnico){
        this.tecnico = tecnico;
    }

    
     @Override
    public double calcularOferta(){
        
        Bien bien;
        Cliente cliente;
        bien = tecnico.getBien();
        cliente = tecnico.getCliente();
        if((bien.getTipo().equals("vehiculo") && bien.getValor() < 20000) || (bien.getTipo().equals("vivienda") && bien.getValor() < 150000)){
            oferta = 0.04 * bien.getValor();
        }
        else if((bien.getTipo().equals("vehiculo") && bien.getValor() >= 20000) && (cliente.getAnioNacimiento() - LocalDate.now().getYear() > 60)){
            oferta = 0.06 * bien.getValor();
        }
        else{
            oferta = 0.04 * bien.getValor(); 
            
        }

        return oferta;
    }

    
     @Override
    public int calcularComisison(){
        int comision;
        if(oferta < 1000){
            comision = (int) Math.floor(0.01 * oferta);
        }
        else {
            comision = (int) Math.floor(0.03 * oferta);
        }
        return comision;
    }
}
