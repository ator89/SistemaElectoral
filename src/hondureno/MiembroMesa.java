

package hondureno;

import java.util.Date;


public class MiembroMesa extends Hondureno{
    

    public MiembroMesa() {
        super();
    }

    public MiembroMesa(String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
    }

    @Override
    public String toString() {
        return super.nombre + super.apellido;
    }


}
