import entity.Fetin;
import exceptions.ProjetoDuplicadoException;
import exceptions.ProjetoNaoEncontradoException;

public class Main {
    public static void main(String[] args) {
        Fetin fetin = new Fetin();
        try {
            fetin.adicionarProjeto("ProjetoA", 9.5);
            fetin.adicionarProjeto("ProjetoB", 8.0);

            double notaProjetoA = fetin.obterNota("ProjetoA");
            System.out.println("Nota do ProjetoA: " + notaProjetoA);
        } catch (ProjetoDuplicadoException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.obterNota("ProjetoC");
        } catch (ProjetoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            fetin.adicionarProjeto("ProjetoA", 7.5);
        } catch (ProjetoDuplicadoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Depois de mostrar tudo, vou dormir! Tchau!");
    }
}

