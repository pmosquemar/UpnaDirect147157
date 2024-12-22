package upnadirect147157;

import java.time.LocalDate;


/**
 *
 * @author alumno
 */
public class Adasles implements Aseguradora{
    private Bien bien;
    private Cliente cliente;
    double oferta;

    public Adasles(Bien bien, Cliente cliente) {
        this.bien = bien;
        this.cliente = cliente;
    }
    
    @Override
    public String getNombre(){
        return "Adasles";
    }

    @Override
    public double calcularOferta(){

        if(bien.getTipo().equals("vehiculo") && ((cliente.getAnioNacimiento() - LocalDate.now().getYear() < 20) || (cliente.getAnioNacimiento() - LocalDate.now().getYear() > 60))){
            oferta = 0.05 * bien.getValor();
        }
        
        else{
            oferta = 0.02 * bien.getValor(); 
        }

        return oferta;
    }

    @Override
    public int calcularComision(){
        int comision;
        if(oferta < 1000){
            comision = (int) Math.floor(0.01 * oferta);
        }
        else {
            comision = (int) Math.floor(0.05 * oferta);
        }
        return comision;
    }
}
