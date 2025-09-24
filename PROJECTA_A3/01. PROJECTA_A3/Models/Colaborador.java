package br.com.projecta.models;

public class Colaborador extends Usuario {
    public Colaborador(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getPapel() {
        return "Colaborador";
    }
}
