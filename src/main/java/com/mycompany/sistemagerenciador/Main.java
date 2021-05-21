
package com.mycompany.sistemagerenciador;

public class Main {
    
    public static void main(String[] args) {
        
        // Carregar a tela de login:
        new LoginTela().setVisible(true);
        
        // Teste de conexão com o banco:
        // new ConexaoDB().obtemConexao();
        
        // Teste do método 'existe()' da UsuarioDAO
//        UsuarioDAO uDAO = new UsuarioDAO();
//        
//        Usuario u = new Usuario();
//        u.setNome("andreia");
//        u.setSenha("1234");
//        
//        boolean retorno = uDAO.existe(u);
//        
//        System.out.println(retorno);
        
    }
    
}
