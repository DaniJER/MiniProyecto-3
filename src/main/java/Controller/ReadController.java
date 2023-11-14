/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.View;
import View.PrincipalView;
import Model.Read;

/**
 *
 * @author El Rey
 */
public class ReadController implements ActionListener{

    private PrincipalView vistaPrincipal;
    private Read readModel;

    public ReadController(PrincipalView vistaPrincipal, Read readModel) {
        this.vistaPrincipal = vistaPrincipal;
        this.readModel = readModel;
        this.vistaPrincipal.listarButton.addActionListener(this);
    }
    
    public void iniciarReadView(){
           
           
        //Aqui debe ir la ventana donde se leen todos los usuarios que estan agregados
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        //Cerramos la ventana principal y abrimos la ventana donde se veran todos los usuarios
       // dispose();
        //UsersView listaUsuarios = new UsersView();
    }
    
}
