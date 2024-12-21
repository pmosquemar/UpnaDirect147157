package upnadirect147157;

/**
 *
 * @author alumno
 */
public class TecnicoComercial {
   /* private Cliente cliente;
    private Bien bien;

    public TecnicoComercial(Cliente cliente, Bien bien) {
        this.cliente = cliente;
        this.bien = bien;
    }
    
    public Bien getBien(){
        return bien;
    }

    public Cliente getCliente() {
        return cliente;
    }*/
    
    public String CalcularOfertas(){
        Presentador presentador = new Presentador();
        Cliente cliente = presentador.datosCliente();
        Bien bien = presentador.datosBien();
        Aseguradora[] aseguradoras = new Aseguradora[3];
        aseguradoras[0] = new Mafro(bien, cliente);
        aseguradoras[1] = new LineaIndirecta(bien, cliente);
        aseguradoras[2] = new Adasles(bien, cliente);
        return OfertaMasVentajosa(aseguradoras);
    }

    private String OfertaMasVentajosa(Aseguradora[] aseguradoras) {
        Aseguradora aseguradora = aseguradoras[0];
        for(int i = 0; i < 2; i++){
            if(aseguradora.calcularOferta() > aseguradoras[i+1].calcularOferta()){
                aseguradora = aseguradoras[i+1];
            }
            else if((aseguradora.calcularOferta() == aseguradoras[i+1].calcularOferta()) && (aseguradora.calcularComisison() < aseguradoras[i+1].calcularComisison())){
                aseguradora = aseguradoras[i+1];
            }
        }
        return "La oferta más ventajose la propone la aseguradora: " + aseguradora.getNombre() + ". Con un importe de " + aseguradora.calcularOferta() + " y una comisión de " + aseguradora.calcularComisison();
    }
    
    
}
