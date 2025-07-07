package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        Filme outroFilme = new Filme("Mamma Mia", 2008);
        var filmeDaRafa = new Filme("Crepúsculo", 2008);
        Serie serie = new Serie("Lost",2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaRafa);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());

        }
    }
}
