package br.com.projecta.models;

public abstract class Usuario {
    protected String nome;
    protected String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getPapel();
}
