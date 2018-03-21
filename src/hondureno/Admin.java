

package hondureno;

import java.util.Date;


public class Admin extends Hondureno{

    public Admin() {
        super();
    }

    public Admin(String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
    }


    @Override
    public String toString() {
        return "Admin{" + '}'+super.nombre;
    }
    
    

}
