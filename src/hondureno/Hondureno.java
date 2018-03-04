

package hondureno;

import java.util.Date;


public class Hondureno {
    
    protected String nombre, usuario, pwd,sexo,departamento,ciudad, direccion;
    protected int id;
    protected Date nacimiento;

    public Hondureno() {
    }

    public Hondureno(String nombre, String usuario, String pwd, String sexo, String departamento, String ciudad, String direccion, int id, Date nacimiento) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pwd = pwd;
        this.sexo = sexo;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.id = id;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Hondureno{" + "nombre=" + nombre + ", usuario=" + usuario + ", pwd=" + pwd + ", sexo=" + sexo + ", departamento=" + departamento + ", ciudad=" + ciudad + ", direccion=" + direccion + ", id=" + id + ", nacimiento=" + nacimiento + '}';
    }
    
    

}
