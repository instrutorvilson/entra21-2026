package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import interfaces.ICRUDGenerico;
import modelos.Cliente;
import utils.ConectaDB;

public class ClienteDao implements ICRUDGenerico<Cliente, Integer> {
	
	@Override
	public Cliente salvar(Cliente cliente) {

		String sql = "INSERT INTO cliente(nome, cpf, email, telefone, endereco) VALUES (?,?,?,?,?)";

		try (Connection con = ConectaDB.conectar();
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getEmail());
			ps.setString(4, cliente.getTelefone());
			ps.setString(5, cliente.getEndereco());

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();

			if (rs.next()) {
				cliente.setId(rs.getInt(1));
			}

			return cliente;

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar cliente.", e);
		}
	}

	@Override
	public void deletar(Integer id) {

		String sql = "DELETE FROM cliente WHERE id=?";

		try (Connection con = ConectaDB.conectar(); 
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void alterar(Cliente cliente) {

		String sql = """
				UPDATE cliente
				   SET nome=?,
				       cpf=?,
				       email=?,
				       telefone=?,
				       endereco=?
				 WHERE id=?
				""";

		try (Connection con = ConectaDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getEmail());
			ps.setString(4, cliente.getTelefone());
			ps.setString(5, cliente.getEndereco());
			ps.setInt(6, cliente.getId());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Cliente consultar(Integer id) {

		String sql = "SELECT * FROM cliente WHERE id=?";

		try (Connection con = ConectaDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				Cliente cliente = new Cliente();

				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEndereco(rs.getString("endereco"));

				return cliente;
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return null;
	}

	@Override
	public List<Cliente> consultar() {

		List<Cliente> lista = new ArrayList<>();

		String sql = "SELECT * FROM cliente ORDER BY nome";

		try (Connection con = ConectaDB.conectar();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {

				Cliente cliente = new Cliente();

				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEndereco(rs.getString("endereco"));

				lista.add(cliente);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return lista;
	}
}
