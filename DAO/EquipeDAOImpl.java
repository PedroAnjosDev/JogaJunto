package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DBConnection;
import model.Equipe;

public class EquipeDAOImpl implements EquipeDAO {

	@Override
	public void create(Equipe e1) {
		Connection conn = DBConnection.getInstance().getConnection();
		// TODO Auto-generated method stub
		String sql = "INSERT INTO equipe (nome, cidade, escudo, cnpj) VALUES (?, ?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, e1.getNome());
			stmt.setString(2, e1.getCidade());
			stmt.setString(3, e1.getEscudo());
			stmt.setString(4, e1.getCnpj());
			stmt.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}


	

	@Override
	public Equipe read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void update(Equipe e1) {
		// TODO Auto-generated method stub
				String sql = "UPDATE equipe SET nome = ?, cidade = ?, escudo = ?, cnpj = ? WHERE id = ?";
				sql = sql.replaceFirst("\\?", "'"+ e1.getNome()+ "'");
				sql = sql.replaceFirst("\\?", "'" + e1.getCidade() + "'");
				sql = sql.replaceFirst("\\?", "'" + e1.getEscudo() + "'");
				sql = sql.replaceFirst("\\?","'"+ e1.getCnpj()+ "'");
				sql = sql.replaceFirst("\\?", String.valueOf(e1.getId()));
				
				System.out.println(sql);
	}
	
	@Override
	public void delete(int id) {
        String sql = "DELETE FROM equipe WHERE id = ?";
        sql = sql.replaceFirst("\\?", String.valueOf(id));

        System.out.println(sql);
    }


}
	
	

	
	

