package br.com.alura.desafios.springDataJpa;

public class ex8 {
    public static void main(String[] args) {
        ex8CodigoErro erro = ex8CodigoErro.NOT_FOUND;

        System.out.println("Código: " + erro.getCodigo());
        System.out.println("Descrição: " + erro.getDescricao());
    }
}
