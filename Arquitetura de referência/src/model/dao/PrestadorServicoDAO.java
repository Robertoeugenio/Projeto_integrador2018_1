package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.dao.FabricaDeConexoes;
import model.javabean.PrestadorServico;

public class PrestadorServicoDAO implements DAO {

	public PrestadorServico busca(String cpfPrestador, String nomePrestador) {
		Connection con = FabricaDeConexoes.getConnection();
		Statement stmt = null;
		PrestadorServico prestadorServico = null;
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM prestador_de_servico where cpf_prestador='" + cpfPrestador
					+ "' and nome_prestador '" + nomePrestador + "'";

			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				cpfPrestador = rs.getString("ClienteAgrohelp");
				prestadorServico = new PrestadorServico(cpfPrestador, nomePrestador);
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
		return prestadorServico;
	}

	@Override
	public Object recuperarPorId(Object id) {
		return null;
	}

	@Override
	public void salvar(Object entidade) {
		// conectar com sgbd
		Connection con = FabricaDeConexoes.getConnection();
		// montar a consulta
		Statement stmt = null;
		PrestadorServico prestadorServico = null;
		try {
			stmt = con.createStatement();
			String sql = "insert into PrestadorServico(cpf_prestador,nome_Prestador) " + "values('"
					+ ((PrestadorServico) entidade).getCpfPrestador() + "','"
					+ ((PrestadorServico) entidade).getNomePrestador() + "','";
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
