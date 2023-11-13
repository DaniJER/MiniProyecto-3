/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author El Rey
 */
public class CuentasUsuarios {
    
    
        DefaultUser cl1 = new DefaultUser("Daniel", "001", 2000);
        DefaultUser cl2 = new DefaultUser("Jose", "002", 3000);
        DefaultUser cl3 = new DefaultUser("Enrique", "003", 4000);
        DefaultUser cl4 = new DefaultUser("Range", "004", 5000);
        DefaultUser cl5= new DefaultUser("Daniel", "001", 2000);

        
        Set <DefaultUser> clientesBanco = new HashSet<>();
        
        //Agregando los objetos de tipo cliente
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        //Recorrer collection
        for (DefaultUser cliente : clientesBanco) {
            
            System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());
            
        }
    }
    
}
