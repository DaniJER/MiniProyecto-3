/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniProyecto3;

import Controller.PrincipalController;
import View.PrincipalView;

/**
 *
 * @author El Rey
 */
public class Principal {
    public static void main(String[] args) {
    PrincipalView ventanaPrincipal = new PrincipalView();
    PrincipalController controladorPrincipal = new PrincipalController(ventanaPrincipal);
    }
}
