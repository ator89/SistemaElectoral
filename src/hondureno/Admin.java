

package hondureno;

import java.util.Date;


public class Admin extends Usuario{

    public Admin() {
        super();
    }

    public Admin(String user, String password, String email, int tipo, String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(user, password, email, tipo, nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
    }

    @Override
    public String toString() {
        return "Admin{" + '}'+super.nombre;
    }
    
    

}
