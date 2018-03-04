

package hondureno;

import java.util.Date;


public class MiembroMesa extends Usuario{
    
    private String usuario, pwd;
    private int cargo;

    public MiembroMesa() {
        super();
    }

    public MiembroMesa(String user, String pwd, int cargo, String usuario, String password, String email, int tipo, String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(user, password, email, tipo, nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
        this.usuario = usuario;
        this.pwd = pwd;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.nombre + super.apellido;
    }

    
    
    

}
