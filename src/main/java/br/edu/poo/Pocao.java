package br.edu.poo;

public class Pocao {

    private String nome;
    private int cura;

    public Pocao(String nome, int cura) {
        this.nome = nome;
        this.cura = cura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCura() {
        return this.cura;
    }
}
