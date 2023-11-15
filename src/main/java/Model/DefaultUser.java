/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author El Rey
 */
public class DefaultUser {

    public DefaultUser(String Pnombre, String Snombre, String PrimerApellido, String SegundoApellido, String direccion, int celular, String rol, String nacimiento, int id) {
        this.Pnombre = Pnombre;
        this.Snombre = Snombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.direccion = direccion;
        this.celular = celular;
        this.rol = rol;
        this.nacimiento = nacimiento;
        this.id = id;
    }

    public String getPnombre() {
        return Pnombre;
    }

    public void setPnombre(String Pnombre) {
        this.Pnombre = Pnombre;
    }

    public String getSnombre() {
        return Snombre;
    }

    public void setSnombre(String Snombre) {
        this.Snombre = Snombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String Pnombre;
    private String Snombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String direccion;
    private int celular;
    private String rol;
    private String nacimiento;
    private int id;

}
