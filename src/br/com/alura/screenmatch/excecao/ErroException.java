package br.com.alura.screenmatch.excecao;

/**
 * ErroException
 */
public class ErroException extends RuntimeException {
    private String mensagem;


    public ErroException(String mensagem){
        this.mensagem = mensagem;

    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
