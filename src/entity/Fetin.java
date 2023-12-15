package entity;

import exceptions.ProjetoDuplicadoException;
import exceptions.ProjetoNaoEncontradoException;

import java.util.HashMap;

public class Fetin {
    private HashMap<String, Double> projetos;

    public Fetin(){
        this.projetos = new HashMap<>();
    }

    public void adicionarProjeto(String nomeProjeto, double nota) throws ProjetoDuplicadoException{
        if (projetos.containsKey(nomeProjeto)) {
            throw new ProjetoDuplicadoException("Projeto duplicado: " + nomeProjeto);
        } else {
            projetos.put(nomeProjeto, nota);
        }
    }

    public double obterNota(String nomeProjeto) throws ProjetoNaoEncontradoException{
        if (projetos.containsKey(nomeProjeto)) {
            return projetos.get(nomeProjeto);
        } else {
            throw new ProjetoNaoEncontradoException("Projeto não encontrado: " + nomeProjeto);
        }
    }
}
