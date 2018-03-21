

package hondureno;

import java.util.Date;


public class Magistrado extends Hondureno{

    public Magistrado() {
    }

    public Magistrado(String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
    }

    @Override
    public String toString() {
        return "Magistrado{" + super.nombre+'}';
    }
    
    

}
