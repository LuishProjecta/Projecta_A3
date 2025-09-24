package br.com.projecta;

import br.com.projecta.models.*;
import br.com.projecta.services.GestaoProjetos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bem-vindo ao Projecta ===");

        // Criando usuários
        Colaborador colab = new Colaborador("Ana", "ana@empresa.com");
        Gerente gerente = new Gerente("Carlos", "carlos@empresa.com");

        // Criando projeto
        Projeto projeto = new Projeto("Sistema de Gestão Interna", "Desenvolver um sistema interno para a empresa");

        // Gestão de projetos
        GestaoProjetos gestao = new GestaoProjetos();
        gestao.adicionarProjeto(projeto);
        gestao.alocarUsuario(projeto, colab);
        gestao.alocarUsuario(projeto, gerente);

        // Listando informações
        gestao.listarProjetos();
    }
}
