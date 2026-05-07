package model;

public class Equipe {

    private int id;
    private String nome;
    private String cidade;
    private String escudo;
    private String cnpj;

    public Equipe() {
    }

    public Equipe(int id, String nome, String cidade, String escudo, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.escudo = escudo;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
    public String getCnpj() {
    	return cnpj;
    }
    
    public void setCnpj(String cnpj) {
    	this.cnpj = cnpj;
    }
}