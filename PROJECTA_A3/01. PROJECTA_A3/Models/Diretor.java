package br.com.projecta.models;

public class Diretor extends Usuario {
    public Diretor(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPapel() {
        return "Diretor";
    }
}
