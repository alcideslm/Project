/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tarefa.model.Usuario;

/**
 *
 * @author Alcides Lemos
 */
public class UsuarioDao extends GenericDao{
    
    private static UsuarioDao instance;
    public static UsuarioDao getInsance() {
        if (instance == null) {
            instance = new UsuarioDao();
        }
        return instance;
    }

    public UsuarioDao() {
        super();
        super.tabela = "cliente";
    }
    
    public boolean existeUsuario(Usuario usuario) {
        Usuario clientedb;
        try {
            clientedb = (Usuario) consultaPorEmail(usuario.getEmail());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("SenhaDB: " + clientedb.getSenha());
            System.out.println("" + clientedb.getSenha().equals(usuario.getSenha()));
            return clientedb.getSenha().trim().equals(usuario.getSenha().trim());
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar cliente no banco.");
            System.out.println(ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Object consultaPorEmail(String email) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object obj = null;

        try {
            ps = conn.getConnection().prepareStatement("SELECT * FROM " + tabela + " WHERE email = '" + email + "'");
            rs = conn.getResultset(ps);
            if (rs.next()) {
                obj = construirObjeto(rs);
            }   
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        } finally {
            rs.close();
            ps.close();
        }
        return obj;
    } 

    @Override
    protected Object construirObjeto(ResultSet rs) {
        Usuario usuario = new Usuario();
        try {
            usuario.setCod(rs.getInt("cod"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        return usuario;
    }

    @Override
    public void adicionar(Object obj, String tabela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
