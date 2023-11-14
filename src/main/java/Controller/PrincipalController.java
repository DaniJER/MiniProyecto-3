/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.View;

/**
 *
 * @author El Rey
 */
public class PrincipalController implements ActionListener{
    private PrincipalView vistaPrincipal;

    public PrincipalController(PrincipalView vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.listarButton.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaPrincipal.setTitle("Usuarios");
        vistaPrincipal.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
