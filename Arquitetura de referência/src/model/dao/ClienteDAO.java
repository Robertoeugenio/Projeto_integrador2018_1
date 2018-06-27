package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.javabean.Cliente;
import model.javabean.Usuario;


public class ClienteDAO implements DAO {

	public Cliente busca(String cpfCliente, String nomeCliente, String fazenda) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		Cliente cliente = null;
		try {
			stmt = con.createStatement();
			String sql = "SELECT agrohelp FROM Cliente where Cliente='"
			+ cpfCliente  + "' and nomecliente '"
			+ nomeCliente + "'and fazenda'"
			+ fazenda     + "'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
			    cpfCliente = rs.getString("ClienteAgrohelp");
				/*cliente = new Cliente(cpfCliente);
				
				nomeCliente = rs.getString("Cliente");
				cliente = new Cliente(nomeCliente);
				
				fazenda = rs.getString("Cliente");
				cliente = new Cliente(fazenda);
				*/
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
		return cliente;
	}

	@Override
	public Object recuperarPorId(Object id) {
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		//conectar com sgbd
		Connection con = FabricaDeConexoes.getConnection();
		//montar a consulta
		Statement stmt = null;
		Usuario usuario = null;
		try {
			stmt = con.createStatement();
			String sql = "insert into Cliente(cpf_cliente,nome_cliente,fazenda) "
					+ "values('"+((Cliente)entidade).getCpfCliente()+"','"+((Cliente)entidade).getNomeCliente()+"','"+((Cliente)entidade).getFazenda()+"');";
			stmt.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}
	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
