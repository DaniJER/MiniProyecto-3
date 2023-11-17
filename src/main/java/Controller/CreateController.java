/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author El Rey
 */
public class CreateController implements ActionListener {
    //Crear variables de tipo clase
    private PrincipalView vistaPrincipal;
    private Create createModel;
    private CreateView vistaCrear;
    
    //Metodo contructor
    public CreateController(PrincipalView vistaPrincipal, Create createModel, CreateView vistaCrear) {
        this.vistaPrincipal = vistaPrincipal;
        this.createModel = createModel;
        this.vistaCrear = vistaCrear;
        //llamar el boton de la vista y añadirle el metodo ActionListener
        vistaPrincipal.Agregar.addActionListener(this); 
    }
    //Metodo que inicia la vista y establece los titulos y las dimensiones de las ventanas
    public void iniciarPrograma(){
        vistaPrincipal.setTitle("Gestion de usuarios");
        vistaPrincipal.setLocationRelativeTo(null);
        vistaCrear.setTitle("Agregar Usuarios");
        //vistaCrear.setLocationRelativeTo(null);
        
    }
    //Boton para las intrucciones del evento del boton "Crear".
    @Override
    public void actionPerformed(ActionEvent e) {
        //Cerrar la ventana principal el programa y abrir la ventana para crear un usuario
        vistaPrincipal.dispose();
        vistaCrear.setVisible(true);
        vistaCrear.setSize(vistaPrincipal.getWidth(), vistaPrincipal.getHeight());
        vistaCrear.setLocationRelativeTo(null);
        
        //Establecerle los valores a los campos de la vista crear.
        createModel.setNombre(vistaCrear.campoNombre.getText());
        createModel.setApellido(vistaCrear.campoApellido.getText());
        createModel.setDireccion(vistaCrear.campoApellido.getText());
        createModel.setCelular(Integer.parseInt(vistaCrear.campoApellido.getText()));
        createModel.setId(Integer.parseInt(vistaCrear.campoId.getText()));
        createModel.setNacimiento(vistaCrear.campoNacimiento.getText());
        //createModel.setNombre(vistaCrear.tipoUsuarioComboBox.getText());
    }
    
}
