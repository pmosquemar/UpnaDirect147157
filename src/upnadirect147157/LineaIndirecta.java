package upnadirect147157;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class LineaIndirecta implements Aseguradora{
    private Bien bien;
    private Cliente cliente;
    double oferta;

    public LineaIndirecta(Bien bien, Cliente cliente) {
        this.bien = bien;
        this.cliente = cliente;
    }
    
    @Override
    public String getNombre(){
        return "LineaIndirecta";
    }

    @Override
    public double calcularOferta(){

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
