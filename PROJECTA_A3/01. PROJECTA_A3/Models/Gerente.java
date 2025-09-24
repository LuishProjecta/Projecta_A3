package br.com.projecta.models;

public class Gerente extends Usuario {
    public Gerente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPapel() {
        return "Gerente";
    }
}
