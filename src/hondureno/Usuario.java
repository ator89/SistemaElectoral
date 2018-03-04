

package hondureno;

import java.util.Date;


public class Usuario extends Hondureno{
    
    private String user, password, email;
    private int tipo;

    public Usuario() {
        super();
    }

    public Usuario(String user, String password, String email, int tipo, String nombre, String apellido, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        super(nombre, apellido, sexo, departamento, ciudad, direccion, id, nacimiento);
        this.user = user;
        this.password = password;
        this.email = email;
        this.tipo = tipo;
    }
    
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user=" + user + ", password=" + password + ", email=" + email + ", tipo=" + tipo + '}';
    }
    
    

}
