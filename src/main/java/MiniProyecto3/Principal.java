/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniProyecto3;

import Controller.CreateController;
import Controller.PrincipalController;
import Model.Create;
import View.CreateView;
import View.PrincipalView;

/**
 *
 * @author El Rey
 */
public class Principal {
    public static void main(String[] args) {
        
    //Instanciar todos los objetos de clases
    PrincipalView ventanaPrincipal = new PrincipalView();
    CreateView ventanaCrear = new CreateView();
    Create modeloCrear = new Create();
    //Instanciando el objeto de la clase Create Controller y pasandole como parametro lo mismo que estaba en su constructor
    //pero en esta clase se le pasa los objetos instanciados.
    CreateController controladorCrear = new CreateController(ventanaPrincipal, modeloCrear, ventanaCrear);
    ventanaPrincipal.setVisible(true);
    controladorCrear.iniciarPrograma();
    }
}
