package br.com.alura.screenmatch.excecao;

public class ErroDeConversapDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversapDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
