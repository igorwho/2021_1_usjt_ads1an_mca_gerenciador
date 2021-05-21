
package com.mycompany.sistemagerenciador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe que manipula objetos (CRUD) do Java 
 * e registros MySQL do tipo 'Usuario'.
 */
public class UsuarioDAO {
    
    public boolean existe(Usuario usuario) {
        
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? "
                        + " AND senha = ?";
        
        try {

            Connection conn = ConexaoDB.obtemConexao();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getSenha());
            
            // Executando o comando 'SELECT'
            // e recebendo o retorno:
            ResultSet resultado = pst.executeQuery();
            
            // Tenta acessar os resultados:
            return resultado.next();
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
    
}
