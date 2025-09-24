package br.com.projecta.services;

import java.util.ArrayList;
import java.util.List;

import br.com.projecta.models.Projeto;
import br.com.projecta.models.Usuario;

public class GestaoProjetos {
    private List<Projeto> projetos;

    public GestaoProjetos() {
        this.projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
        System.out.println("Projeto \"" + projeto.getTitulo() + "\" adicionado com sucesso!");
    }

    public void alocarUsuario(Projeto projeto, Usuario usuario) {
        projeto.adicionarUsuario(usuario);
        System.out.println(usuario.getNome() + " (" + usuario.getPapel() + ") foi alocado ao projeto \"" + projeto.getTitulo() + "\"");
    }

    public void listarProjetos() {
        System.out.println("\n--- Projetos cadastrados ---");
        for (Projeto p : projetos) {
            System.out.println("Título: " + p.getTitulo());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Equipe:");
            for (Usuario u : p.getEquipe()) {
                System.out.println(" - " + u.getNome() + " (" + u.getPapel() + ")");
            }
            System.out.println("-----------------------------");
        }
    }
}
