/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.CreateController;
import View.PrincipalView;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class Create extends CreateController{
    private String nombre;
    private String apellido;
    private String nacimiento;
    private int celular;
    private String direccion;
    private int id;

    public Create(String nombre, String apellido, String nacimiento, int celular, String direccion, int id, PrincipalView vistaPrincipal) {
        super(vistaPrincipal);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.celular = celular;
        this.direccion = direccion;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
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
    
    public void almacenarUsuarios(){
    
        Set<Create> crearUsuarios = new HashSet<>();
        crearUsuarios.add(this);
    }
    
    public void mostrarCambiosGuardados(){
        
       JOptionPane.showMessageDialog(null,"Usuario guardado con exito");
        
    }
    
}
