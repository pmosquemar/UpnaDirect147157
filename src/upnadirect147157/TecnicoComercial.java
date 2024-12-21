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
    
    public Bien getBien(){
        return bien;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
}
