package upnadirect147157;

/**
 *
 * @author alumno
 */
public abstract  class Aseguradora {
    private int comision;
    private int importe;
    private TecnicoComercial tecnico;

    public Aseguradora(int comision, int importe, TecnicoComercial tecnico) {
        this.comision = comision;
        this.importe = importe;
        this.tecnico = tecnico;
    }
    
    public abstract double calcularImporte(TecnicoComercial tecnico);
}
