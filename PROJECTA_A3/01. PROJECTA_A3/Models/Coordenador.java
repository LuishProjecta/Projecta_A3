package br.com.projecta.models;

public class Coordenador extends Usuario {
    public Coordenador(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPapel() {
        return "Coordenador";
    }
}
