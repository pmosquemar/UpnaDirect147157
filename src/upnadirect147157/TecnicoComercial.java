package upnadirect147157;

/**
 *
 * @author alumno
 */
public class TecnicoComercial {

    public TecnicoComercial() {
    }
    
    public String calcularOfertas(){
        Presentador presentador = new Presentador();
        Cliente cliente = presentador.datosCliente();
        Bien bien = presentador.datosBien();
        Aseguradora[] aseguradoras = new Aseguradora[3];
        aseguradoras[0] = new Mafro(bien, cliente);
        aseguradoras[1] = new LineaIndirecta(bien, cliente);
        aseguradoras[2] = new Adasles(bien, cliente);
        return ofertaMasVentajosa(aseguradoras);
    }

    public String ofertaMasVentajosa(Aseguradora[] aseguradoras) {
        Aseguradora aseguradora = aseguradoras[0];
        for(int i = 0; i < 2; i++){
            if(aseguradora.calcularOferta() > aseguradoras[i+1].calcularOferta()){
                aseguradora = aseguradoras[i+1];
            }
            else if((aseguradora.calcularOferta() == aseguradoras[i+1].calcularOferta()) && (aseguradora.calcularComision() > aseguradoras[i+1].calcularComision())){
                aseguradora = aseguradoras[i+1];
            }
        }
        return aseguradora.getNombre() + " | " + aseguradora.calcularOferta() + " | " + aseguradora.calcularComision();
    }
}
