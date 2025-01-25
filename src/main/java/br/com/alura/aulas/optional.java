package br.com.alura.desafios.springDataJpa;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        String s= "11a";
        Optional<Integer> numero = converteEmNumero(s);
        numero.ifPresent(n -> System.out.println(n));
        Integer orelse = numero.orElse(2);
        System.out.println(orelse);
    }

    //isPresent
    //get
    //ifPresent
    //orElse
    //orElseGet
    //orElseThrow

    public static Optional<Integer> converteEmNumero(String numeroStr) {

        try {
            Integer numero = Integer.valueOf(numeroStr);;
            return Optional.of(numero);
        }catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
