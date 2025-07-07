import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFIchaTecnica();

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a " + (meuFilme.getTotalDeAvaliacoes() +1) +"° avaliação do filme:\n-> ");
        double avaliacao1 = leitura.nextDouble();
        System.out.print("Digite a " + (meuFilme.getTotalDeAvaliacoes() +1)  + "° avaliação do filme:\n-> ");
        double avaliacao2 = leitura.nextDouble();
        meuFilme.avalia(avaliacao1);
        meuFilme.avalia(avaliacao2);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie("Lost",2004);
        serie.setTemporadas(6);
        serie.setEpisodiosPorTemporada(22);
        serie.exibeFIchaTecnica();
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar a sua série: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Mamma Mia");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDuracaoEmMinutos(108);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("Duração total do que você quer assistir: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaRafa = new Filme("Crepúsculo");
        filmeDaRafa.setDuracaoEmMinutos(130);
        //filmeDaRafa.setNome("Crepúsculo");
        filmeDaRafa.setAnoDeLancamento(2008);
        filmeDaRafa.avalia(10);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaRafa);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("O primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}