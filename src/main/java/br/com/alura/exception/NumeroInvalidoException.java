package br.com.alura.exception;

public class NumeroInvalidoException extends Exception{

    // Construtor padrão
    public NumeroInvalidoException() {
        super("Número inválido fornecido.");
    }

    // Construtor que permite passar uma mensagem personalizada
    public NumeroInvalidoException(String mensagem) {
        super(mensagem);
    }

    // Construtor que permite passar a mensagem e a causa (exceção original)
    public NumeroInvalidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
