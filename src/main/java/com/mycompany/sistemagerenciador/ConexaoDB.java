
package com.mycompany.sistemagerenciador;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "banco_teste_mca_n";
    private static String usuario = "user";
    private static String senha = "ab123";
    
    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db, // endereço (URL)
                    usuario, // usuário
                    senha // senha
            );
            
            return c;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
