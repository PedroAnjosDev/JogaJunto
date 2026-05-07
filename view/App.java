package view;
import DAO.EquipeDAO;
import DAO.EquipeDAOImpl;

import model.Equipe;

public class App {

    public static void main(String[] args) {

        Equipe equipe1 = new Equipe();

        equipe1.setCnpj("504035235");
        equipe1.setNome("Real Jacareí");
        equipe1.setCidade("Jacareí");
        equipe1.setEscudo("https://a.espncdn.com/i/teamlogos/soccer/500/2674.png");

        EquipeDAO eDAO = new EquipeDAOImpl();
        
        eDAO.create(equipe1);

    }
}
