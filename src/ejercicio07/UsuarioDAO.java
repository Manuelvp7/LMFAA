/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author manuel
 */
public class UsuarioDAO {
 
    private static final String findByUserNameAndPassword = "Select * from Usuario where "
            + "nombreUsuario = ? and claveUsuario = ?";
    
    public Usuario login(String nombreUsuario, String claveUsuario){
        
        obtenerConexion();
                

                                
        
        return 
    }
            
        
}
