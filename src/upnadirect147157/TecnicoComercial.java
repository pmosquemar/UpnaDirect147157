package upnadirect147157;

/**
 *
 * @author alumno
 */
public class TecnicoComercial {
    private Cliente cliente;
    private Bien bien;

    public TecnicoComercial(Cliente cliente, Bien bien) {
        this.cliente = cliente;
        this.bien = bien;
    }
    
    public Bien obtenerBien(){
        return bien;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }
    
    
}
