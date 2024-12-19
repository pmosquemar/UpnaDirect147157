package upnadirect147157;

/**
 *
 * @author alumno
 */
public class Bien {
    private String tipo;
    private int valor;

    public Bien(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public boolean bienValido(){
        if(tipo.equals("vehiculo")){
            if(valor <= 50000){
                return true;
            }
        }
        else if(tipo.equals("vivienda")){
            if(valor >= 50000){
                return true;
            }
        }
        
        return false;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
