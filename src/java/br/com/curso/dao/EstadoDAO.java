
package br.com.curso.dao;

import br.com.curso.utils.SingleConnection;
import java.sql.Connection;
import java.util.List;

public class EstadoDAO implements GenericDAO {
    
    private Connection conexao;
    
    public EstadoDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }

    @Override
    public Boolean cadastrar(Object Objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean inserir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean excluir(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> listar() {
         List<Object> resultado = new ArrayList<>();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         String sql = "Select * from estado order by idEstado";
         try {
             stmt = conexao.prepareStatement(sql);
             rs = stmt.executeQuery();
             while (rs.next()) {
                 Estado oEstado = new Estado();
                 oEstado.setIdEstado(rs.getInt("idEstado"));
                 oEstado.setNomeEstado(rs.getString("nomeestado"));
                 oEstado.setSiglaEstado(rs.getString("siglaestado"));
                 resultado.add(oEstado);
             }
         }
    }
    
}
