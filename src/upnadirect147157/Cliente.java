package upnadirect147157;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Cliente {
    private int salario;
    private int anioNacimiento;

    public Cliente(int salario, int anioNacimiento) {
        this.salario = salario;
        this.anioNacimiento = anioNacimiento;
    }
    
    public boolean usuarioValido(){
        if(this.anioNacimiento > 1900 && this.anioNacimiento < LocalDate.now().getYear()){
            return true;
        }
        return false;
    }

    public int getSalario() {
        return salario;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }
}
