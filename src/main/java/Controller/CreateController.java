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
    
    private PrincipalView vistaPrincipal;
    private Create createModel;
    private CreateView vistaCrear;

    public CreateController(PrincipalView vistaPrincipal, Create createModel, CreateView vistaCrear) {
        this.vistaPrincipal = vistaPrincipal;
        this.createModel = createModel;
        this.vistaCrear = vistaCrear;
        vistaPrincipal.Agregar.addActionListener(this);
    }
    public void iniciarVistaCrear(){
        vistaCrear.setTitle("Agregar Usuarios");
        vistaCrear.setLocationRelativeTo(null);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        vistaPrincipal.dispose();
        vistaCrear.setVisible(true);
        createModel.setNombre(vistaCrear.campoNombre.getText());
        createModel.setApellido(vistaCrear.campoApellido.getText());
        createModel.setDireccion(vistaCrear.campoDireccion.getText());
        createModel.setCelular(Integer.parseInt(vistaCrear.campoCelular.getText()));
        createModel.setId(Integer.parseInt(vistaCrear.campoId.getText()));
        createModel.setNacimiento(vistaCrear.campoNacimiento.getText());
        //createModel.setNombre(vistaCrear.tipoUsuarioComboBox.getText());
    }
    
}
