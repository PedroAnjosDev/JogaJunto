package model;

import java.util.LinkedList;
import java.util.List;

public class Competicao {

    private int id;
    private String nome;
    private int ano;
    private  List<Partida> partidas;
    private String status;

    public Competicao() {
    }

    public Competicao(int id, String nome, int ano, String status) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.partidas = new LinkedList <Partida>();
        this.status = status;
    }

    public void adicionarPartida(
    		Partida partida) {
    	this.partidas.add(partida);
    }
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getStatus() {
        return status;
    }

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}