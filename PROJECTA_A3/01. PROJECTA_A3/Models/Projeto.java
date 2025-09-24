package br.com.projecta.models;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String titulo;
    private String descricao;
    private StatusProjeto status;
    private List<Usuario> equipe;

    public Projeto(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = StatusProjeto.PENDENTE; // padrão
        this.equipe = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    public List<Usuario> getEquipe() {
        return equipe;
    }

    public void adicionarUsuario(Usuario usuario) {
        equipe.add(usuario);
    }
}