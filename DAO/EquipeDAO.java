package DAO;
import model.Equipe;

public interface EquipeDAO {
	
	public void create(Equipe e1); 
	
	Equipe read(int id);
	
	public void update(Equipe e1);
	
	public void delete(int id);

}
