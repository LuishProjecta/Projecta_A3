package br.com.projecta.models;

public class Tarefa {
    private String titulo;
    private String descricao;
    private StatusTarefa status;
    private Usuario responsavel;
    private Projeto projeto;

    public Tarefa(String titulo, String descricao, Projeto projeto, Usuario responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.projeto = projeto;
        this.responsavel = responsavel;
        this.status = StatusTarefa.PENDENTE; // padrão
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
